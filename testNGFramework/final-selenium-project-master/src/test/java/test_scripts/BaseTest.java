package test_scripts;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BaseTest {

    public static ThreadLocal<ChromeDriver> driver = new ThreadLocal<>();


    public String sampleAppUrl = "file:///Users/Fayeem/Desktop/Sample%20Apps%2011-12-2020/6.4.76%20sample%20apps/Browser/BRW-3ds-sample-web-app-6.4.76-rel.4/index.html";

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/Fayeem/Downloads/chromedriver");
        driver.set(new ChromeDriver());
    }


    public WebDriver getDriver(){
        return driver.get();
    }

    @AfterMethod
    public void tearDown(){
        getDriver().quit();

    }



    String QA_Scenario_1 = "/Users/Fayeem/Desktop/SampleAPPJSONFILES/QA1Browser.json";
    String QA_Scenario_5 = "/Users/Fayeem/Desktop/SampleAPPJSONFILES/qa5BROWSER.json";
    String QA_Scenario_6 = "/Users/Fayeem/Desktop/SampleAPPJSONFILES/qa6BROWSER.json";
    String QA_Scenario_7 = "/Users/Fayeem/Desktop/SampleAPPJSONFILES/QA7BROWSER.json";
    String QA_Scenario_8 = "/Users/Fayeem/Desktop/SampleAPPJSONFILES/qa8Browser.json";
    String QA_Scenario_9 = "/Users/Fayeem/Desktop/SampleAPPJSONFILES/QA9BROWSER.json";
    String QA_Scenario_13 = "/Users/Fayeem/Desktop/SampleAPPJSONFILES/QA13Browser.json";
    String QA_Scenario_14 = "/Users/Fayeem/Desktop/SampleAPPJSONFILES/QA14Browser.json";
    String QA_Scenario_16 = "/Users/Fayeem/Desktop/SampleAPPJSONFILES/QA16Browser.json";
    String QA_Scenario_21 = "/Users/Fayeem/Desktop/SampleAPPJSONFILES/QA21BROWSER.json";
    String QA_Scenario_15 = "/Users/Fayeem/Desktop/SampleAPPJSONFILES/QABrowser15.json";



    @DataProvider(name = "QAScenario1")
    public Object[] readJson1() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(QA_Scenario_1)));
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



    @DataProvider(name = "QAScenario5")
    public Object[] readJson2() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(QA_Scenario_5)));
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



    @DataProvider(name = "QAScenario6")
    public Object[] readJson6() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(QA_Scenario_6)));
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

    @DataProvider(name = "QAScenario7")
    public Object[] readJson7() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(QA_Scenario_7)));
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


    @DataProvider(name = "QAScenario8")
    public Object[] readJson8() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(QA_Scenario_8)));
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


    @DataProvider(name = "QAScenario9")
    public Object[] readJson9() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(QA_Scenario_9)));
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




    @DataProvider(name = "QAScenario13")
    public Object[] readJson13() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(QA_Scenario_13)));
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


    @DataProvider(name = "QAScenario15")
    public Object[] readJson15() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(QA_Scenario_15)));
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




    @DataProvider(name = "QAScenario14")
    public Object[] readJson14() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(QA_Scenario_14)));
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

    @DataProvider(name = "QAScenario16")
    public Object[] readJson16() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(QA_Scenario_16)));
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


    @DataProvider(name = "QAScenario21")
    public Object[] readJson21() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(QA_Scenario_21)));
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













}
