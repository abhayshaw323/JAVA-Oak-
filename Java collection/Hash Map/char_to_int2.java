// given a map to char to int mapping,where values are unique,display key with the max value.
import java.util.*;
public class char_to_int2 {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();

        map.put('W',10);
        map.put('E',4);
        map.put('Y',14);
        map.put('Q',8);

        int maxval = Integer.MIN_VALUE;
        int maxKey = 'z';

        for(var elem: map.entrySet())
        {
            if(elem.getValue() > maxval)
            {
                maxval = elem.getValue();
                maxKey = elem.getKey();
            }
        }
        System.out.println(maxKey);
    }
}
