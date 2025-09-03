import java.util.*;
public class getting_Size_clearing_map {
    public static void main(String[] args) {
        HashMap<String,Integer> number = new HashMap<>();
        number.put("x",8);
        number.put("e",5);
        number.put("p",7);
        number.put("o",2);
        number.put("w",1);
        number.put("i",0);

        System.out.println("size before clear:" + number.size());
        number.clear();
        System.out.println("Size after clear: " + number.size());

    }
}
