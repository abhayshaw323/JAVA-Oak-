import java.util.*;
public class Removing_Entry {
    public static void main(String[] args) {
        HashMap<String,Integer> number = new HashMap<>();
        number.put("x",7);
        number.put("y",8);
        number.put("z",9);
        number.put("r",3);
        number.put("t",1);
        number.put("p",0);

        System.out.println("Corresponding values and numbers : " + number);

        number.remove("y");

        System.out.println("Updated : " + number);
    }
    
}
