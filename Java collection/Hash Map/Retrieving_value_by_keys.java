//retrieving a value by key.
import java.util.*;
public class Retrieving_value_by_keys {
    public static void main(String[] args) {
        HashMap<String,String> capitals = new HashMap<>();
            capitals.put("USA","Washington,D.C.");
            capitals.put("France","Paris");
            capitals.put("Japan","Tokyo");
            capitals.put("Germany","Berlin");
            capitals.put("Brazil","Brasilla");
            capitals.put("Canada","Ottawa");

            System.out.println("                             ");
            System.out.println("Country Capitals : " + capitals);
            System.out.println("                             ");
            
            System.out.println(capitals.get("Japan"));
    }
}
