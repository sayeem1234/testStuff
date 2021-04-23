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

public class api_mobile_dualbranded {

    String baseUrl = "https://qa-transaction-logging-backend.ct.msignia.com/api/v2/transactions/";


    @DataProvider(name = "readRSA_transactions")
    public Object[] readRSA_transactions() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/DualBrandedIDS/qa8_and_16_rsa.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }


    @DataProvider(name = "readEC_transactions")
    public Object[] readEC_transactions() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/DualBrandedIDS/qa8_and_16_ec.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }








    //qatestrsa
    @Test(dataProvider = "readRSA_transactions")
    public void test_rsa_transaction(String transactionID_endpoint){
        int count = 0;
        int Count = 0;
        String transStatusY = "transStatus\":\"Y";

        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();

        //verifying status code

        response.then().statusCode(200);
        int i = response.getStatusCode();
        Assert.assertTrue(i != 400 && i != 500);


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



            if (payload.contains(transStatusY)) {
                //payload_TransStatusY = true;
                count++;
                System.out.println("Occurence at " + i);


            }



            //validating DS = msigniamockRSA


            String transStatus_rsa = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_RSA";

                if (payload.contains(transStatus_rsa)) {
                    Count++;
                    System.out.println("Occurence at " + i);
                }

            }
        //loopends


        Assert.assertTrue(count > 0);
        System.out.println("Total number of times Trans Status Y Appears: " + count);


        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        Assert.assertFalse(bodyAsString.contains("messageType\\\":\\\"Erro"));

        Assert.assertTrue(Count > 0);
        System.out.println("Total number of times DSReference Number RSA Appears: " + Count);


    }









    @Test(dataProvider = "readEC_transactions")
    public void test_ec_transaction(String transactionID_endpoint){
        int count = 0;
        int Count = 0;
        String transStatusY = "transStatus\":\"Y";

        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();

        //verifying status code

        response.then().statusCode(200);
        int i = response.getStatusCode();
        Assert.assertTrue(i != 400 && i != 500);


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


            if (payload.contains(transStatusY)) {
                //payload_TransStatusY = true;
                count++;
                System.out.println("Occurence at " + i);


            }

            //validating DS = msigniamockEC


            String transStatus_ec = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_EC";

            if (payload.contains(transStatus_ec)) {
                Count++;
                System.out.println("Occurence at " + i);
            }







        }
        //loop ends


        Assert.assertTrue(count > 0);
        System.out.println("Total number of times Trans Status Y Appears: " + count);



        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        Assert.assertFalse(bodyAsString.contains("messageType\\\":\\\"Erro"));

        Assert.assertTrue(Count > 0);
        System.out.println("Total number of times DSReference Number EC Appears: " + Count);




    }






















}
