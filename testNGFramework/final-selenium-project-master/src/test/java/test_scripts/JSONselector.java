package test_scripts;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONselector {
    boolean finalTranStatusisA = false;
    boolean finalTranStatusisN = false;
    boolean finalTranStatusisU = false;
    boolean finalTranStatusisY = false;
    boolean finalTranStatusisR = false;

    //define method if PA/NPA
    //finalTranStatus

    public int getSizOfRecords(String filePath){
        int sizeOfArray=0;
        try {
            JSONselector jsoNselector = new JSONselector();
            String contents = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONObject o = new JSONObject(contents);
            JSONArray studentDetails = o.getJSONArray("records");
            sizeOfArray += studentDetails.length();
        }catch (Exception e){
            e.printStackTrace();
        }

        return  sizeOfArray;

    }

    public boolean hasStatusOfNPA(String fileName, int nth_element){
        boolean isNPA = false;
        String finalPurchaseStatus="";

        try {
            String contents = new String(Files.readAllBytes(Paths.get(fileName)));
            JSONObject o = new JSONObject(contents);
            JSONArray studentDetails = o.getJSONArray("records");
            JSONObject studentName = (JSONObject) studentDetails.get(nth_element);
            JSONObject secondObj = (JSONObject)studentName.get("fields");
            JSONArray purchaseStatus = (JSONArray)secondObj.get("Message Category (from Scenarios)");

            for(int i =0; i < purchaseStatus.length();i++) {
                 finalPurchaseStatus += purchaseStatus.get(i).toString();
            }
            if(finalPurchaseStatus.equalsIgnoreCase("NPA"))
                isNPA = true;





        }catch (Exception e){
            e.printStackTrace();
        }
        return isNPA;

    }

    public String getCardRange(String fileName, int nth_element){
        String cardNumber="";
        try {
            String contents = new String(Files.readAllBytes(Paths.get(fileName)));
            JSONObject o = new JSONObject(contents);
            JSONArray studentDetails = o.getJSONArray("records");
            JSONObject studentName = (JSONObject) studentDetails.get(nth_element);
            JSONObject secondObj = (JSONObject)studentName.get("fields");
            cardNumber += (String)secondObj.get("Card Range");



//            for(int i =0; i< studentDetails.length();i++) {
//                JSONObject studentName = (JSONObject) studentDetails.get(i);
//                //System.out.println(studentName);
//                JSONObject secondObj = (JSONObject) studentName.get("fields");
//                String cardNumber = (String) secondObj.get("Card Range");
//                //hold the cardNum value..store it in a variable..use it for later during test..
////                JSONArray TransStatus = (JSONArray) secondObj.get("Final TransStatus (from Scenarios)");
////                for (int j = 0; j < TransStatus.length(); j++) {
////                    String finalTransStatus = TransStatus.get(j).toString();
////                    if (finalTransStatus.equalsIgnoreCase("A")) {
////                        finalTranStatusisA = true;
////                    } else if (finalTransStatus.equalsIgnoreCase("Y")) {
////                        finalTranStatusisY = true;
////                    } else if (finalTransStatus.equalsIgnoreCase("N")) {
////                        finalTranStatusisN = true;
////
////                    } else if (finalTransStatus.equalsIgnoreCase("U")) {
////                        finalTranStatusisU = true;
////                    } else
////                        finalTranStatusisR = true;
////                }
//
//
//            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return cardNumber;
    }

    public boolean hasChallengeField(String fileName, int nthElement){

        boolean doesChallengeTypeFieldexist = false;


        try {
            String contents = new String(Files.readAllBytes(Paths.get(fileName)));
            JSONObject o = new JSONObject(contents);
            JSONArray studentDetails = o.getJSONArray("records");
            JSONObject studentName = (JSONObject) studentDetails.get(nthElement);
            JSONObject secondObj = (JSONObject)studentName.get("fields");
            for(int i=0;i<secondObj.length();i++){
                if(secondObj.has("Challenge Type - ACS (from Scenarios)"))
                    doesChallengeTypeFieldexist = true;
            }



        }catch (Exception e){
            e.printStackTrace();
        }



        return doesChallengeTypeFieldexist;
    }





}
