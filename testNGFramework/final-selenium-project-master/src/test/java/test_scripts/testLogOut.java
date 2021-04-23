//package test_scripts;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
//import page_objects.LandingPage;
//
//public class testLogOut extends DriverWrapper {
//    @Test
//    public void test() throws InterruptedException {
//        getDriver().get(flatIronsUrl);
//        LandingPage landingPage = new LandingPage();
//        AirtableCredentials ac = new AirtableCredentials();
//        getDriver().manage().window().maximize();
//        landingPage.enterFlatIronEmail(ac.getEmail());
//        landingPage.enterFlatIronPassword(ac.getPassword());
//        landingPage.clickLogin();
//        landingPage.syncWait();
//        Actions actions = new Actions(getDriver());
//        WebElement logOutIcon = getDriver().findElement(By.xpath("//div[@class='search-box']//div[@class='input-group account']//a[@class='btn btn-nobg']"));
//        actions.moveToElement(logOutIcon).build().perform();
//        Thread.sleep(2000);
//        landingPage.LogOut();
//
//
//    }
//}
