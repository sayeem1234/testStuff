//package test_scripts;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//public class size {
//    static String file = "/Users/Fayeem/Desktop/cards2.json";
//    public static void main(String[] args) {
//        System.out.println(getSize(file));
//
//
//    }
//
//    public static int getSize(String fileName){
//        int sizeOfArray=0;
//        try {
//            JSONselector jsoNselector = new JSONselector();
//            String contents = new String(Files.readAllBytes(Paths.get(fileName)));
//            JSONObject o = new JSONObject(contents);
//            JSONArray studentDetails = o.getJSONArray("records");
//            sizeOfArray += studentDetails.length();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//       return  sizeOfArray;
//    }
//
//
//
//}
