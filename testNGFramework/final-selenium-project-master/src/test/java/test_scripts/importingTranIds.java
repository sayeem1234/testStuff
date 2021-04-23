//package test_scripts;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//
//public class importingTranIds extends DriverWrapper {
//
//    @DataProvider(name="dp")
//    public Object[] readJson() throws IOException {
//        String[] transactionIDS = new String[30];
//        FileInputStream stream = new FileInputStream("/Users/Fayeem/Desktop/transactionIDS.txt");
//        BufferedReader brr = new BufferedReader(new InputStreamReader(stream));
//
//        String id;
//
//        for(int i =0;i<transactionIDS.length;i++)
//        {while ((id = brr.readLine()) != null)   {
//            transactionIDS[i]=id;
//        }}
//
//        return transactionIDS;
//
//    }
//
//    @Test(dataProvider = "dp")
//    //Test case #1 device=browser specVersion = 2.1.0 challengeType=null
//    public void test_01(String data) throws InterruptedException {
//        // int i = 0;
//        // String filePath = "/Users/Fayeem/Desktop/BROWSERCARDS210.json";
//        //   JSONselector jsoNselector = new JSONselector();
//        //  int totalRecords = jsoNselector.getSizOfRecords(filePath);
//        AirtableCredentials airtableCredentials = new AirtableCredentials();
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}}
