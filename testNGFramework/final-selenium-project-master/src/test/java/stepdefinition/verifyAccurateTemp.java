package stepdefinition;

import cucumber.api.java.en.Then;
import framework.webPages.BasePage;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class verifyAccurateTemp extends BasePage {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Then("^I verify current temp is between the lowest and highest temps from daily timeline$")
    public void testTemp(){
        String[] currentTemp = homePage.todaysTemp().split("˚"); // isolate the temp value from other words
        int todaysTemp = Integer.parseInt(currentTemp[0]); //turn into int

        //forloop how to implement here??
        //finding the temperature and then getting rid of the extra stuff to strip out the int value
        ArrayList<String> temps = new ArrayList<>();
        String[] a = homePage.getTemp1().split("˚");
        temps.add(a[0]);
        String[] b = homePage.getTemp2().split("˚");
        temps.add(b[0]);
        String[] c = homePage.getTemp3().split("˚");
        temps.add(c[0]);
        String[] d = homePage.getTemp4().split("˚");
        temps.add(d[0]);
        String[] e = homePage.getTemp5().split("˚");
        temps.add(e[0]);
        String[] f = homePage.getTemp6().split("˚");
        temps.add(f[0]);
        String[] g = homePage.getTemp7().split("˚");
        temps.add(g[0]);
        String[] h = homePage.getTemp8().split("˚");
        temps.add(h[0]);
        String[] i = homePage.getTemp9().split("˚");
        temps.add(i[0]);
        String[] j = homePage.getTemp10().split("˚");
        temps.add(j[0]);
        String[] k = homePage.getTemp11().split("˚");
        temps.add(k[0]);
        String[] l = homePage.getTemp12().split("˚");
        temps.add(l[0]);

        int[] temperatures = new int[12]; //creating an int array of all temperatures by turning the string into ints
        int x = 0;
        for(String temp:temps){
            int t = Integer.parseInt(temp);
            temperatures[x] = t;
            x++;
        }

        //finding max and min temp values
        int maxTemp = temperatures[0];
        int minTemp = temperatures[0];
        for(int index = 1; index<temperatures.length;index++){
            if(temperatures[index] > maxTemp){
                maxTemp = temperatures[index];
            }
            if(temperatures[index] < minTemp){
                minTemp = temperatures[index];
            }
        }

        //assert that the current DarkSkyTemp is between the max and min temps
        Assert.assertTrue(todaysTemp > minTemp && todaysTemp < maxTemp);













//        Arrays.asList(homePage.getTemp1().split("˚"),homePage.getTemp2.)




        //get the values
        //store into array
        //spit them back out
        //


    }
}
