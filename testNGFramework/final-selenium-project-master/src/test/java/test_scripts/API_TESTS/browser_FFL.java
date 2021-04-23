package test_scripts.API_TESTS;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class browser_FFL {
    String baseUrl = "https://qa-transaction-logging-backend.ct.msignia.com/api/v2/transactions/";


    String transStatusY = "transStatus\":\"Y";
    int count = 0;


    @DataProvider(name = "browser_FFL")
    public Object[] readRSA_transactions_browser() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/FrictionlessFlow/combined1and9.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }



    @Test(dataProvider = "browser_FFL")
    public void frictionlessflow_browser(String transactionID_endpoint){


        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();

        //verifying status code

        response.then().statusCode(200);
        int i = response.getStatusCode();
        Assert.assertTrue(i != 400 && i != 500);


        //verifying that the Json payload with flowID=AREQ_ARES_V1 and index=MC:MB has all data elements under "purchaseInfo\" and "authenticationRequestParameters\"
        for (int n = 0; n < sizeofMessagesArray; n++) {
            JSONObject obj2 = a.getJSONObject(n);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";

            boolean areq_ares_v1 = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean mc_mb = index.equalsIgnoreCase("MC:MB");

            if (areq_ares_v1 && mc_mb) {
                Assert.assertTrue(payload.toLowerCase().contains(substring.toLowerCase()));
                Assert.assertTrue(payload.toLowerCase().contains(substring2.toLowerCase()));
                System.out.println("Occurence at " + i);
            }


            //transtatus Y


            if (payload.contains(transStatusY)) {
                //payload_TransStatusY = true;
                count++;
                System.out.println("Occurence at " + i);


            }


        }
        //forloopends

        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        Assert.assertFalse(bodyAsString.contains("messageType\\\":\\\"Erro"));

        Assert.assertTrue(count > 0);
        System.out.println("Total number of times Trans Status Y Appears: " + count);

    }



    @Test(dataProvider = "browser_FFL")
    public void DS_browser_frictionlessFlow(String transactionID_endpoint){


        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();



        String DS_value_EC = "dsReferenceNumber\\\":\\\"MSIGNIA_MOCK_DS_EC";
        String DS_value_RSA = "dsReferenceNumber\\\":\\\"MSIGNIA_MOCK_DS_RSA";

        String RSA_EncodedEquivalent = "reciBVmqBXKqlbenQ";
        String EC_EncodedEquivalent = "recF36dReAlpVvPx3";

        //getting the Account number (ccNum) from the transaction API details

        JSONObject obj = a.getJSONObject(0);
        JSONObject data = obj.getJSONObject("data");
        String payload = (String)data.get("payload");
        String[] accNumbers = payload.split("acctNumber\\\":\\\"");
        String[] acc = accNumbers[1].split("\"");
        String ccNum = acc[0];
        System.out.println(ccNum);


        //Find the filtered AirTable Cards where the DS value is equal to EC and not RSA
        Response r = given().header("Authorization", "Bearer keylkSJul1E3V8L10")
                .queryParam("filterByFormula", "AND({Card Range}="+ccNum+")").
                        when().
                        get("https://api.airtable.com/v0/appsdvrIYydk9AUKc/Cards");

        r.then().statusCode(200); //ensures that valid http response is returned from Airtable


        JSONObject airTableApiResponse = new JSONObject(r.prettyPrint());
        JSONArray records = airTableApiResponse.getJSONArray("records");
        JSONObject object1 = records.getJSONObject(0);
        JSONObject fields = object1.getJSONObject("fields");
        JSONArray DSValue = fields.getJSONArray("DS");
        String dsValue_DerivedFrom_CC = (String)DSValue.get(0);
        System.out.println(dsValue_DerivedFrom_CC);

        //Getting the response body from transaction API call
        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();


        // checking to see if the ds value from the CC from Airtable API call  matches the ds value from the transaction API Call
        if(dsValue_DerivedFrom_CC.equalsIgnoreCase(EC_EncodedEquivalent))

        {
            Assert.assertTrue(bodyAsString.contains(DS_value_EC));
            Assert.assertFalse(bodyAsString.contains(DS_value_RSA));
            System.out.println("BODY CONTAINS EC AND NOT RSA");

        }
        else if(dsValue_DerivedFrom_CC.equalsIgnoreCase(RSA_EncodedEquivalent))
        {
            Assert.assertTrue(bodyAsString.contains(DS_value_RSA));
            Assert.assertFalse(bodyAsString.contains(DS_value_EC));
            System.out.println("BODY CONTAINS RSA AND NOT EC");

        }




    }






}