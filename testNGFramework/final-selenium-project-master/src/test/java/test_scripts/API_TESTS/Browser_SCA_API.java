package test_scripts.API_TESTS;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class Browser_SCA_API {
    String baseURL = "https://qa-transaction-logging-backend.ct.msignia.com/api/v2/transactions/";
    String transactionID_endpoint = "";
    public static String deviceCookieValue = "";
    String deviceCookie1 = "";
    public ArrayList<String> cookies_sca_browser_Qa21 = new ArrayList<>();



    @DataProvider(name = "qa21browser_1")
    public Object[] readQA21_one() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/SCA/qa21.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }

    @DataProvider(name = "qa21browser_2")
    public Object[] readQA21_two() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/SCA/qa21_second.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }



    @Test(dataProvider = "qa21browser_1")
    public void SCA_BROWSER_QA_21_first(String transactionID_endpoint) throws IOException {

        int count = 0;
        int Count_DSValue = 0;
        boolean indexACS_BSE = false;
        boolean U = false;


        Response response = given().get(baseURL + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();


        response.then().statusCode(200);
        int n = response.getStatusCode();
        Assert.assertTrue(n != 400 && n != 500);


        //Validating the purchaseInfo and authReqParams


        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";

            boolean A = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean B = index.equalsIgnoreCase("MC:MB");

            if (A && B) {
                Assert.assertTrue(payload.toLowerCase().contains(substring.toLowerCase()));
                Assert.assertTrue(payload.toLowerCase().contains(substring2.toLowerCase()));
                System.out.println("Occurence at " + i);
            }


            //validating transStatus  = Y


            String transStatus = "transStatus\":\"Y";


            if (payload.contains(transStatus)) {
                //payload_TransStatusY = true;
                count++;
                System.out.println("Occurence at " + i);
            }

            //validating DS value  = RSA

            String transStatus_DS = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_RSA";

            if (payload.contains(transStatus_DS)) {
                Count_DSValue++;
                System.out.println("Occurence at " + i);
            }


            //validating !Error

            String responsePayload = response.toString();
            Assert.assertFalse(responsePayload.contains("messageType\":\"Erro"), "Error message found");


            //validating message Extension
            String messageExtension = "messageExtension";

            boolean areq_ares_v1 = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean acs_ds = index.equalsIgnoreCase("ACS:DS");

            if (areq_ares_v1 && acs_ds) {
                Assert.assertTrue(payload.toLowerCase().contains(messageExtension.toLowerCase()));
                System.out.println("Occurence at " + i);
            }


            //getting the first device Cookie

            if (payload.contains("deviceCookie")) {
                String[] array = payload.split("deviceCookie");
                System.out.println("value = " + array[array.length - 1]);
                String name = array[1];
                String[] array2 = name.split("\":\"");
                String x = array2[1];
                System.out.println("value = " + array2[1]);
                String[] array3 = x.split("\",\"");
                deviceCookieValue += array3[0];
                System.out.println("deviceCookie:" + deviceCookieValue);
                break;
            }


        }

        //store into cookies folder
        cookies_sca_browser_Qa21.add(deviceCookieValue);
        for (String cookie : cookies_sca_browser_Qa21)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/Browser/qa21cookies.txt"), cookie.getBytes());

        Assert.assertTrue(count > 0);
        System.out.println("Total number of times Trans Status Y Appears: " + count);

        Assert.assertTrue(Count_DSValue > 0);
        System.out.println("Total number of times DSReference Number RSA Appears: " + Count_DSValue);


    }





    @Test(dataProvider = "qa21browser_2")
    public void test_browser_QA_21_second(String transactionID_endpoint) throws IOException {
        boolean indexACS_BSE = false;
        int count = 0;

        // SECOND URL (TRANS ID ) After submitting PA flow again

        //String second_Url = "5610542d-bbbd-4a84-96cc-cb8b07daf4b9"; //find a way to parametrize this second hit
        Response response2 = given().get(baseURL + transactionID_endpoint);
        JSONObject j2 = new JSONObject(response2.prettyPrint());
        JSONObject q2 = j2.getJSONObject("data");
        JSONArray a2 = q2.getJSONArray("messages");
        int sizeofMessagesArray2 = a2.length();


        //validating http respCode for 2nd trans ID

        response2.then().statusCode(200);
        int p = response2.getStatusCode();
        Assert.assertTrue(p != 400 && p != 500);


        //Validating the purchaseInfo and authReqParams for 2nd transID

        for (int i = 0; i < sizeofMessagesArray2; i++) {
            JSONObject obj2 = a2.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload2 = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";

            boolean A = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean B = index.equalsIgnoreCase("MC:MB");
            boolean z = index.equalsIgnoreCase("ACS:DS");

            if(A && z)
                Assert.assertTrue(payload2.toLowerCase().contains("messageExtension".toLowerCase()));

            if (A && B) {
                Assert.assertTrue(payload2.toLowerCase().contains(substring.toLowerCase()));
                Assert.assertTrue(payload2.toLowerCase().contains(substring2.toLowerCase()));
                System.out.println("Occurence at " + i);
            }



            //validating ! Error

            String responsePayload = response2.toString();
            Assert.assertFalse(responsePayload.contains("messageType\":\"Erro"), "Error message found");


            //validating Ds VAlue


            String ds_Value = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_RSA";

            if (payload2.contains(ds_Value)) {
                count++;
                System.out.println("Occurence at " + i);
            }


            //COOKIE VALIDATION PART cookie1 = cookie2


            boolean flowID_three_DS_method_v1 = flowId.equalsIgnoreCase("THREE_DS_METHOD_V1");
            boolean INDEX_dsAcs = index.equalsIgnoreCase("MC:ACS");


            if(flowID_three_DS_method_v1 && INDEX_dsAcs){

                Assert.assertTrue(payload2.toLowerCase().contains("deviceCookie".toLowerCase()));
                Assert.assertTrue(payload2.toLowerCase().contains("typingPattern".toLowerCase()));
                Assert.assertTrue(payload2.toLowerCase().contains("threeDSMethodData".toLowerCase()));
                Assert.assertTrue(payload2.toLowerCase().contains(deviceCookie1.toLowerCase()));
                //Assert.assertTrue(payload2.toLowerCase().contains((("deviceCookie\":\"")+(deviceCookieValue)).toLowerCase()));

            }



            boolean index_acs_bse = index.equalsIgnoreCase("ACS:BSE");
            boolean Y = index.equalsIgnoreCase("BSE:ACS");


            //validating last index
            if(A){

                if(index_acs_bse){
                    indexACS_BSE = true;
                    System.out.println("HERE");
                    break;
                }
            }
        }


        Assert.assertTrue(indexACS_BSE);
        Assert.assertTrue(count>0);




    }








}
