//Create a HashMap of country-capital pairs and print the map. 
import java.util.*;
    public class HM_Example{
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
        }
    }