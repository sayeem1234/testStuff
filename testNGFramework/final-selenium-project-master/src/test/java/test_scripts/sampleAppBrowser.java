package test_scripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.AssertionsPage;
import page_objects.MethodsAndLocators;

import java.io.IOException;


public class sampleAppBrowser extends DriverWrapper3{


    //TODO: Browser Frictionless Flow QA Scenario 1,9

    @Test
    public void FrictionlessFlow_01() throws InterruptedException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        //Thread.sleep(2000);
        ml.checkElement();
        boolean a = ml.isbackendAddressDisplayed();
        boolean b = ml.isemailCTQaDisplayed();
        boolean c = ml.isCardNumberCTQADisplayed();
        boolean d = ml.isuSDKMessageDisplayed();
        Assert.assertTrue(a&&b&&c&&d);

    }

    @Test(dataProvider = "QAScenario1")
    public void FrictionlessFlowQA1(String cardNumber) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(cardNumber);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.checkElement2();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA1();
        //store the transaction id for api test
        //make sure no duplicates of transaction id array logic
    }


    @Test(dataProvider = "QAScenario9")
    public void FrictionlessFlow_02QA9(String cardNumber) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(cardNumber);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.checkElement2();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA9();
        //store the transaction id for api test
        //make sure no duplicates of transaction id array logic
    }

   // TODO: Browser Dual Card Submission Flow QA Scenario 8,16

    @Test(dataProvider = "QAScenario8")
    public void QA8_rsa(String cardNumber) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(cardNumber);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.clickmSigniaRSAEXP();
        ml.clickOKafterSelectingDS();
        ml.checkElem3();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA8_rsa();
        //store the transaction id for api test
        //make sure no duplicates of transaction id array logic
    }

    @Test(dataProvider = "QAScenario16")
    public void QA16_rsa(String cardNumber) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(cardNumber);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.clickmSigniaRSAEXP();
        ml.clickOKafterSelectingDS();
        ml.checkElem3();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA16_rsa();
    }



    @Test(dataProvider = "QAScenario8")
    public void Dual_cancel_qa8(String cardNumber) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(cardNumber);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.clickmSigniaRSAEXP();
        ml.clickCancelDsValue();
        ml.checkElem3();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
       // ml.getTransactionIdTextValueQA8_rsa();
        //store the transaction id for api test
        //make sure no duplicates of transaction id array logic
    }

    @Test(dataProvider = "QAScenario16")
    public void Dual_cancel(String cardNumber) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(cardNumber);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.clickmSigniaRSAEXP();
        ml.clickCancelDsValue();
        ml.checkElem3();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());

    }



    @Test(dataProvider = "QAScenario8")
    public void QA_8_EC(String cardNumber) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(cardNumber);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.checkElem4();
        ml.clickmSigniaEC();
        ml.clickOKafterSelectingDS();
        ml.checkElem3();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA8_ec();
    }

    @Test(dataProvider = "QAScenario16")
    public void QA_16_EC(String cardNumber) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(cardNumber);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.checkElem4();
        ml.clickmSigniaEC();
        ml.clickOKafterSelectingDS();
        ml.checkElem3();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA16_ec();
    }

    //TODO: Challenge Card Submission Flow QA Scenario 5-7,13-15

    //Qa Scenario = 5,13
    @Test(dataProvider = "QAScenario5")
    public void QA5(String ccNum) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(ccNum);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.iFrameExpWait();
        ml.enterSixDigitPassCode();
        ml.clickSubmitforSixDigitPassCode();
        Thread.sleep(5000);
        getDriver().switchTo().defaultContent();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA5();

        //store the transaction id for api test
        //make sure no duplicates of transaction id array logic
    }

    @Test(dataProvider = "QAScenario13")
    public void QA13(String ccNum) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(ccNum);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.iFrameExpWait();
        ml.enterSixDigitPassCode();
        ml.clickSubmitforSixDigitPassCode();
        Thread.sleep(5000);
        getDriver().switchTo().defaultContent();
        Thread.sleep(4000);
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA13();

        //store the transaction id for api test
        //make sure no duplicates of transaction id array logic
    }







    //Qa Scenario = 6,14
    @Test(dataProvider = "QAScenario6")
    public void QA6(String ccNum) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(ccNum);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.iFrameExpWait();
        ml.expClickSmith();
       ml.clickSubmitforSixDigitPassCode();
        Thread.sleep(5000);
       getDriver().switchTo().defaultContent();
      Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA6();

    }


    @Test(dataProvider = "QAScenario14")
    public void QA14(String ccNum) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(ccNum);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.iFrameExpWait();
        ml.expClickSmith();
        ml.clickSubmitforSixDigitPassCode();
        Thread.sleep(5000);
        getDriver().switchTo().parentFrame();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA14();

    }






    //Qa Scenario = 7,15
    @Test(dataProvider = "QAScenario7")
    public void QA7(String ccNum) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(ccNum);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.iFrameExpWait();
        ml.clickChicagoButton();
        ml.clickSubmitforSixDigitPassCode();
        Thread.sleep(5000);
        getDriver().switchTo().defaultContent();
      Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA7();
    }


    @Test(dataProvider = "QAScenario15")
    public void QA15(String ccNum) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(ccNum);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.iFrameExpWait();
        ml.clickChicagoButton();
        ml.clickSubmitforSixDigitPassCode();
        Thread.sleep(5000);
        getDriver().switchTo().defaultContent();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA15();
    }




    //Qa Scenario = 5-7,13-15
    @Test(dataProvider = "QAScenario5")
    public void CCS_Cancelled(String ccNum) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(ccNum);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
        ml.iFrameExpWait();
        ml.cancelTransaction();
        Thread.sleep(7000);
        getDriver().switchTo().defaultContent();
       // Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValue_CCcancelled();


        //store the transaction id for api test
    }

    //TODO: Browser Strong Consumer Authentication Flow QA Scenario 21


    @Test(dataProvider = "QAScenario21")
    public void SCA_02(String cardNumber) throws InterruptedException, IOException {

        MethodsAndLocators ml = new MethodsAndLocators();
        AssertionsPage AP = new AssertionsPage();
        getDriver().navigate().to(sampleAppUrl);
        getDriver().manage().window().maximize();
        ml.clearCardTextFieldExplicitly();
        ml.enterCardNumberCTQA(cardNumber);
        ml.changeBackEndAddress();
        ml.clickPerformTransaction();
       Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA21();

        ml.clickPerformTransaction();
        Assert.assertTrue(ml.isTransactionCompleteMessageDisplayed());
        ml.getTransactionIdTextValueQA21_secondtime();





        //store the transaction id for api test
        //make sure no duplicates of transaction id array logic
    }


}
