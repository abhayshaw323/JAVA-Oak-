import java.util.*;
public class iterate_over_HashSet {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Black");
        colors.add("Blue");

        for(String color : colors){

            System.out.println(color);
        }
    }
}
