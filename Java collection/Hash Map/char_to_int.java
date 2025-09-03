//Given a hashmap of char to int mapping. Find the sum of all the int values in it.
import java.util.*;
public class char_to_int {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();

        map.put('B',10);
        map.put('R',18);
        map.put('I',16);
        map.put('J',20);
        map.put('O',56);
        map.put('W',87);

        int sum = 0;

        for(var elem : map.entrySet())
        {
            sum += elem.getValue();
        }
        System.out.println(sum);

        System.out.println("---");
        for(char c: map.keySet())
        {
            sum += map.get(c);
        }
        System.out.println(sum);
    }
}
