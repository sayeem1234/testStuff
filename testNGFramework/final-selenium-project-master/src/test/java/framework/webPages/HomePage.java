package framework.webPages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	private By firstNameTextField = By.id("firstName");
	private By lastNameTextField = By.id("lastName");
	private By mobileNumberTextField = By.id("mobileNumber");
	private By newPasswordTextField = By.id("newPwd");
	private By errorMessage = By.id("errorMessage");
	private By femaleGender = By.id("u_0_9");
	private By maleGender = By.id("u_0_a");
	private By messengerLink = By.id("");

	//darkSkyStuff
	private By darkSkyApiButton = By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
	private By darkSkySignUpButton = By.xpath("//a[@class='button filled']");
	private By darkSkyEmail = By.xpath("//input[@placeholder='hacker@example.com']");
	private By darkSkyPass = By.xpath("//input[@name='password']");
	private By darkSkyPassConfirm = By.xpath("//input[@name='confirmation']");
	private By darkSkyRegisterButton = By.xpath("//button[contains(text(),'Register')]");
	private By expandButton = By.xpath("//a[1]//span[3]//span[1]//*[local-name()='svg']//*[name()='circle' and contains(@class,'cls-1')]");

	private By lowTempBottom = By.xpath("/html[1]/body[1]/div[7]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]"); //used abs xpath
	private By lowTempTop = By.xpath("/html[1]/body[1]/div[7]/a[1]/span[2]/span[1]");
	private By HighTempBottom = By.xpath("/html[1]/body[1]/div[7]/div[2]/div[1]/div[2]/div[1]/span[3]/span[1]");
	private By HighTempTop = By.xpath("/html[1]/body[1]/div[7]/a[1]/span[2]/span[3]");
	private By Time1 = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/span[3]/span[1]");
	private By Time2 = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/span[5]/span[1]");
	private By Time3 = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/span[7]/span[1]");
	private By Time4 = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/span[9]/span[1]");
	private By Time5 = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/span[11]/span[1]");
	private By Time6 = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/span[13]/span[1]");
	private By Time7 = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/span[15]/span[1]");
	private By Time8 = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/span[17]/span[1]");
	private By Time9 = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/span[19]/span[1]");
	private By Time10 = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/span[21]/span[1]");
	private By Time11 = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/span[23]/span[1]");

	private By todaysTemp = By.xpath("//span[@class='summary swap']");

	public By temp1 = By.xpath("//span[contains(text(),'40°')]");
	public By temp2 = By.xpath("//span[contains(text(),'39°')]");
	public By temp3 = By.xpath("//div[@class='temps']//span[3]//span[1]");
	public By temp4 = By.xpath("//span[4]//span[1]");
	public By temp5 = By.xpath("//span[contains(text(),'43°')]");
	public By temp6 = By.xpath("//span[contains(text(),'48°')]");
	public By temp7 = By.xpath("//span[contains(text(),'52°')]");
	public By temp8 = By.xpath("//span[contains(text(),'56°')]");
	public By temp9 = By.xpath("//span[contains(text(),'54°')]");
	public By temp10 = By.xpath("//span[10]//span[1]");
	public By temp11 = By.xpath("//div[@class='temps']//span[11]//span[1]");
	public By temp12 = By.xpath("//span[12]//span[1]");


	public String todaysTemp(){
		return getTextFromElement(todaysTemp);
	}
	public String getTemp1(){
		return getTextFromElement(temp1);
	}
	public String getTemp2(){
		return getTextFromElement(temp2);
	}
	public String getTemp3(){
		return getTextFromElement(temp3);
	}
	public String getTemp4(){
		return getTextFromElement(temp4);
	}
	public String getTemp5(){
		return getTextFromElement(temp5);
	}
	public String getTemp6(){
		return getTextFromElement(temp6);
	}
	public String getTemp7(){
		return getTextFromElement(temp7);
	}
	public String getTemp8(){
		return getTextFromElement(temp8);
	}
	public String getTemp9(){
		return getTextFromElement(temp9);
	}
	public String getTemp10(){
		return getTextFromElement(temp10);
	}
	public String getTemp11(){
		return getTextFromElement(temp11);
	}
	public String getTemp12(){
		return getTextFromElement(temp12);
	}




	public String getTime1(){
		return getTextFromElement(Time1);
	}
	public String getTime2(){
		return getTextFromElement(Time2);
	}
	public String getTime3(){
		return getTextFromElement(Time3);
	}
	public String getTime4(){
		return getTextFromElement(Time4);
	}
	public String getTime5(){
		return getTextFromElement(Time5);
	}
	public String getTime6(){
		return getTextFromElement(Time6);
	}
	public String getTime7(){
		return getTextFromElement(Time7);
	}
	public String getTime8(){
		return getTextFromElement(Time8);
	}
	public String getTime9(){
		return getTextFromElement(Time9);
	}
	public String getTime10(){
		return getTextFromElement(Time10);
	}
	public String getTime11(){
		return getTextFromElement(Time11);
	}





	public String getLowTempBottom(){
		return getTextFromElement(lowTempBottom);
	}

	public String getLowTempTop(){
		return getTextFromElement(lowTempTop);
	}

	public String getHighTempTop(){
		return getTextFromElement(HighTempTop);
	}
	public String getHighTempBottom(){
		return getTextFromElement(HighTempBottom);
	}




    public void clickExpandButton(){
    	clickOn(expandButton);
	}
	public void clickDarkSkyApi(){
		clickOn(darkSkyApiButton);
	}
	public void clickDarkSkySignUp(){
		clickOn(darkSkySignUpButton);
	}
	public void clickOnLoginButton() {
		clickOn(loginButton);
	}
	public void clickDarkSkyRegister(){
		clickOn(darkSkyRegisterButton);
	}

	public void enterDarkSkyEmail(String value){
		setValue(darkSkyEmail,value);
	}
	public void enterDarkSkyPass(String pass){
		setValue(darkSkyPass,pass);
	}
	public void enterDarkSkyPassConfirm(String pass){
		setValue(darkSkyPassConfirm,pass);
	}

	public void enterEmail(String enterEmail) {
		setValue(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		setValue(passwordTextField, enterPassword);
	}

	public void enterFirstName(String firstName) {
		setValue(firstNameTextField, firstName);
	}

	public void enterLastName(String lastName) {
		setValue(lastNameTextField, lastName);
	}

	public void enterMobileNumber(String mobileNum) {
		setValue(mobileNumberTextField, mobileNum);
	}

	public void enterNewPassword(String password) {
		setValue(newPasswordTextField, password);
	}

	public String getErrorMessage() {
		return getTextFromElement(errorMessage);
	}

	public boolean isGenderFemaleSelected() {
		return isElementSelected(femaleGender);
	}

	public void clickOnFemaleGender() {
		clickOn(femaleGender);
	}

	public boolean isGenderMaleSelected() {
		return isElementSelected(maleGender);
	}

	public void clickOnMaleGender() {
		clickOn(maleGender);
	}

	public void clickOnMessengerLink() {
		clickOn(messengerLink);
	}







}
