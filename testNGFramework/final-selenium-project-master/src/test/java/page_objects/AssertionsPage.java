package page_objects;

import org.openqa.selenium.By;

public class AssertionsPage extends BasePage {


    //this page is to capture error messages.
    //Locators
    private By messageVersion = By.xpath("//span[contains(text(),'\"messageVersion\"')]/parent::span/following-sibling::span/span");
//    private By aReqTwo = By.xpath("//span[contains(text(),'\"messageVersion\"')]/parent::span/following-sibling::span/span");
//    private By aRes = By.xpath("//span[contains(text(),'\"messageVersion\"')]/parent::span/following-sibling::span/span");
//    private By aResTwo = By.xpath("//span[contains(text(),'\"messageVersion\"')]/parent::span/following-sibling::span/span");


    private By mobileMessageVersion = By.xpath("//span[contains(text(),'\"messageVersion\"')]/parent::span/following-sibling::span/span");

    //Methods
    public String aReq(){
        return getValueFromElement(messageVersion);

    }
    public String aReq2(){
        return getValueFromElement(messageVersion);

    }
    public String aRes(){
        return getValueFromElement(messageVersion);

    }
    public String aRes2(){
        return getValueFromElement(messageVersion);

    }
    public String messageVersion(){
        return getValueFromElement(messageVersion);
    }

}
