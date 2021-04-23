//package test_scripts;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import page_objects.LandingPage;
//import page_objects.VerifyPage;
//
//public class TransactionPAGE extends DriverWrapper {
//    @Test
//    public void test() throws InterruptedException {
//        LandingPage landingPage = new LandingPage();
//        VerifyPage verifyPage = new VerifyPage();
//        getDriver().manage().window().maximize();
//        Thread.sleep(6000);
//        landingPage.clickB();
//        Thread.sleep(4000);
//        Assert.assertEquals(verifyPage.aReq(),"\"2.2.0\"");
//
//    }
//}
