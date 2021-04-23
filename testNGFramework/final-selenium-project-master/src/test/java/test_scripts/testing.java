package test_scripts;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class testing {

    public static void main(String[] args) throws IOException {
//        String contents = new String(Files.readAllBytes(Paths.get("/Users/Fayeem/Desktop/SampleAPPJSONFILES/QA1Browser.json")));
//        JSONObject o = new JSONObject(contents);
//        JSONArray studentDetails = o.getJSONArray("records");
//        String[] arr = new String[studentDetails.length()];
//        for (int i = 0; i < studentDetails.length(); i++) {
//            JSONObject studentName = (JSONObject) studentDetails.get(i);
//            JSONObject secondObj = (JSONObject) studentName.get("fields");
//            String cardNumber = (String) secondObj.get("Card Range");
//            arr[i] = cardNumber;
//        }
//
//        for(String x:arr)
//            System.out.println("v:"+x);

        // api


        BufferedReader brTest = new BufferedReader(new FileReader("/Users/Fayeem/Desktop/MOCK_TEST_ID/simple.txt"));
        String paragraph = brTest.readLine();
        //System.out.println(text);
        String[] List = paragraph.split("(?<=\\G...)");
        String[] arr2 = new String[List.length]; //secondArray
        for (int i =0; i < List.length;i++)
        {
            arr2[i]=List[i];

        }

        for(String x:arr2)
            System.out.println("v"+x);









    }


    public static Object[] readJson1() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("/Users/Fayeem/Desktop/SampleAPPJSONFILES/QA1Browser.json")));
        JSONObject o = new JSONObject(contents);
        JSONArray studentDetails = o.getJSONArray("records");
        String[] arr = new String[studentDetails.length()];
        for (int i = 0; i < studentDetails.length(); i++) {
            JSONObject studentName = (JSONObject) studentDetails.get(i);
            JSONObject secondObj = (JSONObject) studentName.get("fields");
            String cardNumber = (String) secondObj.get("Card Range");
            arr[i] = cardNumber;
        }

        return arr;

    }











}
