package test_scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import page_objects.MethodsAndLocators;

public class usdkStatisticSubmission extends DriverWrapper3 {

    @Test
    public void test_usdkStatSubmission() throws InterruptedException {

        MethodsAndLocators ml = new MethodsAndLocators();
        getDriver().get("https://billing-dashboard.msignia.com/_plugin/kibana/app/login?nextUrl=%2F_plugin%2Fkibana%2Fgoto%2F949ed5243da4e980af4b4c9b43267d10%3Fsecurity_tenant%3Dprivate");
        ml.enterUsdkStatUserName();
        ml.enterUsdkStatPass();
        ml.LoginUsdkStat();
        Thread.sleep(3000);
        ml.getNumberofHits();
        Thread.sleep(3000);
        //not working here
    }




}
