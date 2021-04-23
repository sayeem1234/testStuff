package page_objects;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import sun.rmi.runtime.Log;
import test_scripts.DriverWrapper3;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Time;
import java.time.Duration;
import java.util.ArrayList;

public class MethodsAndLocators extends BasePage {

    String hits = "";
    public static String transactionID_QA1_browser = "";
    public static String transactionID_QA9_browser = "";

    public static ArrayList<String> transactions_Array_QA1_browser = new ArrayList<>();
    public static ArrayList<String> transactions_Array_QA9_browser = new ArrayList<>();

    public static String transactionID_QA6_browser = "";
    public static ArrayList<String> transactions_Array_QA6_browser = new ArrayList<>();

    public static String transactionID_QA14_browser = "";
    public static ArrayList<String> transactions_Array_QA14_browser = new ArrayList<>();

    public static String transactionID_QA7_browser = "";
    public static ArrayList<String> transactions_Array_QA7_browser = new ArrayList<>();

    public static String transactionID_QA15_browser = "";
    public static ArrayList<String> transactions_Array_QA15_browser = new ArrayList<>();

    public static ArrayList<String> transactions_Array_id_cancelled= new ArrayList<>();
    public static String id_cancelled= "";


    public static String transactionID_QA21_browser = "";
    public static ArrayList<String> transactions_Array_QA21_browser = new ArrayList<>();


    public static String transactionID_QA21_browser_second = "";
    public static ArrayList<String> transactions_Array_QA21_browser_second = new ArrayList<>();

    public static String transactionID_QA8_browser = "";
    public static ArrayList<String> transactions_Array_QA8_browser = new ArrayList<>();

    public static String transactionID_QA16_browser = "";
    public static ArrayList<String> transactions_Array_QA16_browser = new ArrayList<>();

    public static String transactionID_QA5_browser = "";
    public static ArrayList<String> transactions_Array_QA5_browser = new ArrayList<>();

    public static String transactionID_QA13_browser = "";
    public static ArrayList<String> transactions_Array_QA13_browser = new ArrayList<>();


    //Locators
    private By emailTextField = By.id("email");
    private By passTextField = By.id("pass");
    private By loginButton = By.id("loginbutton");
    //private By firstName = By.xpath("//input[@name='firstname']"); //i edited this line
    private By lastName = By.xpath("//input[@name='lastname']");
    private By phoneNumber = By.xpath("//input[@name = 'reg_email__']");
    private By newPass = By.xpath("//input[@autocomplete='new-password']");
    private By signUpButton = By.xpath("//button[@id='u_0_13']");
    private By messengerButton = By.xpath("//a[@href='https://messenger.com/']");
    private By signInButton = By.xpath("//button[@value='1']");
    private By enterMobileOrEmail = By.xpath("//input[@id='u_0_r']");
    private By selectGender = By.xpath("//input[@type='radio']");
    private By searchBar = By.xpath("//label[@for='twotabsearchtextbox']");
    private By email = By.id("email");
    private By pass = By.id("pass");
    By firstName = By.name("firstname");
    By passWordResetLink =  By.linkText("Forgot account?");
    By passPartialReset = By.partialLinkText("Forgot");
    By tryPrime = By.linkText("Try Prime");
    By FreeDelivery = By.partialLinkText("Fast, FREE");
    By ShopBargain = By.partialLinkText("Bargain Finds");
    By newSign = By.xpath("//button[text()='Sign Up']");  //xpath using
    private By fandangoEmail = By.id("UsernameBox");
    private By fandangoPass = By.id("PasswordBox");
    private By fandangoSigninButton = By.xpath("//a[@id='ctl00_GlobalBody_SignOnControl_SignInButton']");
    private By nikeSignUp = By.xpath("//div[@id='AccountNavigationContainer']//span[text()='Join/Log In To Nike Member Profile']");
    private By nikeEmail = By.xpath("//input[@type='email']");  ////input[@type='email']
    private By neimanEmail = By.xpath("//input[@id='login_email']");
    private By neimanPass = By.xpath("//input[@type='password']");
    private By neimanSignInButton = By.xpath("//input[@id='signInBtn']");
    private By nemLogoutButton = By.xpath("//button[contains(text(),'Your Account')]");
    private By loginSuccess = By.xpath("//div[@id='globalSignin']//span[contains(@class,'myGlobalSignedIn')][contains(text(),'Hello')]");
    private By bloomEmail = By.xpath("//input[@id='email']");
    private By bloomPass = By.xpath("//input[@id='pw-input']");
    private By bloomSignIn = By.xpath("//button[@id='sign-in']");
    private By bloomSecurityAlert = By.xpath("//p[contains(text(),'technical issues. Please contact')]");
    private By spoofEmail = By.xpath("//input[@id='username']");
    private By spoofPass = By.xpath("//input[@id='password']");
    private By spoofLog = By.xpath("//input[@id='login']");
    private By makeCallButton = By.xpath("//img[@id='navMakeCall']");
    private By fromNum = By.xpath("//input[@name='fromNumber']");
    private By toNum = By.xpath("//input[@name='toNumber']");
    private By spoofNum = By.xpath("//input[@name='toCallerIDNumber']");
    private By placeCallButton = By.xpath("//button[text()='Place Call']");
    private By secondPlaceCallButton = By.xpath("//button[text()='Place Call']");
    private By testLocator = By.xpath("//h2[text()='Please Login']");
    private By FlatIronsEmail = By.xpath("//input[@id='InputEmail']");
    private By FlatIronsPass =  By.xpath("//input[@name='password']");
    private By LoginButton = By.xpath("//button[@id='btnLogin']");
    private By shoeButton = By.xpath("//button[@id='5d2a0af61358de000197b98a']");
    private By carButton = By.xpath("//div[@class='navbar-nav navbar-right hidden-xs']//span[@class='cartResponse'][contains(text(),'Cart')]");
    private By checkOutButton = By.xpath("//a[@id='checkOut']");
    private By goToPaymentButton= By.xpath("//button[@id='proceedToCheckout']");
    private By billingButton = By.xpath("//button[@id='billingInfo']");
    private By changeCards = By.xpath("//button[@id='changeCardsBtn']");
    private By changeCardBtn = By.xpath("//button[@title='Change Cards']");
    private By newCardButton = By.xpath("//button[@id='newCardBtn']");
    private By cardName = By.xpath("//input[@name='name']");
    private By cardNum = By.xpath("//input[@id='InputCardNumber']");
    private By useThisCardBtn = By.xpath("//button[@id='billingInfo']");
    private By goToBillingBtn = By.xpath("//button[@title=\"Go to Billing\"]");
    private By reviewOrderBtn = By.xpath("//button[@title=\"Review Order\"]");
    private By confirmOrderBtn = By.xpath("//button[@id=\"confirm-order\"]");
    private By transactionId = By.xpath("//a[contains(@class,'transaction-link')]");
    private By Belement = By.xpath("//*[name()='g']//*[name()='a'][13]"); //areq1
    private By Celement = By.xpath("//*[name()='g']//*[name()='a'][14]"); //areq2
    private By Delement = By.xpath("//*[name()='g']//*[name()='a'][15]"); //ares1
    private By Eelement = By.xpath("//*[name()='g']//*[name()='a'][16]"); //ares2
    private By logoutBtn = By.xpath("//a[@id='signOut']");
    private By AlertIcon = By.xpath("//h1[contains(text(),'Please select preferred payment method')]");
    private By OKbutton = By.xpath("//button[@id='dual-branded-popup-ok-button']");
    //locators for android trans IDs first test case
    private By firstAreq = By.xpath("//*[name()='g']//*[name()='a'][7]");
    private By secondAreq = By.xpath("//*[name()='g']//*[name()='a'][8]");
    private By firstAres = By.xpath("//*[name()='g']//*[name()='a'][9]");
    private By secondAres = By.xpath("//*[name()='g']//*[name()='a'][10]");
    private By thirdAres = By.xpath("//*[name()='g']//*[name()='a'][11]");
    private By fourthAres = By.xpath("//*[name()='g']//*[name()='a'][12]");
    private By forgot = By.partialLinkText("Forgot");
    private By fbEmail = By.xpath("//input[@id='email']");
    private By cancelTransactionBrowser = By.xpath("//a[text()='CANCEL']");


    //usdstatsubmission

    private By username_usdkstat = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    private By password_UsdkStat = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
    private By Login_UsdkStat = By.xpath("//span[contains(text(),'Log In')]");
    private By numberOfHits = By.xpath("//strong[contains(text(),'')]");


    public void getNumberofHits() throws InterruptedException {
        Thread.sleep(3000);


        hits += explicitWait(numberOfHits).getAttribute("textContent");
      //  hits = DriverWrapper3.getDriver().getTitle();
        System.out.println(hits);
    }

    public void enterUsdkStatUserName(){
        explicitWait(username_usdkstat).sendKeys("msignia");

    }

    public void enterUsdkStatPass(){
        explicitWait(password_UsdkStat).sendKeys("MsCmZqoyZutc&ZC2MvVJMEiu");

    }

    public void LoginUsdkStat(){
        explicitWait(Login_UsdkStat).click();

    }

    public void cancelTransaction(){
        explicitWait(cancelTransactionBrowser).click();
    }

    public void clickFBLOGIN(){
        setValue(fbEmail,"shadidul123@gmail.com");
    }

    public void clickForgot(){
        clickOn(forgot);
    }

    public void clickFirstMobileAreq(){
        clickOn(firstAreq);

    }
    public void clickSecondMobileAreq(){
        clickOn(secondAreq);

    }
    public void clickFirstMobileAres(){
        clickOn(firstAres);

    }
    public void clickSecondMobileAres(){
        clickOn(secondAres);

    }
    public void clickThirdMobileAres(){
        clickOn(thirdAres);

    }
    public void clickFourthMobileAres(){
        clickOn(fourthAres);

    }




    //jk
    private By ageButton = By.xpath("//button[contains(text(),'18')]");
    public void ConfirmAge(){
        clickOn(ageButton);
    }
    //methods

    public void clickOK(){
        clickOn(OKbutton);
    }

    public boolean hasAlert(){
        return isElementDisplayed(AlertIcon);
    }

    public void LogOut(){
        clickOn(logoutBtn);
    }


    // This is the most common wait function used in selenium
    public void syncWait() throws InterruptedException {
        Thread.sleep(5000);
    }
    public void fluentwait2(){
        webAction(checkOutButton);
    }
    public void fluentwait(){
        webAction(shoeButton);
    }



    public void clickC(){
        clickOn(Celement);
    }
    public void clickD(){
        clickOn(Delement);
    }
    public void clickE(){
        clickOn(Eelement);
    }

    public void clickB(){
        clickOn(Belement);
    }
    public void clickTransactionId(){
        clickOn(transactionId);
    }
    public void confirmOrder(){
        clickOn(confirmOrderBtn);
    }
    public void clickReviewOrder(){
        clickOn(reviewOrderBtn);
    }
    public void clickBillingButton(){
        clickOn(goToBillingBtn);
    }
    public void clickUseThisCardBtn(){
        clickOn(useThisCardBtn);
    }
    public void enterCardNumber(String cardNumber){
        setValue(cardNum, cardNumber);
    }
    public void enterCardName(String name){
        setValue(cardName,name);
    }
    public void clickNewCardButton(){
        clickOn(newCardButton);
    }
    public void clickChangeCards(){
        clickOn(changeCardBtn);
    }
    public void clickBilling(){
        clickOn(billingButton);
    }
    public void clickGoToPayment(){
        clickOn(goToPaymentButton);
    }
    public void clickCheckOut(){
        clickOn(checkOutButton);
    }
    public void clickCartButton(){
        clickOn(carButton);
    }
    public void clickShoeButton(){
        clickOn(shoeButton);
    }
    public void clickLogin(){
        clickOn(LoginButton);
    }
    public void enterFlatIronPassword(String password){
        setValue(FlatIronsPass,password);
    }
    public String getText(){
        return getValueFromElement(testLocator);
    }
    public void enterFlatIronEmail(String email){
        setValue(FlatIronsEmail, email);
    }


    //spoofmethods
    public void cursorFromNum(){
        clickOn(fromNum);
    }
    public void cursorSpoofNum(){
        clickOn(spoofNum);
    }
    public void cursortoNum(){
        clickOn(toNum);
    }

    public void finalCall(){
        clickOn(secondPlaceCallButton);
    }
    public void placeCall(){
        clickOn(placeCallButton);
    }
    public void enterFromNum(String value){
        setValue(fromNum,value);

    }

    public void enterSpoofNum(String value){
        setValue(spoofNum,value);
    }

    public void enterToNum(String value){
        setValue(toNum,value);
    }
    public void clickCall(){
        clickOn(makeCallButton);
    }
    public void enterSpoofEmail(String value){
        setValue(spoofEmail,value);
    }
    public void enterSpoofPass(String value){
        setValue(spoofPass, value);
    }
    public void clickSpoofLogIn(){
        clickOn(spoofLog);
    }

    //bloom functions

    public void enterBloomEmail(String value){
        setValue(bloomEmail, value);
    }

    public void enterBloomPass(String value){
        setValue(bloomPass,value);
    }

    public void clickBloom(){
        clickOn(bloomSignIn);
    }

    public boolean isBloomSecurity(){
        return isElementDisplayed(bloomSecurityAlert);
    }
    public boolean logOutNeiman(){
        return isElementDisplayed(loginSuccess);
    }


    private By fbSignUpButton = By.xpath("//h2[text()='Sign Up']");

    //method

    public boolean isFbButtonDisplayed(){
        return  isElementDisplayed(fbSignUpButton);
    }


    //nike methods

    public void clickNikeSignUp(){
        clickOn(nikeSignUp);
    }
    public void enterNikeEmail(String value){
        setValue(nikeEmail,value);
    }



    //fandango stuff
    public void enterNeimanEmail(String Value){
        setValue(neimanEmail, Value);
    }
    public void enterNeimanPass(String Value){
        setValue(neimanPass, Value);
    }

    public void clickSigninNeiman(){
        clickOn(neimanSignInButton);
    }

    //nike methods










    //Methods
    public void enterEmail(String value){
        setValue(emailTextField, value);
    }

    public void enterPassword(String value) {
        setValue(passTextField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public void clickSignUpButton(){
        clickOn(signUpButton);
    }


    // i am adding these method below

    public void enterName(String value) {
        setValue(firstName,value);

    }

    public void enterLName(String value){
        setValue(lastName, value);
    }

    public void enterNumber(String value){
        setValue(phoneNumber, value);
    }

    public void enterNewPass(String value){
        setValue(newPass, value);
    }

    public void EnterNumber(String value){
        setValue(phoneNumber, value);
    }

    public void clickMessenger(){
        clickOn(messengerButton);

    }

    public void clickSignINbutton(){
        clickOn(signInButton);
    }

    public void enterMobileorEmailButton(String value){
        setValue(enterMobileOrEmail, value);

    }
    public void clickGender(){
        clickOn(selectGender);
    }
    public void enterSearchAmazon(String value){
        setValue(searchBar, value);
    }

    public void enterEmailById(String value){
        setValue(email,value);

    }
    public void enterPass(String Value){
        setValue(pass,Value);
    }
    public void enterFirstName(String Value){
        setValue(firstName, Value);
    }
    public void assReset(){
        clickOn(passPartialReset);
    }
    public void clickPrime(){
        clickOn(tryPrime);
    }
    public void FreeDelivery(){
        clickOn(FreeDelivery);
    }
    public void shopBargain(){
        clickOn(ShopBargain);
    }


    public void clearField(){
        DriverWrapper3.getDriver().findElement(lastName).clear();
        DriverWrapper3.getDriver().findElement(firstName).clear();
        DriverWrapper3.getDriver().findElement(phoneNumber).clear();
        DriverWrapper3.getDriver().findElement(enterMobileOrEmail).clear();
        DriverWrapper3.getDriver().findElement(newPass).clear();

    }


    public boolean isLoginButtonDisplayed(){
        return isElementDisplayed(loginButton);
    }





// Sample App Browser Locators


    private By uSDKinitMessage = By.xpath("//div[@id='message']");
    private By backendAddressCTQA = By.xpath("//input[@id='backend-url']");
    private By emailCTQA = By.xpath("//input[@id='email']");
    private By CardNumberCTQA = By.xpath("//input[@id='acct-number']");
    private By transactionIDURL = By.xpath("*//a");
    private By radioButtonDSmSigniaRSA = By.xpath("//input[@value='MSIGNIA_MOCK_DS_RSA']");
    private By OKButtonAFterSelectingDS = By.xpath("//button[text()='OK']");
    private By CancelButtonAFterSelectingDS = By.xpath("//button[text()='CANCEL']");
    private By radioButtonDSmSigniaEC = By.xpath("//input[@value='MSIGNIA_MOCK_DS_EC']");
    private By SixDigitTextBoxField = By.xpath("//input[@id='userDataEntry']");
    private By SixDigitTextSubmitButton = By.xpath("//button[@id='verify-challenge-btn']");
    private By SmithButton = By.xpath("//label[contains(text(),'Smith')]");
    private By chicagoButton = By.xpath("//label[contains(text(),'Chicago')]");


    public void clickChicagoButton(){
        explicitWait(chicagoButton).click();
    }

    public void clickSmithButton(){
        clickOn(SmithButton);
    }

    public void expClickSmith(){
        //explicitWaitClick(SmithButton);
        explicitWait(SmithButton).click();
    }

    public void ClearFieldFluently(){
        webAction(CardNumberCTQA).clear();
    }




    public void clickSubmitforSixDigitPassCode(){
       // clickOn(SixDigitTextSubmitButton);

        explicitWait(SixDigitTextSubmitButton).click();
    }


    public void enterSixDigitPassCode(){

        explicitWait(SixDigitTextBoxField).sendKeys("123abc");
//        setValue(SixDigitTextBoxField,"123abc");
    }




    public void clickCancelDsValue(){
        clickOn(CancelButtonAFterSelectingDS);
    }



    public void clickOKafterSelectingDS(){
        clickOn(OKButtonAFterSelectingDS);
    }


    public void clickmSigniaRsa(){
        clickOn(radioButtonDSmSigniaRSA);
    }

    public void clickmSigniaRSAEXP(){
        explicitWait(radioButtonDSmSigniaRSA).click();
    }

    public void clickmSigniaEC(){
        clickOn(radioButtonDSmSigniaEC);
    }

    public void checkElem4(){
        explicitWait(radioButtonDSmSigniaEC);
    }


    public void getTransactionIdTextValue() {

        transactionID_QA1_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA1_browser.add(transactionID_QA1_browser);


//        for (String id : transactions_Array_QA1_browser) {
//            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/qa1.txt"), id.getBytes());
//
//        }


    }



    public void getTransactionIdTextValue_CCcancelled() throws IOException {

        id_cancelled += getValueFromElement(transactionIDURL);
        transactions_Array_id_cancelled.add(id_cancelled);


        for (String id : transactions_Array_id_cancelled) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/challengecancel.txt"), id.getBytes());

        }


    }


    public void getTransactionIdTextValueQA9() throws IOException {

        transactionID_QA9_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA9_browser.add(transactionID_QA9_browser);


        for (String id : transactions_Array_QA9_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/FrictionlessFlow/q9.txt"), id.getBytes());

        }


    }

    public void getTransactionIdTextValueQA8_rsa() throws IOException {

        transactionID_QA8_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA8_browser.add(transactionID_QA8_browser);


        for (String id : transactions_Array_QA8_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/DUALBRANDED/q8browser_rsa.txt"), id.getBytes());

        }


    }


    public void getTransactionIdTextValueQA8_ec() throws IOException {

        transactionID_QA8_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA8_browser.add(transactionID_QA8_browser);


        for (String id : transactions_Array_QA8_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/DUALBRANDED/q8browser_ec.txt"), id.getBytes());

        }


    }

    public void getTransactionIdTextValueQA16_rsa() throws IOException {

        transactionID_QA16_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA16_browser.add(transactionID_QA16_browser);


        for (String id : transactions_Array_QA16_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/DUALBRANDED/q16browser_rsa.txt"), id.getBytes());

        }


    }



    public void getTransactionIdTextValueQA16_ec() throws IOException {

        transactionID_QA16_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA16_browser.add(transactionID_QA16_browser);


        for (String id : transactions_Array_QA16_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/DUALBRANDED/q16browser_ec.txt"), id.getBytes());

        }


    }



    public void getTransactionIdTextValueQA5() throws IOException {

        transactionID_QA5_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA5_browser.add(transactionID_QA5_browser);


        for (String id : transactions_Array_QA5_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/qa5.txt"), id.getBytes());

        }


    }

    public void getTransactionIdTextValueQA13() throws IOException {

        transactionID_QA13_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA13_browser.add(transactionID_QA13_browser);


        for (String id : transactions_Array_QA13_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/qa13.txt"), id.getBytes());

        }


    }


    public void getTransactionIdTextValueQA6() throws IOException {

        transactionID_QA6_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA6_browser.add(transactionID_QA6_browser);


        for (String id : transactions_Array_QA6_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/qa6.txt"), id.getBytes());

        }


    }

    public void getTransactionIdTextValueQA14() throws IOException {

        transactionID_QA14_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA14_browser.add(transactionID_QA14_browser);


        for (String id : transactions_Array_QA14_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/qa14.txt"), id.getBytes());

        }


    }


    public void getTransactionIdTextValueQA7() throws IOException {

        transactionID_QA7_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA7_browser.add(transactionID_QA7_browser);


        for (String id : transactions_Array_QA7_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/qa7.txt"), id.getBytes());

        }


    }


    public void getTransactionIdTextValueQA15() throws IOException {

        transactionID_QA15_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA15_browser.add(transactionID_QA15_browser);


        for (String id : transactions_Array_QA15_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/qa15.txt"), id.getBytes());

        }


    }

    public void getTransactionIdTextValueQA21() throws IOException {

        transactionID_QA21_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA21_browser.add(transactionID_QA21_browser);


        for (String id : transactions_Array_QA21_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/SCA/qa21.txt"), id.getBytes());

        }


    }


    public void getTransactionIdTextValueQA21_secondtime() throws IOException {

        transactionID_QA21_browser_second += getValueFromElement(transactionIDURL);
        transactions_Array_QA21_browser_second.add(transactionID_QA21_browser_second);


        for (String id : transactions_Array_QA21_browser_second) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/SCA/qa21_second.txt"), id.getBytes());

        }


    }


    public void getTransactionIdTextValueQA1() throws IOException {

        transactionID_QA1_browser += getValueFromElement(transactionIDURL);
        transactions_Array_QA1_browser.add(transactionID_QA1_browser);


        for (String id : transactions_Array_QA1_browser) {
            Files.write(Paths.get("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/FrictionlessFlow/qa1.txt"), id.getBytes());

        }


    }


    public void changeBackEndAddress(){
//        DriverWrapper3.getDriver().findElement(backendAddressCTQA).clear();
//        setValue(backendAddressCTQA,"https://qa-merchant-backend.ct.msignia.com");

    explicitWaitClear(backendAddressCTQA);
    explicitWait(backendAddressCTQA).sendKeys("https://qa-merchant-backend.ct.msignia.com");



    }

    public boolean isuSDKMessageDisplayed(){
        return isElementDisplayed(uSDKinitMessage);
    }


    public void checkElement(){
        explicitWait(backendAddressCTQA);
    }


    public boolean isbackendAddressDisplayed(){
        return isElementDisplayed(backendAddressCTQA);
    }

    public boolean isemailCTQaDisplayed(){
        return isElementDisplayed(emailCTQA);
    }

    public boolean isCardNumberCTQADisplayed(){
        return isElementDisplayed(CardNumberCTQA);
    }

    public void clearCardTextField(){
        DriverWrapper3.getDriver().findElement(CardNumberCTQA).clear();
    }

    public void clearCardTextFieldExplicitly(){
        explicitWaitClear(CardNumberCTQA);




    }

    public void clearCardTextFieldFluentWait(){
        fluentWaitClear(CardNumberCTQA);
    }

    public void iFrameExpWait(){
        explicitWaitFrame("challenge-iframe");
    }

    public void fluentwaitFrame(){
        fluentWaitFrame("challenge-iframe");
    }

    public void enterCardNumberCTQA(String cc){
        //setValue(CardNumberCTQA,cc);

        explicitWait(CardNumberCTQA).sendKeys(cc);


    }

    private By performTransactionButton = By.xpath("//button[contains(text(),'Perform')]");

    public void clickPerformTransaction(){
        //clickOn(performTransactionButton);

        explicitWait(performTransactionButton).click();



    }

    private By TransactionComplete = By.xpath("//a[contains(@href,\"transactions\")]");

    public boolean isTransactionCompleteMessageDisplayed(){


        explicitWait(TransactionComplete);


        return isElementDisplayed(TransactionComplete);

    }

    public void checkElem3(){
        explicitWait(TransactionComplete);
    }

    public void checkElement2(){
        explicitWait(TransactionComplete);


    }






}
