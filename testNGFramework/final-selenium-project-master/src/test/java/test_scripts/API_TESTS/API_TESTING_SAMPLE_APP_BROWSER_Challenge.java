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
import java.util.Base64;

import static io.restassured.RestAssured.given;

public class API_TESTING_SAMPLE_APP_BROWSER_Challenge {


    @DataProvider(name = "browser_ccs_cancelled")
    public Object[] readTransactionID_CCS_CANCELLED() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/challengecancel.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }


    @DataProvider(name = "qa5_ccs")
    public Object[] read_qa5() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/qa5.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }


    @DataProvider(name = "qa13_ccs")
    public Object[] read_qa6() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/qa13.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }

    @DataProvider(name = "master_Challenge_DS")
    public Object[] readMaster_Challenge_DS() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Browser_IDS/Challenge/masterChallenge.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }





    String baseURL = "https://qa-transaction-logging-backend.ct.msignia.com/api/v2/transactions/";


    //TODO: TEST#3a) Testing API calls for Challenge Card Submission Transaction IDS (Test # 3a from Flow Execution)
   //TODO: Browser Challenge Cancelled Submissions


    @Test(dataProvider = "browser_ccs_cancelled")
    public void testBrowserChallengeCancelled(String transactionID_endpoint){

        Response response = given().get(baseURL + transactionID_endpoint);
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




//
//               /*
//           Verifying that
//            instances of the element "transStatus\" contained within a "flowId" of "AREQ_ARES_V1" and one of the
//            four "index" listed below in the transaction detail report
//            should have a value of "C\" (for example, "transStatus\":\"C\"):
//           "ACS:DS"
//           "DS:3DSS"
//           "3DSS:MB"
//           "MB:MC"
//    */


            String string_purchaseinfo = "purchaseInfo";
            String string_authReqParam = "authenticationRequestParameters";
            String string_transStatus_c = "transStatus\":\"C";

            boolean ThreeDss_mb = index.equalsIgnoreCase("3DSS:MB");
            boolean acs_ds = index.equals("ACS:DS");
            boolean ds_3dss = index.equals("DS:3DSS");
            boolean mb_mc = index.equals("MB:MC");


            if (areq_ares_v1 && (ThreeDss_mb || acs_ds || ds_3dss || mb_mc)) {
                Assert.assertTrue(payload.contains(string_transStatus_c));
                System.out.println("Occurence at " + i);
            }



            String transStatus_cancelled = "{\"action\":\"cancelled\"}";

            boolean creq_cres_browser_v1 = flowId.equalsIgnoreCase("CREQ_CRES_BROWSER_V1");
            boolean mc_acs1 = index.equalsIgnoreCase("MC:ACS[1]");

            if (creq_cres_browser_v1 && mc_acs1) {
                Assert.assertTrue(payload.contains(transStatus_cancelled));
                System.out.println("Occurence at " + i);
            }



            String encodedString = payload;

            if (creq_cres_browser_v1 && mc_mb) {

                System.out.println("Occurence at " + i);

                Base64.Decoder decoder = Base64.getDecoder();
                byte[] decoded = decoder.decode(encodedString);
                String decoded_String = new String(decoded);
                //System.out.println(decoded_String);
                Assert.assertTrue(decoded_String.contains("\"challengeCancel\":\"01\""));
                Assert.assertTrue(decoded_String.contains("challengeCompletionInd\":\"Y"));
                Assert.assertTrue(decoded_String.contains("transStatus\":\"N"));


            }


            //Verifying challengeCancel value = 01 or 02

            String transStatus_challengeCancel = "challengeCancel\":\"01";


            boolean RREQ_RRES_V1 = flowId.equalsIgnoreCase("RREQ_RRES_V1");
            boolean _01 = index.equalsIgnoreCase("01");
            boolean _02 = index.equalsIgnoreCase("02");

            if (RREQ_RRES_V1 && (_01 || _02)) {
                Assert.assertTrue(payload.contains(transStatus_challengeCancel));
                System.out.println("Occurence at " + i);

            }












        }
        //loop ends

        //Verifying that the string "messageType\":\"Erro\" does not exist in the transaction report



        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        System.out.println(bodyAsString);
        Assert.assertFalse(bodyAsString.contains("messageType\\\":\\\"Erro"));

    }


    //TODO: 6a) Testing API calls for Challenge Card Submission Transaction IDS
    // (Test # 6a from Flow Execution) QA Scenarios 5 and 13 for Browser



  //qa5,13
    @Test(dataProvider = "qa5_ccs")
    public void browser_challenge_submissions(String transactionID_endpoint){


        Response response = given().get(baseURL + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        String Resend = "";
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();


        //http response code

        response.then().statusCode(200);
        int n = response.getStatusCode();
        Assert.assertTrue(n != 400 && n != 500);

        //purchase info , authReqParam


        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String purchaseInfo = "purchaseInfo";
            String auth_req_param = "authenticationRequestParameters";

            boolean areq_ares_v1 = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean mc_mb = index.equalsIgnoreCase("MC:MB");

            if (areq_ares_v1 && mc_mb) {
                Assert.assertTrue(payload.toLowerCase().contains(purchaseInfo.toLowerCase()));
                Assert.assertTrue(payload.toLowerCase().contains(auth_req_param.toLowerCase()));
                System.out.println("Occurence at " + i);
            }


            /*
           Verifying that
            instances of the element "transStatus\" contained within a "flowId" of "AREQ_ARES_V1" and one of the
            four "index" listed below in the transaction detail report
            should have a value of "C\" (for example, "transStatus\":\"C\"):
           "ACS:DS"
           "DS:3DSS"
           "3DSS:MB"
           "MB:MC"
    */


            String transStatus_C = "transStatus\":\"C";

            boolean threeDss_mb = index.equalsIgnoreCase("3DSS:MB");
            boolean acs_ds = index.equals("ACS:DS");
            boolean ds_3dss = index.equals("DS:3DSS");
            boolean mb_mc = index.equals("MB:MC");

            if (areq_ares_v1 && (threeDss_mb || acs_ds || ds_3dss || mb_mc)) {
                Assert.assertTrue(payload.contains(transStatus_C));
                System.out.println("Occurence at " + i);
            }


            String resend = "action\":\"resend\"";

            boolean creq_cres_app_v1 = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean mc_acs1 = index.equalsIgnoreCase("MC:ACS[1]");

            if (creq_cres_app_v1 && mc_acs1) {
                Assert.assertTrue(payload.toLowerCase().contains(Resend.toLowerCase()));
                System.out.println("Occurence at " + i);
            }


            //base64


            boolean creq_cres_browser_v1 = flowId.equalsIgnoreCase("CREQ_CRES_BROWSER_V1");
            String encodedString = payload;

            if(creq_cres_browser_v1 && mc_mb){


                Base64.Decoder decoder = Base64.getDecoder();
                byte[] decoded = decoder.decode(encodedString);
                String decoded_String = new String(decoded);
                //System.out.println(decoded_String);
                Assert.assertTrue(decoded_String.contains("challengeCompletionInd\":\"Y"));
                Assert.assertTrue(decoded_String.contains("transStatus\":\"Y"));

            }













        }
        //loopends


        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        System.out.println(bodyAsString);
        Assert.assertFalse(bodyAsString.contains("messageType\\\":\\\"Erro"));



    }



    //qa5,13
    @Test(dataProvider = "qa13_ccs")
    public void browser_challenge_submissions_qa13(String transactionID_endpoint){


        Response response = given().get(baseURL + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        String Resend = "";
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();


        //http response code

        response.then().statusCode(200);
        int n = response.getStatusCode();
        Assert.assertTrue(n != 400 && n != 500);

        //purchase info , authReqParam


        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String purchaseInfo = "purchaseInfo";
            String auth_req_param = "authenticationRequestParameters";

            boolean areq_ares_v1 = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean mc_mb = index.equalsIgnoreCase("MC:MB");

            if (areq_ares_v1 && mc_mb) {
                Assert.assertTrue(payload.toLowerCase().contains(purchaseInfo.toLowerCase()));
                Assert.assertTrue(payload.toLowerCase().contains(auth_req_param.toLowerCase()));
                System.out.println("Occurence at " + i);
            }


            /*
           Verifying that
            instances of the element "transStatus\" contained within a "flowId" of "AREQ_ARES_V1" and one of the
            four "index" listed below in the transaction detail report
            should have a value of "C\" (for example, "transStatus\":\"C\"):
           "ACS:DS"
           "DS:3DSS"
           "3DSS:MB"
           "MB:MC"
    */


            String transStatus_C = "transStatus\":\"C";

            boolean threeDss_mb = index.equalsIgnoreCase("3DSS:MB");
            boolean acs_ds = index.equals("ACS:DS");
            boolean ds_3dss = index.equals("DS:3DSS");
            boolean mb_mc = index.equals("MB:MC");

            if (areq_ares_v1 && (threeDss_mb || acs_ds || ds_3dss || mb_mc)) {
                Assert.assertTrue(payload.contains(transStatus_C));
                System.out.println("Occurence at " + i);
            }


            String resend = "action\":\"resend\"";

            boolean creq_cres_app_v1 = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean mc_acs1 = index.equalsIgnoreCase("MC:ACS[1]");

            if (creq_cres_app_v1 && mc_acs1) {
                Assert.assertTrue(payload.toLowerCase().contains(Resend.toLowerCase()));
                System.out.println("Occurence at " + i);
            }


            //base64


            boolean creq_cres_browser_v1 = flowId.equalsIgnoreCase("CREQ_CRES_BROWSER_V1");
            String encodedString = payload;

            if(creq_cres_browser_v1 && mc_mb){


                Base64.Decoder decoder = Base64.getDecoder();
                byte[] decoded = decoder.decode(encodedString);
                String decoded_String = new String(decoded);
                //System.out.println(decoded_String);
                Assert.assertTrue(decoded_String.contains("challengeCompletionInd\":\"Y"));
                Assert.assertTrue(decoded_String.contains("transStatus\":\"Y"));

            }













        }
        //loopends


        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        System.out.println(bodyAsString);
        Assert.assertFalse(bodyAsString.contains("messageType\\\":\\\"Erro"));



    }



    // TESTING WHEN DS VALUES
    //browser canccelled trasnsactions + master transactions (can both be used here interchangably)
    @Test(dataProvider = "browser_ccs_cancelled")
    public void test_DSValue_browser(String transactionID_endpoint) {


        Response response = given().get(baseURL + transactionID_endpoint);
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
        String payload = (String) data.get("payload");
        String[] accNumbers = payload.split("acctNumber\\\":\\\"");
        String[] acc = accNumbers[1].split("\"");
        String ccNum = acc[0];
        System.out.println(ccNum);


        //Find the filtered AirTable Cards where the DS value is equal to EC and not RSA
        Response r = given().header("Authorization", "Bearer keylkSJul1E3V8L10")
                .queryParam("filterByFormula", "AND({Card Range}=" + ccNum + ")").
                        when().
                        get("https://api.airtable.com/v0/appsdvrIYydk9AUKc/Cards");

        r.then().statusCode(200); //ensures that valid http response is returned from Airtable


        JSONObject airTableApiResponse = new JSONObject(r.prettyPrint());
        JSONArray records = airTableApiResponse.getJSONArray("records");
        JSONObject object1 = records.getJSONObject(0);
        JSONObject fields = object1.getJSONObject("fields");
        JSONArray DSValue = fields.getJSONArray("DS");
        String dsValue_DerivedFrom_CC = (String) DSValue.get(0);
        System.out.println(dsValue_DerivedFrom_CC);

        //Getting the response body from transaction API call
        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();


        // checking to see if the ds value from the CC from Airtable API call  matches the ds value from the transaction API Call
        if (dsValue_DerivedFrom_CC.equalsIgnoreCase(EC_EncodedEquivalent)) {
            Assert.assertTrue(bodyAsString.contains(DS_value_EC));
            Assert.assertFalse(bodyAsString.contains(DS_value_RSA));
            System.out.println("BODY CONTAINS EC AND NOT RSA");

        } else if (dsValue_DerivedFrom_CC.equalsIgnoreCase(RSA_EncodedEquivalent)) {
            Assert.assertTrue(bodyAsString.contains(DS_value_RSA));
            Assert.assertFalse(bodyAsString.contains(DS_value_EC));
            System.out.println("BODY CONTAINS RSA AND NOT EC");

        }


    }





}
