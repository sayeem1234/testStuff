package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class darkSkyDayTemp {
    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();


    @Given("^I am on Darksky Home Page$")
    public void iAmOnDarkSkyHomePage(){
        SharedSD.getDriver().navigate().to("https://darksky.net/forecast/40.7127,-74.0059/us12/en");
        Assert.assertEquals(loginPage.getApiText(),"Dark Sky API", "not on home page");
    }

    @When("^I expand today's timeline$")
    public void todaysTimeLine() throws InterruptedException {
        JavascriptExecutor jsScrollBy = (JavascriptExecutor)SharedSD.getDriver();
        jsScrollBy.executeScript("scrollBy(0,400);");
        Thread.sleep(2000);
        homePage.clickExpandButton();

    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void verifyTemp(){
        Assert.assertEquals(homePage.getLowTempBottom(), homePage.getLowTempTop());
        Assert.assertEquals(homePage.getHighTempBottom(), homePage.getHighTempTop()); }


}
