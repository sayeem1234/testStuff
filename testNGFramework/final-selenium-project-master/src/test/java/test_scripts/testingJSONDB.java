//package test_scripts;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//public class testingJSONDB {
//    public static void main(String[] args) throws IOException {
//
//        String fileName = "/Users/Fayeem/Desktop/cards2.json";
//        String contents = new String(Files.readAllBytes(Paths.get(fileName)));
//        JSONObject o = new JSONObject(contents);
//        JSONArray studentDetails = o.getJSONArray("records");
//        String []arr = new String[studentDetails.length()];
//        for(int i =0; i<studentDetails.length();i++){
//            JSONObject studentName = (JSONObject) studentDetails.get(i);
//            JSONObject secondObj = (JSONObject)studentName.get("fields");
//            String cardNumber = (String)secondObj.get("Card Range");
//            arr[i] = cardNumber;
//        }
//        for(String cardNum: arr)
//            System.out.println(cardNum);
//
//
//
//    }
//}
