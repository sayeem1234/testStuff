//package test_scripts;
//
//import org.json.simple.parser.JSONParser;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.*;
//
//import java.io.FileReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class DriverWrapper {
//    public static WebDriver driver;
//
//    String flatIronsUrl = "https://qa-merchant-frontend.app.msignia-rnd.tech/login";
//    String fbUrl = "https://www.facebook.com/";
//    private static String url = "https://qa-transaction-details.app.msignia-rnd.tech/transactions/27d9ff70-caca-46a9-98e9-d458f2b4500e";
//
//    @BeforeClass
//    public void beforeClass() throws MalformedURLException {
//       // setChromedriver
//        System.setProperty("webdriver.chrome.driver", "/Users/Fayeem/Desktop/chromedriver");
//       // init webdriver object
//        driver = new ChromeDriver();
//        //navigate to the url
//        driver.navigate().to(fbUrl);
//    }
//
//    //String br, String vr, String pf
//
//
//
//
//    @AfterClass
//    public void afterClass() {
//        driver.quit();
//    }
//    public  static WebDriver getDriver() {
//        return driver;
//    }
//
//
//}
