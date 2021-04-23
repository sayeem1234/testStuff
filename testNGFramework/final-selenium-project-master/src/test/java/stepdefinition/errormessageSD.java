//package stepdefinition;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import framework.webPages.HomePage;
//import framework.webPages.LoginPage;
//import org.testng.Assert;
//
//public class errormessageSD {
//
//    private HomePage homePage = new HomePage();
//    private LoginPage loginPage = new LoginPage();
//
//    @Given("^Incorrect credentials$")
//    public void wrongInfo(){
//        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Wrong info");
//    }
//
//    @When("^I enter (p+) into the text field$")   //+ means >= 1 occurence of a number
//    public void enterNum(String number){
//        Assert.assertEquals(SharedSD.getDriver().getTitle(), "fdsafsd");
//    }
//
//    @When("^I click (.+)$")
//    public void signIn(String button){
//        switch (button){
//            case "login":
//                homePage.clickOnLoginButton();
//                break;
//            case "password":
//                homePage.clickOnFemaleGender();
//                break;
//            case "username":
//                homePage.clickOnMessengerLink();
//                break;
//
//        }
//    }
//}
