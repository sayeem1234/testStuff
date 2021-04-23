package stepdefinition;

import cucumber.api.java.en.Then;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tempTimeLine {
    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();

    @Then("^I verify timeline is displayed with 2 hours incremented$")
    public void verify2hourincrement(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h"); //format date to get only the hour value
        LocalDateTime today = LocalDateTime.now();//get current time
        LocalDateTime update = today.plusHours(2); //update current time by 2 hours
        ArrayList<String> allTimes = new ArrayList<>();
        allTimes.add(formatter.format(update));// adds 2 hours from now into array

        //keep updating the time by 2hours then add to array
        for (int x = 0; x<10; x++){
            update = update.plusHours(2);
            String times = formatter.format(update);
            allTimes.add(times);
        }
        List<String> darkSkyTimes = Arrays.asList(homePage.getTime1(), homePage.getTime2(),homePage.getTime3(),homePage.getTime4(),homePage.getTime5(),homePage.getTime6(),homePage.getTime7(),homePage.getTime8(),homePage.getTime9(),homePage.getTime10(),homePage.getTime11());

        // the two times should be same
        for(int i = 0; i<11; i++){
            Assert.assertEquals(allTimes.get(i), darkSkyTimes.get(i));
        }

        //plan
        //get current time
        //create an array with 2 hours increments from current time
        //create second array with the webelement times
        //for any index , i, firstarray[i] should equal secondarray[i]








    }



}
