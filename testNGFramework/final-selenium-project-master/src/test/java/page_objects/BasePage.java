package page_objects;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import stepdefinition.SharedSD;
import org.openqa.selenium.support.ui.WebDriverWait;
import test_scripts.DriverWrapper3;

import java.sql.Driver;
import java.time.Duration;

public class BasePage {

    // This is the most common wait function used in selenium
    public static WebElement webAction(final By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverWrapper3.getDriver())
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
                .withMessage(
                        "Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        return element;
    }

    public WebElement explicitWait(By locator){

        WebElement aboutMe;
        WebDriverWait wait = new WebDriverWait(DriverWrapper3.getDriver(),25);
        //aboutMe = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));


        aboutMe = wait.until(ExpectedConditions.presenceOfElementLocated(locator));


        return aboutMe;
    }




    public void explicitWaitClear(By locator){
        WebDriverWait wait = new WebDriverWait(DriverWrapper3.getDriver(),20);
        WebElement aboutMe;
        aboutMe = wait.until(ExpectedConditions.elementToBeClickable(locator));
        aboutMe.clear();
    }


    public void fluentWaitClear(By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverWrapper3.getDriver())
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
                .withMessage(
                        "Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        element.clear();
    }











    public void explicitWaitClick(By locator){
        WebDriverWait wait = new WebDriverWait(DriverWrapper3.getDriver(),20);
        WebElement aboutMe;
        aboutMe = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        aboutMe.click();
    }



    public void fluentWaitClick(By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverWrapper3.getDriver())
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
                .withMessage(
                        "Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        element.click();
    }









    public void test(){
        WebDriverWait wait = new WebDriverWait(DriverWrapper3.getDriver(),20);
        WebDriver aboutMe;
        aboutMe = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("ff"));
        DriverWrapper3.getDriver().switchTo().frame("dd");
    }



    public void explicitWaitFrame(String frameID){
        WebDriverWait wait = new WebDriverWait(DriverWrapper3.getDriver(),20);
        WebElement aboutMe;
        aboutMe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(frameID)));
        DriverWrapper3.getDriver().switchTo().frame(frameID);



    }






    public void fluentWaitFrame(String frameID){



        {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverWrapper3.getDriver())
                    .withTimeout(Duration.ofSeconds(12))
                    .pollingEvery(Duration.ofMillis(200))
                    .ignoring(NoSuchElementException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .ignoring(ElementClickInterceptedException.class)
                    .withMessage(
                            "Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

            WebElement element = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(By.id(frameID));
                }
            });

            DriverWrapper3.getDriver().switchTo().frame(frameID);

        }


    }



    public void clickOn(By locator) {
        DriverWrapper3.getDriver().findElement(locator).click();
    }

    public void setValue(By locator, String value) {
        DriverWrapper3.getDriver().findElement(locator).sendKeys(value);
    }


    public String getValueFromElement(By locator) {
        return DriverWrapper3.getDriver().findElement(locator).getText();
    }

    public boolean isElementDisplayed(By locator){
        boolean isDisplayed;
        try{
            isDisplayed = DriverWrapper3.getDriver().findElement(locator).isDisplayed();
        }
        catch(NoSuchElementException e){
            isDisplayed = false;
        }
        return isDisplayed;

    }

    public boolean isElementSelected(By locator){
        boolean isSelected;
        isSelected= DriverWrapper3.getDriver().findElement(locator).isSelected();
        return isSelected;

    }

    public boolean isElementEnabled(By locator){
        boolean isEnabled;
        isEnabled = DriverWrapper3.getDriver().findElement(locator).isEnabled();
        return isEnabled;
    }



}

