//Iterate over the keys in a HashMap and print each key with its corresponding value.
import java.util.*;
public class iterating_over_key {
    public static void main(String[] args) {
        HashMap<String,Integer> number = new HashMap<>();
        number.put("x",8);
        number.put("e",5);
        number.put("p",7);
        number.put("o",2);
        number.put("w",1);
        number.put("i",0);

        for (String numbers : number.keySet()){
            System.out.println(number + "->" + number.get(numbers));
        } 
    }
}
