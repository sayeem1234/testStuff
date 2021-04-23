package framework.webPages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

	private By pageHeader = By.xpath("//*[@id='content']/div/div/div[1]/span");

	private By registerHeader = By.xpath("//h1[text()='Register']");
	private By darkSkyApiButton = By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
	
	public String getPageHeader() {
		
		return getTextFromElement(pageHeader);
	}

	public String getApiText(){
		return getTextFromElement(darkSkyApiButton);
	}

	public String getRegisterHeader(){
		return getTextFromElement(registerHeader);
	}
}
