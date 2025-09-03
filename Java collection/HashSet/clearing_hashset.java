import java.util.*;
public class clearing_hashset {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
       // colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Black");
        colors.add("Belt");

        System.out.println(colors.size());
        colors.clear();
        System.out.println(colors.size());

        boolean status = colors.isEmpty();
        System.out.println(status);
        System.out.println(status);
    }

}



    

