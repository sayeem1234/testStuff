package test_scripts;


import java.io.File;
import java.io.FileReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import org.apache.tools.ant.taskdefs.Classloader;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JSON {
    {
        String first = "/Users/Fayeem/Desktop/cards2.json";
        try {
            //HOW TO SPECIFY BROWSER? WRAP EVERYTHING IN IF LOGIC (IF APP=BROWSER) ...BLAHBLAHBLAH
            String contents = new String(Files.readAllBytes(Paths.get(first)));
            JSONObject o = new JSONObject(contents);
            JSONArray studentDetails = o.getJSONArray("records");
//            for(int i=0;i<studentDetails.length(); i++){
//                System.out.println(studentDetails.get(i));
//            }
            JSONObject studentName = (JSONObject) studentDetails.get(0);
            //System.out.println(studentName);

            JSONObject secondObj = (JSONObject)studentName.get("fields");
            //System.out.println(secondObj);

            //new try
            String cardNumber = (String)secondObj.get("Card Range");
            //System.out.println(cardNumber);

            JSONArray TransStatus = (JSONArray)secondObj.get("Final TransStatus (from Scenarios)");
            for(int i =0; i < TransStatus.length();i++){
                String finalTransStatus = TransStatus.get(i).toString();
                if(finalTransStatus.equalsIgnoreCase("A")){
                    System.out.println(5);
                }else if(finalTransStatus.equalsIgnoreCase("Y")){

                }
                else if(finalTransStatus.equalsIgnoreCase("N")){

                }
            }

//            String card = (String)secondObj.get("Card Range");
//            System.out.println(card);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
