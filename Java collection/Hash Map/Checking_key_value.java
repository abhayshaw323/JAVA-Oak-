import java.util.*;
public class Checking_key_value {
    public static void main(String[] args) {
            HashMap<String,String> capitals = new HashMap<>();
            capitals.put("USA","Washington,D.C.");
            capitals.put("France","Paris");
            capitals.put("Japan","Tokyo");
            capitals.put("Germany","Berlin");
            capitals.put("Brazil","Brasilla");
            capitals.put("Canada","Ottawa");

           System.out.println("Contains key 'India' : " + capitals.containsKey("Canada"));
           System.out.println("Contains value 'Paris' : " + capitals.containsValue("Paris"));

           for(String cap : capitals.keySet()){
            System.out.println(capitals  + " --> " + capitals.get(cap));
           }
    }    
}
