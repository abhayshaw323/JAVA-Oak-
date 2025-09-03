import java.util.*;
public class Checking {
    public static void main(String[] args) {
         ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grape");
        fruits.add("Honeydew");

       boolean found = fruits.contains("Apple");
        System.out.println("Contains'Apple'? " + found);
    }
    
}
