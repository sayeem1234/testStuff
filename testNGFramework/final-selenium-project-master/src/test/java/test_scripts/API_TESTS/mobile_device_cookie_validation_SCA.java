package test_scripts.API_TESTS;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mobile_device_cookie_validation_SCA {

    @Test
    public void QA_17CookieValidation_() throws IOException {

        //reading cookies from file 1
        BufferedReader cookie_Reader_file1 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa17cookies.txt"));
        String paragraph = cookie_Reader_file1.readLine();
        //System.out.println(text);
        String[] CookieArray1 = paragraph.split("(?<=\\G....................................)");

        //reading cookies from file 2
        BufferedReader cookie_Reader_file2 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa17cookies2.txt"));
        String paragraph2 = cookie_Reader_file2.readLine();
        //System.out.println(text);
        String[] CookieArray2 = paragraph.split("(?<=\\G....................................)");

        //validating the cookies array are both equal in size
        Assert.assertEquals(CookieArray2.length, CookieArray1.length, "cookieArray1 size != cookieArray2 size");
        System.out.println("QA17  # of cookies = " + CookieArray1.length);

        //validating the cookies are equal in both transactions
        for (int i = 0; i < CookieArray1.length; i++) {
            Assert.assertEquals(CookieArray2[i], CookieArray1[i], CookieArray1[i] + "!=" + CookieArray2[i]);

        }
    }

    @Test
    public void QA_17_1_CookieValidation_() throws IOException {

        //reading cookies from file 1
        BufferedReader cookie_Reader_file1 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa17_1cookies1.txt"));
        String paragraph = cookie_Reader_file1.readLine();
        //System.out.println(text);
        String[] CookieArray1 = paragraph.split("(?<=\\G....................................)");

        //reading cookies from file 2
        BufferedReader cookie_Reader_file2 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa17_1cookies2.txt"));
        String paragraph2 = cookie_Reader_file2.readLine();
        //System.out.println(text);
        String[] CookieArray2 = paragraph.split("(?<=\\G....................................)");

        //validating the cookies array are both equal in size
        Assert.assertEquals(CookieArray2.length, CookieArray1.length, "cookieArray1 size != cookieArray2 size");
        System.out.println("QA17.1  # of cookies = " + CookieArray1.length);

        //validating the cookies are equal in both transactions
        for (int i = 0; i < CookieArray1.length; i++) {
            Assert.assertEquals(CookieArray2[i], CookieArray1[i], CookieArray1[i] + "!=" + CookieArray2[i]);

        }
    }

    @Test
    public void QA_18_1_CookieValidation_() throws IOException {

        //reading cookies from file 1
        BufferedReader cookie_Reader_file1 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa18_1cookies1.txt"));
        String paragraph = cookie_Reader_file1.readLine();
        //System.out.println(text);
        String[] CookieArray1 = paragraph.split("(?<=\\G....................................)");

        //reading cookies from file 2
        BufferedReader cookie_Reader_file2 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa18_1cookies2.txt"));
        String paragraph2 = cookie_Reader_file2.readLine();
        //System.out.println(text);
        String[] CookieArray2 = paragraph.split("(?<=\\G....................................)");

        //validating the cookies array are both equal in size
        Assert.assertEquals(CookieArray2.length, CookieArray1.length, "cookieArray1 size != cookieArray2 size");
        System.out.println("QA18.1  # of cookies = " + CookieArray1.length);

        //validating the cookies are equal in both transactions
        for (int i = 0; i < CookieArray1.length; i++) {
            Assert.assertEquals(CookieArray2[i], CookieArray1[i], CookieArray1[i] + "!=" + CookieArray2[i]);

        }
    }


    @Test
    public void QA_18_2_CookieValidation_() throws IOException {

        //reading cookies from file 1
        BufferedReader cookie_Reader_file1 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa18_1cookies1.txt"));
        String paragraph = cookie_Reader_file1.readLine();
        //System.out.println(text);
        String[] CookieArray1 = paragraph.split("(?<=\\G....................................)");

        //reading cookies from file 2
        BufferedReader cookie_Reader_file2 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa18_1cookies2.txt"));
        String paragraph2 = cookie_Reader_file2.readLine();
        //System.out.println(text);
        String[] CookieArray2 = paragraph.split("(?<=\\G....................................)");

        //validating the cookies array are both equal in size
        Assert.assertEquals(CookieArray2.length, CookieArray1.length, "cookieArray1 size != cookieArray2 size");
        System.out.println("QA18.2 # of cookies = " + CookieArray1.length);

        //validating the cookies are equal in both transactions
        for (int i = 0; i < CookieArray1.length; i++) {
            Assert.assertEquals(CookieArray2[i], CookieArray1[i], CookieArray1[i] + "!=" + CookieArray2[i]);

        }
    }



    @Test
    public void QA_18_3_CookieValidation_() throws IOException {

        //reading cookies from file 1
        BufferedReader cookie_Reader_file1 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa18_3cookies1.txt"));
        String paragraph = cookie_Reader_file1.readLine();
        //System.out.println(text);
        String[] CookieArray1 = paragraph.split("(?<=\\G....................................)");

        //reading cookies from file 2
        BufferedReader cookie_Reader_file2 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa18_3cookies2.txt"));
        String paragraph2 = cookie_Reader_file2.readLine();
        //System.out.println(text);
        String[] CookieArray2 = paragraph.split("(?<=\\G....................................)");

        //validating the cookies array are both equal in size
        Assert.assertEquals(CookieArray2.length, CookieArray1.length, "cookieArray1 size != cookieArray2 size");
        System.out.println("QA18.3 # of cookies = " + CookieArray1.length);

        //validating the cookies are equal in both transactions
        for (int i = 0; i < CookieArray1.length; i++) {
            Assert.assertEquals(CookieArray2[i], CookieArray1[i], CookieArray1[i] + "!=" + CookieArray2[i]);

        }
   }


    @Test
    public void QA_19_CookieValidation() throws IOException {

        //reading cookies from file 1
        BufferedReader cookie_Reader_file1 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa19cookies1.txt"));
        String paragraph = cookie_Reader_file1.readLine();
        //System.out.println(text);
        String[] CookieArray1 = paragraph.split("(?<=\\G....................................)");

        //reading cookies from file 2
        BufferedReader cookie_Reader_file2 = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Cookie_Values/qa19cookies2.txt"));
        String paragraph2 = cookie_Reader_file2.readLine();
        //System.out.println(text);
        String[] CookieArray2 = paragraph.split("(?<=\\G....................................)");

        //validating the cookies array are both equal in size
        Assert.assertEquals(CookieArray2.length, CookieArray1.length, "cookieArray1 size != cookieArray2 size");
        System.out.println("QA19 # of cookies = " + CookieArray1.length);

        //validating the cookies are equal in both transactions
        for (int i = 0; i < CookieArray1.length; i++) {
            Assert.assertEquals(CookieArray2[i], CookieArray1[i], CookieArray1[i] + "!=" + CookieArray2[i]);

        }


    }









}
