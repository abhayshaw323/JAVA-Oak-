import java.util.*;
public class iterate_over_Entries {
    public static void main(String[] args) {
        HashMap<String,Integer> number = new HashMap<>();
        number.put("x",8);
        number.put("e",5);
        number.put("p",7);
        number.put("o",2);
        number.put("w",1);
        number.put("i",0);

        for(var entry : number.entrySet()){
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}
