package test_scripts;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page_objects.AssertionsPage;
import page_objects.MethodsAndLocators;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class flatIrons extends DriverWrapper3 {

    //this code reads all the CreditCards from the JSON file and sorts them in an array, arr
    //airtable-> postman -> json data -> read them here

    @DataProvider(name = "dp")
    public Object[] readJson() throws IOException {
        String fileName = "/Users/Fayeem/Desktop/frictionlessBROWSER(2.1.0).json";
        String contents = new String(Files.readAllBytes(Paths.get(fileName)));
        JSONObject o = new JSONObject(contents);
        JSONArray studentDetails = o.getJSONArray("records");
        String[] arr = new String[studentDetails.length()];
        for (int i = 0; i < studentDetails.length(); i++) {
            JSONObject studentName = (JSONObject) studentDetails.get(i);
            JSONObject secondObj = (JSONObject) studentName.get("fields");
            String cardNumber = (String) secondObj.get("Card Range");
            arr[i] = cardNumber;
        }

        return arr;

    }

      /*
      This code is for reading the Transaction IDs from the MOBILE transactions
        and then running the transaction Details UI (qa front end)
        */

    //obtained from manual c/p transation ids

    @DataProvider(name = "dataProvider")
    public Object[] readMobileTransactionIDS() throws IOException {
        String fileName = "/Users/Fayeem/Desktop/transactionIDS.txt";
        String[] transactionIDS = new String[30];
        FileInputStream stream = new FileInputStream(fileName);
        BufferedReader brr = new BufferedReader(new InputStreamReader(stream));
        String id;
        int i = 0;
        while ((id = brr.readLine()) != null) {
            transactionIDS[i] = id;
            i += 1;
        }
        return transactionIDS;
    }

    @Test(dataProvider = "dp")
    //Test case #1 device=browser specVersion = 2.1.0 challengeType=null
    public void test_01(String data) throws InterruptedException {
        AirtableCredentials airtableCredentials = new AirtableCredentials();

        getDriver().navigate().to(flatIronsUrl);
        MethodsAndLocators ML = new MethodsAndLocators();
        //LandingPage landingPage = new LandingPage();
        //VerifyPage verifyPage = new VerifyPage();
        AssertionsPage AP = new AssertionsPage();
        getDriver().manage().window().maximize();
        ML.enterFlatIronEmail(airtableCredentials.getEmail());
        ML.enterFlatIronPassword(airtableCredentials.getPassword());
        ML.clickLogin();
        ML.syncWait();
        ML.clickShoeButton();
        ML.clickCartButton();
        ML.clickCheckOut();
        ML.syncWait();
        ML.clickGoToPayment();
        ML.syncWait();
        ML.enterCardName("tt");
        ML.enterCardNumber(data); // Here the card # entered
        ML.syncWait();
        ML.clickUseThisCardBtn();
        ML.syncWait();
        ML.clickBillingButton();
        ML.clickReviewOrder();
        ML.confirmOrder();
        ML.syncWait();
        if (ML.hasAlert()) {
            ML.clickOK();
        }
        ML.syncWait();
        ML.clickTransactionId();
        List<String> windows = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windows.get(1));
        ML.syncWait();
        ML.clickB();
        ML.syncWait();
        Assert.assertEquals(AP.aReq(), "\"2.1.0\"");
        ML.clickC();
        ML.syncWait();
        Assert.assertEquals(AP.aReq2(), "\"2.1.0\"");
        ML.clickD();
        ML.syncWait();
        Assert.assertEquals(AP.aRes2(), "\"2.1.0\"");
        ML.clickE();
        ML.syncWait();
        Assert.assertEquals(AP.aRes2(), "\"2.1.0\"");
        ML.syncWait();
        getDriver().close();
        getDriver().switchTo().window(windows.get(0));
        Actions action = new Actions(getDriver());
        WebElement logOut = getDriver().findElement(By.xpath("//div[@class='search-box']//div[@class='input-group account']//a[@class='btn btn-nobg']"));
        action.moveToElement(logOut).build().perform();
        Thread.sleep(2000);
        ML.LogOut();
        ML.syncWait();

    }


    @Test(dataProvider = "dataProvider")
    public void test_02(String transactionID) throws InterruptedException {
        String baseUrl = "https://qa-transaction-details.app.msignia-rnd.tech/transactions/";
        //LandingPage landingPage = new LandingPage();
        MethodsAndLocators ML = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(baseUrl + transactionID);
        Thread.sleep(2000);
        ML.clickFirstMobileAreq();
        ML.syncWait();
        Assert.assertEquals(AP.messageVersion(), "\"2.1.0\"");
        ML.clickSecondMobileAreq();
        ML.syncWait();
        Assert.assertEquals(AP.messageVersion(), "\"2.1.0\"");
        ML.clickFirstMobileAres();
        ML.syncWait();
        Assert.assertEquals(AP.messageVersion(), "\"2.1.0\"");
        ML.clickSecondMobileAres();
        ML.syncWait();
        Assert.assertEquals(AP.messageVersion(), "\"2.1.0\"");
        ML.clickThirdMobileAres();
        ML.syncWait();
        Assert.assertEquals(AP.messageVersion(), "\"2.1.0\"");
        ML.clickFourthMobileAres();
        ML.syncWait();
        Assert.assertEquals(AP.messageVersion(), "\"2.1.0\"");

    }


}