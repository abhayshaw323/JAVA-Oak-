import java.util.*;
import java.util.Arrays;
public class hashSet_to_array {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
       // colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Black");
        colors.add("Belt");

        Object[] colorsArray = colors.toArray();
        System.out.println("Array : " + Arrays.toString(colorsArray));
    }
}




