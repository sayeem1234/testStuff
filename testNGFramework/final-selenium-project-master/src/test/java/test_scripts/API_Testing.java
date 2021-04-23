package test_scripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class API_Testing {
    String baseURL = "https://qa-transaction-logging-backend.app.msignia-rnd.tech/api/v2/transactions/";
    String transactionId = "873f85cc-e0e4-44db-a634-efbbb34c7113";
    String ctQAURL= "https://qa-transaction-details.ct.msignia.com/api/v2/transactions/";


    @Test
    public void test01() throws ParseException {
        Response r = given().get(baseURL+transactionId);
        System.out.println(r);
        r.prettyPrint();

        ResponseBody body = r.getBody();



        // To check for sub string presence get the Response body as a String.
        // Do a String.contains
        String bodyAsString = body.asString();
      //  Assert.assertEquals(bodyAsString.contains("\\\"messageVersion\\\":\\\"2.2.0\\\"") /*Expected value*/, true /*Actual Value*/, "Response body contains 2.2.0");

    }

    @Test
    public void test02() throws ParseException{
        Response response  = RestAssured.get(ctQAURL+transactionId);

        System.out.println(response.getStatusCode());
    }





}
