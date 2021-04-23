package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.testng.Assert;

public class darkskySignUpSD {

    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();


    @Given("^I am on the sign-up page$")
    public void iAmOnSignUpPage(String value){
        homePage.clickDarkSkyApi();
        homePage.clickDarkSkySignUp();
        Assert.assertEquals(loginPage.getRegisterHeader(),"Register");

    }

    @When("^I click on (.+) button$")
    public void clickRegisterButton(String value){
        homePage.clickDarkSkyRegister();

    }

    @Then("^I verify I am on (.+) by asserting (.+)$")
    public void invalidRegistration(String value1, String value2){
        Assert.assertEquals(loginPage.getRegisterHeader(),"Register");

    }





}
