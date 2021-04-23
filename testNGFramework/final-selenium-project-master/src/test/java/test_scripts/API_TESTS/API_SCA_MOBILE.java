package test_scripts.API_TESTS;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;

import static io.restassured.RestAssured.given;


public class API_SCA_MOBILE {

    String baseUrl = "https://qa-transaction-logging-backend.ct.msignia.com/api/v2/transactions/";
    String transactionID_endpoint = "16b132b5-8369-482e-bfda-b21725493f27"; //qa20
    String idTransforQA17 = "8c565d84-71cc-49f5-8230-882c3ee6918c";
    String id17_1 = "16b132b5-8369-482e-bfda-b21725493f27";
    String qa18 = "9edaa0e4-95bf-4fda-9bba-af9f8ffd3846";
    String qa20 = "03f9a641-0b8e-487b-a716-7ba439e7b53a";
    String qa19 = "63937e4e-8c89-4732-afcd-241a9625f0e9";
    Response response = given().get(baseUrl + transactionID_endpoint);
    JSONObject j = new JSONObject(response.prettyPrint());
    JSONObject q = j.getJSONObject("data");
    JSONArray a = q.getJSONArray("messages");
    int sizeofMessagesArray = a.length();

    //QA 17
    public ArrayList<String> cookies_qa17_one = new ArrayList<>();
    public ArrayList<String> cookies_qa17_two = new ArrayList<>();
    public static String QA17_deviceCookie1 = "";
    public static String QA17_deviceCookie2 = "";

    //QA 17.1
    public ArrayList<String> cookies_qa17_1_one = new ArrayList<>();
    public ArrayList<String> cookies_qa17_1_two = new ArrayList<>();
    public static String QA17_1_deviceCookie1 = "";
    public static String Qa17_1_deviceCookie_2 = "";

    //QA 18.1
    public static String QA18_1_deviceCookie1 = "";
    public static String Qa18_1_deviceCookie2 = "";
    public ArrayList<String> cookies_qa18_1_one = new ArrayList<>();
    public ArrayList<String> cookies2_qa18_1_two = new ArrayList<>();

    //QA 18.2
    public static String QA18_2_deviceCookie1 = "";
    public static String Qa18_2_deviceCookie2 = "";
    public ArrayList<String> cookies_qa18_2_one = new ArrayList<>();
    public ArrayList<String> cookies2_qa18_2_two = new ArrayList<>();

    //QA 18.3
    public static String QA18_3_deviceCookie1 = "";
    public static String Qa18_3_deviceCookie2 = "";
    public ArrayList<String> cookies_qa18_3_one = new ArrayList<>();
    public ArrayList<String> cookies2_qa18_3_two = new ArrayList<>();

    //QA 19
    public ArrayList<String> cookies = new ArrayList<>();
    public ArrayList<String> cookies2 = new ArrayList<>();
    public static String QA19deviceCookie1 = "";
    public static String Qa19_deviceCookie_2 = "";


    @DataProvider(name = "transactionID_SCA_MOBILE_17_first")
    public Object[] readTransactionID_QA_17_first() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa17first.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }

    @DataProvider(name = "transactionID_SCA_MOBILE_17_second")
    public Object[] readTransactionID_QA_17_second() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa17second.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }

    @DataProvider(name = "transactionID_SCA_MOBILE_17_1_First")
    public Object[] readTransactionID_QA_17_1_first() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa17_1_first.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }

    @DataProvider(name = "transactionID_SCA_MOBILE_17_1_Second")
    public Object[] readTransactionID_QA_17_1_second() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa17_1_second.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }


    @DataProvider(name = "transactionID_SCA_MOBILE_18_1_First")
    public Object[] readTransactionID_QA_18_1_first() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa18_1_first.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }

    @DataProvider(name = "transactionID_SCA_MOBILE_18_1_Second")
    public Object[] readTransactionID_QA_18_1_second() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa18_1_second.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }


    @DataProvider(name = "transactionID_SCA_MOBILE_18_2_First")
    public Object[] readTransactionID_QA_18_2_first() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa18_2_first.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }


    @DataProvider(name = "transactionID_SCA_MOBILE_18_2_Second")
    public Object[] readTransactionID_QA_18_2_second() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa18_2_second.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }


    @DataProvider(name = "transactionID_SCA_MOBILE_18_3_First")
    public Object[] readTransactionID_QA_18_3_first() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa18_3_first.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }


    @DataProvider(name = "transactionID_SCA_MOBILE_18_3_Second")
    public Object[] readTransactionID_QA_18_3_second() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa18_3_second.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }

    //reading the first file of transacton IDs
    @DataProvider(name = "transactionID_SCA_MOBILE_19")
    public Object[] readTransactionID() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa19first.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length];
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }

    //reading the second file of transacton IDs
    @DataProvider(name = "transactionID_SCA_MOBILE_19_Second")
    public Object[] readTransactionID_QA_19_second() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa19second.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }


    @DataProvider(name = "transactionID_SCA_MOBILE_20")
    public Object[] readTransactionID_QA_20() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa20.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }


    @DataProvider(name = "transactionID_SCA_MOBILE_20_1")
    public Object[] readTransactionID_QA_20_1() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/Transaction_IDS/Mobile/SCA/qa20_1.txt"));
        String paragraph = brTest.readLine();
        String[] List = paragraph.split("(?<=\\G....................................)");
        String[] arr = new String[List.length]; //secondArray
        for (int i = 0; i < List.length; i++) {
            arr[i] = List[i];

        }

        return arr;
    }






    //testqa17
    @Test(dataProvider = "transactionID_SCA_MOBILE_17_first")
    public void test_17(String transactionID_endpoint) throws IOException {


        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();

        //validating valid response codes

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

        }


        //validating transStatus  = Y

        int count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "transStatus\":\"Y";

            if (payload.contains(transStatus)) {
                //payload_TransStatusY = true;
                count++;
                System.out.println("Occurence at " + i);


            }

        }
        Assert.assertTrue(count > 0);
        System.out.println("Total number of times Trans Status Y Appears: " + count);


        //validating DS = msigniamockRSA

        int Count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_RSA";

            if (payload.contains(transStatus)) {
                Count++;
                System.out.println("Occurence at " + i);
            }

        }

        Assert.assertTrue(Count > 0);
        System.out.println("Total number of times DSReference Number RSA Appears: " + Count);


        //validating messageExtension under payload

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            String substring = "messageExtension";

            boolean A = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean B = index.equalsIgnoreCase("ACS:DS");

            if (A && B) {
                Assert.assertTrue(payload.toLowerCase().contains(substring.toLowerCase()));
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
                QA17_deviceCookie1 += array3[0];
                System.out.println("qa 17.1 device cookie #1 = " + QA17_1_deviceCookie1 + "END");
                break;
            }
        }


        cookies_qa17_one.add(QA17_deviceCookie1);
        System.out.println("sizeofArray2" + cookies_qa17_one.size());
        for (String cookie : cookies_qa17_one)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa17cookies.txt"), cookie.getBytes());


    }




    @Test(dataProvider = "transactionID_SCA_MOBILE_17_second")
    public void test17_second(String transactionID_endpoint) throws IOException {

        Response response2 = given().get(baseUrl + transactionID_endpoint);
        JSONObject j2 = new JSONObject(response2.prettyPrint());
        JSONObject q2 = j2.getJSONObject("data");
        JSONArray a2 = q2.getJSONArray("messages");
        int sizeofMessagesArray2 = a2.length();

        for (int i = 0; i < sizeofMessagesArray2; i++) {
            JSONObject obj_double = a2.getJSONObject(i);
            String flowId2 = (String) obj_double.get("flowId");
            String index2 = (String) obj_double.get("index");

            JSONObject data2 = obj_double.getJSONObject("data");
            String payload2 = (String) data2.get("payload");
            //System.out.println(payload);
            String substring = "deviceInfo";
            String substring2 = "messageExtension";


            boolean A2 = flowId2.equalsIgnoreCase("AREQ_ARES_V1");
            boolean B2 = index2.equalsIgnoreCase("DS:ACS");
            boolean B3 = index2.equalsIgnoreCase("ACS:DS");

            if (A2 && B3)
                Assert.assertTrue(payload2.contains(substring2), "Error: " + substring2 + " not found.");


            if (A2 && B2) {
                Assert.assertTrue(payload2.toLowerCase().contains(substring.toLowerCase()));
                System.out.println("Occurence at " + i);
                String[] arr1 = payload2.split("deviceInfo\\\":\\\"");
                // System.out.println("val="+arr1[arr1.length-1]);

                String[] arr2 = arr1[arr1.length - 1].split("\",\"");
                String encodedString = arr2[0];
                //System.out.println("val = "+ encodedString);


                Base64.Decoder decoder = Base64.getDecoder();
                byte[] decoded = decoder.decode(encodedString);
                String decoded_String = new String(decoded);
                //System.out.println("Decoded String = " + decoded_String);

                Assert.assertTrue(decoded_String.contains("SCA") && decoded_String.contains("deviceCookie"));


                String[] newArry = decoded_String.split("deviceCookie\":\"");
                //System.out.println("val = " + newArry[newArry.length-1]);
                String[] newArry2 = newArry[newArry.length - 1].split("\"},\"");
                QA17_deviceCookie2 += newArry2[0];

            }


        }


        cookies_qa17_two.add(QA17_deviceCookie2);
        System.out.println("sizeofArray2" + cookies_qa17_two.size());
        for (String cookie : cookies_qa17_two)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa17cookies2.txt"), cookie.getBytes());


    }



    //qatest17.1
    @Test(dataProvider = "transactionID_SCA_MOBILE_17_1_First")
    public void test_17_1_first(String transactionID_endpoint) throws IOException {


        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();

        //validating valid response codes

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

        }


        //validating transStatus  = Y

        int count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "transStatus\":\"Y";

            if (payload.contains(transStatus)) {
                //payload_TransStatusY = true;
                count++;
                System.out.println("Occurence at " + i);


            }

        }
        Assert.assertTrue(count > 0);
        System.out.println("Total number of times Trans Status Y Appears: " + count);


        //validating DS = msigniamockRSA

        int Count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_RSA";

            if (payload.contains(transStatus)) {
                Count++;
                System.out.println("Occurence at " + i);
            }

        }

        Assert.assertTrue(Count > 0);
        System.out.println("Total number of times DSReference Number RSA Appears: " + Count);


        //validating messageExtension under payload

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            String substring = "messageExtension";

            boolean A = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean B = index.equalsIgnoreCase("ACS:DS");

            if (A && B) {
                Assert.assertTrue(payload.toLowerCase().contains(substring.toLowerCase()));
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
                QA17_1_deviceCookie1 += array3[0];
                System.out.println("qa 17.1 device cookie #1 = " + QA17_1_deviceCookie1 + "END");
                break;
            }
        }


        cookies_qa17_1_one.add(QA17_1_deviceCookie1);
        System.out.println("sizeofArray2" + cookies_qa17_1_one.size());
        for (String cookie : cookies_qa17_1_one)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa17_1cookies1.txt"), cookie.getBytes());


    }


    @Test(dataProvider = "transactionID_SCA_MOBILE_17_1_Second")
    public void test17_1_second(String transactionID_endpoint) throws IOException {

        int count = 0;


        // SECOND URL (TRANS ID ) After submitting PA flow again
        Response response2 = given().get(baseUrl + transactionID_endpoint);
        JSONObject j2 = new JSONObject(response2.prettyPrint());
        JSONObject q2 = j2.getJSONObject("data");
        JSONArray a2 = q2.getJSONArray("messages");
        int sizeofMessagesArray2 = a2.length();


        //validating http respCode for 2nd trans ID

        response2.then().statusCode(200);
        int n = response2.getStatusCode();
        Assert.assertTrue(n != 400 && n != 500);


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

            if (A && z)
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


            boolean INDEX_dsAcs = index.equalsIgnoreCase("DS:ACS");

            String devInfo = "deviceInfo";

            //validating device info and decoding the message

            if (A && INDEX_dsAcs) {
                Assert.assertTrue(payload2.contains(devInfo), "Error: " + devInfo + " not found.");
                System.out.println("Occurence at " + i);


                String[] arr1 = payload2.split("deviceInfo\\\":\\\"");
                // System.out.println("val="+arr1[arr1.length-1]);

                String[] arr2 = arr1[arr1.length - 1].split("\",\"");
                String encodedString = arr2[0];
                System.out.println("encodedString:" + encodedString);


                Base64.Decoder decoder = Base64.getDecoder();
                byte[] decoded = decoder.decode(encodedString);
                String decoded_String = new String(decoded);
                // System.out.println("Decoded String = " + decoded_String);


                Assert.assertTrue(decoded_String.contains("SCA") && decoded_String.contains("deviceCookie") && decoded_String.contains("localBioAuth"));


                // trying out json

                JSONObject decoded_object = new JSONObject(decoded_String);
                JSONObject sca_object = decoded_object.getJSONObject("SCA");
                Qa17_1_deviceCookie_2 += (String) sca_object.get("deviceCookie");
                JSONObject localBioAuth_object = sca_object.getJSONObject("localBioAuth");
                String result = (String) localBioAuth_object.get("result");
                String type = (String) localBioAuth_object.get("type");
                String reason = (String) localBioAuth_object.get("reason");

                //Validating the localBioAuth values

                Assert.assertEquals(result, "FAILED", "expected result = FAILED but found result =  " + result);
                Assert.assertEquals(type, "FACE", "expected type = FACE but found type =  " + type);
                Assert.assertEquals(reason, "NO_BIOMETRICS_ENROLLED", "expected reason = no biometrics enrolled but found reason =  " + reason);


            }


        }

        Assert.assertTrue(count > 0, "count less than 0 or 0");
        System.out.println("Total number of times DSReference Number RSA Appears: " + count);


        cookies_qa17_1_two.add(Qa17_1_deviceCookie_2);
        System.out.println("sizeofArray2" + cookies_qa17_1_two.size());
        for (String cookie : cookies_qa17_1_two)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa17_1cookies2.txt"), cookie.getBytes());

    }

    //qatest18.1
    @Test(dataProvider = "transactionID_SCA_MOBILE_18_1_First")
    public void test_SCA_QAScenario18_1_first(String transactionID_endpoint) throws IOException {

        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();
        //validating valid response codes

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

        }


        //validating transStatus  = Y

        int count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "transStatus\":\"Y";

            if (payload.contains(transStatus)) {
                //payload_TransStatusY = true;
                count++;
                System.out.println("Occurence at " + i);


            }

        }
        Assert.assertTrue(count > 0);
        System.out.println("Total number of times Trans Status Y Appears: " + count);


        //validating DS = msigniamockRSA

        int Count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_RSA";

            if (payload.contains(transStatus)) {
                Count++;
                System.out.println("Occurence at " + i);
            }

        }

        Assert.assertTrue(Count > 0);
        System.out.println("Total number of times DSReference Number RSA Appears: " + Count);


        //validating messageExtension under payload

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            String substring = "messageExtension";

            boolean A = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean B = index.equalsIgnoreCase("ACS:DS");

            if (A && B) {
                Assert.assertTrue(payload.toLowerCase().contains(substring.toLowerCase()));
                System.out.println("Occurence at " + i);
            }

        }


        //code to get cookie for sca 18 is slightly different than 17 (one more split string)

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");

            if (payload.contains("deviceCookie")) {
                String[] array = payload.split("deviceCookie");
                System.out.println("value = " + array[array.length - 1]);
                String name = array[1];
                String[] array2 = name.split("\":\"");
                String x = array2[1];
                System.out.println("value = " + array2[1]);
                String[] array3 = x.split("\",\"");
                QA18_1_deviceCookie1 += array3[0];
                System.out.println("qa 18.1 cookie first run:" + QA18_1_deviceCookie1 + "END");
                break;
            }

        }


        cookies_qa18_1_one.add(QA18_1_deviceCookie1);
        System.out.println("sizeofArray1" + cookies_qa18_1_one.size());
        for (String cookie : cookies_qa18_1_one)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa18_1cookies1.txt"), cookie.getBytes());


    }


    @Test(dataProvider = "transactionID_SCA_MOBILE_18_1_Second")
    public void test_QA_18_1_second(String transactionID_endpoint) throws IOException {


        //SECOND URL

        //String second_Url = "50998f9f-8aac-4ab7-afda-9ceafc63e847"; //find a way to parametrize this second hit
        Response response2 = given().get(baseUrl + transactionID_endpoint);
        JSONObject j2 = new JSONObject(response2.prettyPrint());
        JSONObject q2 = j2.getJSONObject("data");
        JSONArray a2 = q2.getJSONArray("messages");
        int sizeofMessagesArray2 = a2.length();

        for (int i = 0; i < sizeofMessagesArray2; i++) {
            JSONObject obj_double = a2.getJSONObject(i);
            String flowId2 = (String) obj_double.get("flowId");
            String index2 = (String) obj_double.get("index");

            JSONObject data2 = obj_double.getJSONObject("data");
            String payload2 = (String) data2.get("payload");
            //System.out.println(payload);
            String substring_deviceInfo = "deviceInfo";
            String substring2 = "messageExtension";


            boolean areq_are_v1 = flowId2.equalsIgnoreCase("AREQ_ARES_V1");
            boolean ds_acs = index2.equalsIgnoreCase("DS:ACS");
            boolean B3 = index2.equalsIgnoreCase("ACS:DS");

            boolean b4 = index2.equalsIgnoreCase("ACS:BSE");
            boolean b5 = index2.equalsIgnoreCase("BSE:ACS");


            if (areq_are_v1 && B3)
                Assert.assertTrue(payload2.contains(substring2), "Error: " + substring2 + " not found.");


            if (areq_are_v1 && ds_acs) {
                Assert.assertTrue(payload2.toLowerCase().contains(substring_deviceInfo.toLowerCase()));
                System.out.println("Occurence at " + i);
                String[] arr1 = payload2.split("deviceInfo\\\":\\\"");
                // System.out.println("val="+arr1[arr1.length-1]);

                String[] arr2 = arr1[arr1.length - 1].split("\",\"");
                String encodedString = arr2[0];
                //System.out.println("encodedString:"+ encodedString);


                Base64.Decoder decoder = Base64.getDecoder();
                byte[] decoded = decoder.decode(encodedString);
                String decoded_String = new String(decoded);
                System.out.println("Decoded String:" + decoded_String);

                Assert.assertTrue(decoded_String.contains("SCA") && decoded_String.contains("deviceCookie") && decoded_String.contains("usdkPrompt"), "Missing Sca prompt");
                Assert.assertTrue(decoded_String.contains("input") && decoded_String.contains("typing"));

                // trying out json

                JSONObject decoded_object = new JSONObject(decoded_String);
                JSONObject sca_object = decoded_object.getJSONObject("SCA");
                Qa18_1_deviceCookie2 += (String) sca_object.get("deviceCookie");
                JSONObject usdkPrompt = sca_object.getJSONObject("usdkPrompt");
                String email = (String) usdkPrompt.get("input");
                String typing = (String) usdkPrompt.get("typing");
                System.out.println("email:" + email);

            }


        }

        System.out.println("qa18.1 cookie value second run:" + Qa18_1_deviceCookie2);


        cookies2_qa18_1_two.add(Qa18_1_deviceCookie2);
        System.out.println("sizeofArray1" + cookies2_qa18_1_two.size());
        for (String cookie : cookies2_qa18_1_two)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa18_1cookies2.txt"), cookie.getBytes());

    }

    //qatest18.2
    @Test(dataProvider = "transactionID_SCA_MOBILE_18_2_First")
    public void test_SCA_QAScenario18_2_first(String transactionID_endpoint) throws IOException {

        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();
        //validating valid response codes

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

        }


        //validating transStatus  = Y

        int count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "transStatus\":\"Y";

            if (payload.contains(transStatus)) {
                //payload_TransStatusY = true;
                count++;
                System.out.println("Occurence at " + i);


            }

        }
        Assert.assertTrue(count > 0);
        System.out.println("Total number of times Trans Status Y Appears: " + count);


        //validating DS = msigniamockRSA

        int Count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_RSA";

            if (payload.contains(transStatus)) {
                Count++;
                System.out.println("Occurence at " + i);
            }

        }

        Assert.assertTrue(Count > 0);
        System.out.println("Total number of times DSReference Number RSA Appears: " + Count);


        //validating messageExtension under payload

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            String substring = "messageExtension";

            boolean A = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean B = index.equalsIgnoreCase("ACS:DS");

            if (A && B) {
                Assert.assertTrue(payload.toLowerCase().contains(substring.toLowerCase()));
                System.out.println("Occurence at " + i);
            }

        }


        //code to get cookie for sca 18 is slightly different than 17 (one more split string)

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");

            if (payload.contains("deviceCookie")) {
                String[] array = payload.split("deviceCookie");
                System.out.println("value = " + array[array.length - 1]);
                String name = array[1];
                String[] array2 = name.split("\":\"");
                String x = array2[1];
                System.out.println("value = " + array2[1]);
                String[] array3 = x.split("\",\"");
                QA18_2_deviceCookie1 += array3[0];
                System.out.println("qa 18.2 device cookie first run:" + QA18_2_deviceCookie1 + "END");
                break;
            }

        }


        cookies_qa18_2_one.add(QA18_2_deviceCookie1);
        System.out.println("sizeofArray1" + cookies_qa18_2_one.size());
        for (String cookie : cookies_qa18_2_one)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa18_2cookies1.txt"), cookie.getBytes());


    }


    @Test(dataProvider = "transactionID_SCA_MOBILE_18_2_Second")
    public void test_QA_18_2_second(String transactionID_endpoint) throws IOException {


        //SECOND URL
        Response response2 = given().get(baseUrl + transactionID_endpoint);
        JSONObject j2 = new JSONObject(response2.prettyPrint());
        JSONObject q2 = j2.getJSONObject("data");
        JSONArray a2 = q2.getJSONArray("messages");
        int sizeofMessagesArray2 = a2.length();

        for (int i = 0; i < sizeofMessagesArray2; i++) {
            JSONObject obj_double = a2.getJSONObject(i);
            String flowId2 = (String) obj_double.get("flowId");
            String index2 = (String) obj_double.get("index");

            JSONObject data2 = obj_double.getJSONObject("data");
            String payload2 = (String) data2.get("payload");
            //System.out.println(payload);
            String substring_deviceInfo = "deviceInfo";
            String substring2 = "messageExtension";


            boolean areq_are_v1 = flowId2.equalsIgnoreCase("AREQ_ARES_V1");
            boolean ds_acs = index2.equalsIgnoreCase("DS:ACS");
            boolean B3 = index2.equalsIgnoreCase("ACS:DS");

            boolean b4 = index2.equalsIgnoreCase("ACS:BSE");
            boolean b5 = index2.equalsIgnoreCase("BSE:ACS");


            if (areq_are_v1 && B3)
                Assert.assertTrue(payload2.contains(substring2), "Error: " + substring2 + " not found.");


            if (areq_are_v1 && ds_acs) {
                Assert.assertTrue(payload2.toLowerCase().contains(substring_deviceInfo.toLowerCase()));
                System.out.println("Occurence at " + i);
                String[] arr1 = payload2.split("deviceInfo\\\":\\\"");
                // System.out.println("val="+arr1[arr1.length-1]);

                String[] arr2 = arr1[arr1.length - 1].split("\",\"");
                String encodedString = arr2[0];
                //System.out.println("encodedString:"+ encodedString);


                Base64.Decoder decoder = Base64.getDecoder();
                byte[] decoded = decoder.decode(encodedString);
                String decoded_String = new String(decoded);
                System.out.println("Decoded String:" + decoded_String);

                Assert.assertTrue(decoded_String.contains("SCA") && decoded_String.contains("deviceCookie") && decoded_String.contains("usdkPrompt"), "Missing Sca prompt");
                Assert.assertTrue(decoded_String.contains("input") && decoded_String.contains("typing"));

                // trying out json

                JSONObject decoded_object = new JSONObject(decoded_String);
                JSONObject sca_object = decoded_object.getJSONObject("SCA");
                Qa18_2_deviceCookie2 += (String) sca_object.get("deviceCookie");
                JSONObject usdkPrompt = sca_object.getJSONObject("usdkPrompt");
                String bankPin = (String) usdkPrompt.get("input");
                String typing = (String) usdkPrompt.get("typing");
                System.out.println("bankPin:" + bankPin);

            }


        }

        System.out.println("qa 18.2 device cookie second run:" + Qa18_2_deviceCookie2);


        cookies2_qa18_2_two.add(Qa18_2_deviceCookie2);
        System.out.println("sizeofArray2" + cookies2_qa18_2_two.size());
        for (String cookie : cookies2_qa18_2_two)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa18_2cookies2.txt"), cookie.getBytes());

    }

    //qatest18.3
    @Test(dataProvider = "transactionID_SCA_MOBILE_18_3_First")
    public void test_SCA_QAScenario18_3_first(String transactionID_endpoint) throws IOException {

        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();
        //validating valid response codes

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

        }


        //validating transStatus  = Y

        int count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "transStatus\":\"Y";

            if (payload.contains(transStatus)) {
                //payload_TransStatusY = true;
                count++;
                System.out.println("Occurence at " + i);


            }

        }
        Assert.assertTrue(count > 0);
        System.out.println("Total number of times Trans Status Y Appears: " + count);


        //validating DS = msigniamockRSA

        int Count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_RSA";

            if (payload.contains(transStatus)) {
                Count++;
                System.out.println("Occurence at " + i);
            }

        }

        Assert.assertTrue(Count > 0);
        System.out.println("Total number of times DSReference Number RSA Appears: " + Count);


        //validating messageExtension under payload

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            String substring = "messageExtension";

            boolean A = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean B = index.equalsIgnoreCase("ACS:DS");

            if (A && B) {
                Assert.assertTrue(payload.toLowerCase().contains(substring.toLowerCase()));
                System.out.println("Occurence at " + i);
            }

        }


        //code to get cookie for sca 18 is slightly different than 17 (one more split string)

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");

            if (payload.contains("deviceCookie")) {
                String[] array = payload.split("deviceCookie");
                System.out.println("value = " + array[array.length - 1]);
                String name = array[1];
                String[] array2 = name.split("\":\"");
                String x = array2[1];
                System.out.println("value = " + array2[1]);
                String[] array3 = x.split("\",\"");
                QA18_3_deviceCookie1 += array3[0];
                System.out.println("April_cookie:" + QA18_3_deviceCookie1 + "END");
                break;
            }

        }


        cookies_qa18_3_one.add(QA18_3_deviceCookie1);
        System.out.println("sizeofArray1" + cookies_qa18_3_one.size());
        for (String cookie : cookies_qa18_3_one)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa18_3cookies1.txt"), cookie.getBytes());


    }


    @Test(dataProvider = "transactionID_SCA_MOBILE_18_3_Second")
    public void test_QA_18_3_second(String transactionID_endpoint) throws IOException {


        //SECOND URL

        //String second_Url = "50998f9f-8aac-4ab7-afda-9ceafc63e847"; //find a way to parametrize this second hit
        Response response2 = given().get(baseUrl + transactionID_endpoint);
        JSONObject j2 = new JSONObject(response2.prettyPrint());
        JSONObject q2 = j2.getJSONObject("data");
        JSONArray a2 = q2.getJSONArray("messages");
        int sizeofMessagesArray2 = a2.length();

        for (int i = 0; i < sizeofMessagesArray2; i++) {
            JSONObject obj_double = a2.getJSONObject(i);
            String flowId2 = (String) obj_double.get("flowId");
            String index2 = (String) obj_double.get("index");

            JSONObject data2 = obj_double.getJSONObject("data");
            String payload2 = (String) data2.get("payload");
            //System.out.println(payload);
            String substring_deviceInfo = "deviceInfo";
            String substring2 = "messageExtension";


            boolean areq_are_v1 = flowId2.equalsIgnoreCase("AREQ_ARES_V1");
            boolean ds_acs = index2.equalsIgnoreCase("DS:ACS");
            boolean B3 = index2.equalsIgnoreCase("ACS:DS");

            boolean b4 = index2.equalsIgnoreCase("ACS:BSE");
            boolean b5 = index2.equalsIgnoreCase("BSE:ACS");


            if (areq_are_v1 && B3)
                Assert.assertTrue(payload2.contains(substring2), "Error: " + substring2 + " not found.");


            if (areq_are_v1 && ds_acs) {
                Assert.assertTrue(payload2.toLowerCase().contains(substring_deviceInfo.toLowerCase()));
                System.out.println("Occurence at " + i);
                String[] arr1 = payload2.split("deviceInfo\\\":\\\"");
                // System.out.println("val="+arr1[arr1.length-1]);

                String[] arr2 = arr1[arr1.length - 1].split("\",\"");
                String encodedString = arr2[0];
                //System.out.println("encodedString:"+ encodedString);


                Base64.Decoder decoder = Base64.getDecoder();
                byte[] decoded = decoder.decode(encodedString);
                String decoded_String = new String(decoded);
                System.out.println("Decoded String:" + decoded_String);

                Assert.assertTrue(decoded_String.contains("SCA") && decoded_String.contains("deviceCookie") && decoded_String.contains("usdkPrompt"), "Missing Sca prompt");
                Assert.assertTrue(decoded_String.contains("input") && decoded_String.contains("typing"));

                // trying out json

                JSONObject decoded_object = new JSONObject(decoded_String);
                JSONObject sca_object = decoded_object.getJSONObject("SCA");
                Qa18_3_deviceCookie2 = (String) sca_object.get("deviceCookie");
                JSONObject usdkPrompt = sca_object.getJSONObject("usdkPrompt");
                String zipcode = (String) usdkPrompt.get("input");
                String typing = (String) usdkPrompt.get("typing");
                System.out.println(zipcode);

            }


        }

        cookies2_qa18_3_two.add(Qa18_3_deviceCookie2);
        System.out.println("sizeofArray2" + cookies2_qa18_3_two.size());
        for (String cookie : cookies2_qa18_3_two)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa18_3cookies2.txt"), cookie.getBytes());

    }


    //qatest19
    @Test(dataProvider = "transactionID_SCA_MOBILE_19")
    public void test_SCA_QA_19(String transactionID_endpoint) throws IOException {

        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();

        //validating valid response codes

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

        }

        //transStatus = C  and transStatus = Y

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "transStatus\":\"C";

            boolean A = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean B = index.equalsIgnoreCase("3DSS:MB");
            boolean C = index.equals("ACS:DS");
            boolean D = index.equals("DS:3DSS");
            boolean E = index.equals("MB:MC");

            if (A && (B || C || D || E)) {
                Assert.assertTrue(payload.contains(transStatus));
                System.out.println("Occurence at " + i);
            }

            boolean X = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean X2 = index.equalsIgnoreCase("ACS:MC[1]");
            String transStatusY = "transStatus\":\"Y";

            if (X && X2)
                Assert.assertTrue(payload.contains(transStatusY));


            boolean N = flowId.equalsIgnoreCase("RREQ_RRES_V1");
            boolean N2 = index.equalsIgnoreCase("01");
            boolean N3 = index.equalsIgnoreCase("02");

            if (N && (N2 || N3))
                Assert.assertTrue(payload.contains(transStatusY));


        }


        //validating DS = msigniamockRSA

        int Count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_RSA";

            if (payload.contains(transStatus)) {
                Count++;
                System.out.println("Occurence at " + i);
            }

        }

        Assert.assertTrue(Count > 0);
        System.out.println("Total number of times DSReference Number RSA Appears: " + Count);


        //validating messageExtension under payload

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            String substring = "messageExtension";

            boolean A = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean B = index.equalsIgnoreCase("ACS:MC[0]");

            if (A && B) {
                Assert.assertTrue(payload.toLowerCase().contains("messageExtension".toLowerCase()));
                System.out.println("Occurence at " + i);
            }

        }


        //getting the first device Cookie

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");

            if (payload.contains("deviceCookie")) {
                String[] array = payload.split("deviceCookie");
                System.out.println("value = " + array[array.length - 1]);
                String name = array[1];
                String[] array2 = name.split("\":\"");
                String x = array2[1];
                System.out.println("value = " + array2[1]);
                String[] array3 = x.split("\",\"");
                QA19deviceCookie1 += array3[0];
                System.out.println("AYOdeviceCookie = " + QA19deviceCookie1 + "END");
                break;
            }

        }


        cookies.add(QA19deviceCookie1);
        for (String cookie : cookies)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa19cookies1.txt"), cookie.getBytes());


    }


    @Test(dataProvider = "transactionID_SCA_MOBILE_19_Second")
    public void SCA_QA_19_Part2(String second_transactionID) throws IOException {
        int count = 0;

        System.out.println("secondTransID:" + second_transactionID);

        // SECOND URL (TRANS ID ) After submitting PA flow again

        //String second_Url = second_transactionID; //find a way to parametrize this second hit
        Response response2 = given().get(baseUrl + second_transactionID);
        JSONObject j2 = new JSONObject(response2.prettyPrint());
        JSONObject q2 = j2.getJSONObject("data");
        JSONArray a2 = q2.getJSONArray("messages");
        int sizeofMessagesArray2 = a2.length();


        //validating http respCode for 2nd trans ID

        response2.then().statusCode(200);
        int n = response2.getStatusCode();
        Assert.assertTrue(n != 400 && n != 500);


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

            if (A && B) {
                Assert.assertTrue(payload2.toLowerCase().contains(substring.toLowerCase()));
                Assert.assertTrue(payload2.toLowerCase().contains(substring2.toLowerCase()));
                System.out.println("Occurence at " + i);
            }


            String transStatus = "transStatus\":\"C";


            boolean One = index.equalsIgnoreCase("3DSS:MB");
            boolean Two = index.equals("ACS:DS");
            boolean Three = index.equals("DS:3DSS");
            boolean Four = index.equals("MB:MC");


            if (A && (One || Two || Three || Four)) {
                Assert.assertTrue(payload2.contains(transStatus));
                System.out.println("Occurence at " + i);
            }


            boolean bool1 = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean bool2 = index.equalsIgnoreCase("ACS:MC[1]");
            String transStatusY = "transStatus\":\"Y";

            if (bool1 && bool2) {
                Assert.assertTrue(payload2.toLowerCase().contains(transStatusY.toLowerCase()));
                System.out.println("Occurence at " + i);
                System.out.println("SAp");
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


            boolean INDEX_dsAcs = index.equalsIgnoreCase("DS:ACS");

            String devInfo = "deviceInfo";

            //validating device info and decoding the message

            if (A && INDEX_dsAcs) {
                Assert.assertTrue(payload2.contains(devInfo), "Error: " + devInfo + " not found.");
                System.out.println("Occurence at " + i);


                String[] arr1 = payload2.split("deviceInfo\\\":\\\"");
                // System.out.println("val="+arr1[arr1.length-1]);

                String[] arr2 = arr1[arr1.length - 1].split("\",\"");
                String encodedString = arr2[0];
                //System.out.println("val = "+ encodedString);


                Base64.Decoder decoder = Base64.getDecoder();
                byte[] decoded = decoder.decode(encodedString);
                String decoded_String = new String(decoded);
                // System.out.println("Decoded String = " + decoded_String);


                Assert.assertTrue(decoded_String.contains("SCA") && decoded_String.contains("deviceCookie"));


                // trying out json

                JSONObject decoded_object = new JSONObject(decoded_String);
                JSONObject sca_object = decoded_object.getJSONObject("SCA");
                Qa19_deviceCookie_2 += (String) sca_object.get("deviceCookie");

                //Assert.assertEquals(QA19deviceCookie1, Qa19_deviceCookie_2, "Error: device cookie2 value of " + Qa19_deviceCookie_2 + " != device cookie 1 value of " + QA19deviceCookie1);


            }


        }

        cookies2.add(Qa19_deviceCookie_2);

        for (String cookie2 : cookies2)
            Files.write(Paths.get("/Users/Fayeem/Desktop/Cookie_Values/qa19cookies2.txt"), cookie2.getBytes());


        System.out.println("STARTdeviceCookie = " + Qa19_deviceCookie_2 + "END");


        Assert.assertTrue(count > 0);
        System.out.println("Total number of times DSReference Number RSA Appears: " + count);


    }

    //testqa20
    @Test(dataProvider = "transactionID_SCA_MOBILE_20")
    public void test_SCA_QA_20(String transactionID_endpoint) {


        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();

        //validating valid response codes

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

        }

        //transStatus = C  and transStatus = Y

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "transStatus\":\"C";

            boolean A = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean B = index.equalsIgnoreCase("3DSS:MB");
            boolean C = index.equals("ACS:DS");
            boolean D = index.equals("DS:3DSS");
            boolean E = index.equals("MB:MC");

            if (A && (B || C || D || E)) {
                Assert.assertTrue(payload.contains(transStatus));
                System.out.println("Occurence at " + i);
            }

            boolean X = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean X2 = index.equalsIgnoreCase("ACS:MC[1]");
            String transStatusY = "transStatus\":\"Y";

            if (X && X2)
                Assert.assertTrue(payload.contains(transStatusY));


            boolean N = flowId.equalsIgnoreCase("RREQ_RRES_V1");
            boolean N2 = index.equalsIgnoreCase("01");
            boolean N3 = index.equalsIgnoreCase("02");

            if (N && (N2 || N3))
                Assert.assertTrue(payload.contains(transStatusY));


        }

//        //validating DS = msigniamockRSA

        int Count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_RSA";

            if (payload.contains(transStatus)) {
                Count++;
                System.out.println("Occurence at " + i);
            }

        }

        Assert.assertTrue(Count > 0);
        System.out.println("Total number of times DSReference Number RSA Appears: " + Count);

        //validating messageExtension under payload


        int zCount = 0;

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            String substring = "messageExtension";

            boolean A = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean B = index.equalsIgnoreCase("ACS:MC[0]");

            boolean messageExtensionExists = payload.toLowerCase().contains("messageExtension".toLowerCase());

            if (A && B) {
                Assert.assertTrue(messageExtensionExists);
                System.out.println("Occurence at " + i);


            }

            boolean O = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean P = index.equalsIgnoreCase("MC:ACS[1]");

            if (O && P) {
                Assert.assertTrue(messageExtensionExists);
                Assert.assertTrue(payload.toLowerCase().contains("id\":\"usdk.behavioral-bio".toLowerCase()));
                Assert.assertTrue(payload.toLowerCase().contains("name\":\"usdk.behavioral-bio".toLowerCase()));
                Assert.assertTrue(payload.toLowerCase().contains("criticalityIndicator\":false".toLowerCase()));
                System.out.println("Occurence at " + i);


            }

            boolean creq_cres_app_v1 = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean bool2 = index.equalsIgnoreCase("ACS:BSE[1]");
            boolean bool3 = index.equalsIgnoreCase("BSE:ACS[1]");
            boolean mc_acs1 = index.equalsIgnoreCase("MC:ACS[1]");

            if (creq_cres_app_v1 && (bool2 || bool3)) {
                zCount++;
            }


            //validating typing pattern

            if (creq_cres_app_v1 && mc_acs1) {
                Assert.assertTrue(payload.toLowerCase().contains("typingPattern".toLowerCase()));
                System.out.println("Im here");
            }


        }

        Assert.assertTrue(zCount > 0, "no such index found");


    }





   //qatest20.1
    @Test(dataProvider = "transactionID_SCA_MOBILE_20_1")
    public void test_SCA_QA_20_1(String transactionID_endpoint) {


        Response response = given().get(baseUrl + transactionID_endpoint);
        JSONObject j = new JSONObject(response.prettyPrint());
        JSONObject q = j.getJSONObject("data");
        JSONArray a = q.getJSONArray("messages");
        int sizeofMessagesArray = a.length();

        //validating valid response codes

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

        }

        //transStatus = C  and transStatus = Y

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "transStatus\":\"C";

            boolean A = flowId.equalsIgnoreCase("AREQ_ARES_V1");
            boolean B = index.equalsIgnoreCase("3DSS:MB");
            boolean C = index.equals("ACS:DS");
            boolean D = index.equals("DS:3DSS");
            boolean E = index.equals("MB:MC");

            if (A && (B || C || D || E)) {
                Assert.assertTrue(payload.contains(transStatus));
                System.out.println("Occurence at " + i);
            }

            boolean X = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean X2 = index.equalsIgnoreCase("ACS:MC[1]");
            String transStatusY = "transStatus\":\"Y";

            if (X && X2)
                Assert.assertTrue(payload.contains(transStatusY));


            boolean N = flowId.equalsIgnoreCase("RREQ_RRES_V1");
            boolean N2 = index.equalsIgnoreCase("01");
            boolean N3 = index.equalsIgnoreCase("02");

            if (N && (N2 || N3))
                Assert.assertTrue(payload.contains(transStatusY));


        }

//        //validating DS = msigniamockRSA

        int Count = 0;
        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            //System.out.println(payload);
            String substring = "purchaseInfo";
            String substring2 = "authenticationRequestParameters";
            String transStatus = "dsReferenceNumber\":\"MSIGNIA_MOCK_DS_RSA";

            if (payload.contains(transStatus)) {
                Count++;
                System.out.println("Occurence at " + i);
            }

        }

        Assert.assertTrue(Count > 0);
        System.out.println("Total number of times DSReference Number RSA Appears: " + Count);

        //validating messageExtension under payload


        int zCount = 0;

        for (int i = 0; i < sizeofMessagesArray; i++) {
            JSONObject obj2 = a.getJSONObject(i);
            String flowId = (String) obj2.get("flowId");
            String index = (String) obj2.get("index");

            JSONObject data = obj2.getJSONObject("data");
            String payload = (String) data.get("payload");
            String substring = "messageExtension";

            boolean A = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean B = index.equalsIgnoreCase("ACS:MC[0]");

            boolean messageExtensionExists = payload.toLowerCase().contains("messageExtension".toLowerCase());

            if (A && B) {
                Assert.assertTrue(messageExtensionExists);
                System.out.println("Occurence at " + i);


            }

            boolean O = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean P = index.equalsIgnoreCase("MC:ACS[1]");

            if (O && P) {
                Assert.assertTrue(messageExtensionExists);
                Assert.assertTrue(payload.toLowerCase().contains("id\":\"usdk.behavioral-bio".toLowerCase()));
                Assert.assertTrue(payload.toLowerCase().contains("name\":\"usdk.behavioral-bio".toLowerCase()));
                Assert.assertTrue(payload.toLowerCase().contains("criticalityIndicator\":false".toLowerCase()));
                System.out.println("Occurence at " + i);


            }

            boolean creq_cres_app_v1 = flowId.equalsIgnoreCase("CREQ_CRES_APP_V1");
            boolean bool2 = index.equalsIgnoreCase("ACS:BSE[1]");
            boolean bool3 = index.equalsIgnoreCase("BSE:ACS[1]");
            boolean mc_acs1 = index.equalsIgnoreCase("MC:ACS[1]");

            if (creq_cres_app_v1 && (bool2 || bool3)) {
                zCount++;
            }


            //validating typing pattern

            if (creq_cres_app_v1 && mc_acs1) {
                Assert.assertTrue(payload.toLowerCase().contains("typingPattern".toLowerCase()));
                System.out.println("Im here");
            }


        }

        Assert.assertTrue(zCount > 0, "no such index found");


    }









}










































































