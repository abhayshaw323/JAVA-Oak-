import java.util.*;
public class element_exist_checking {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("Avacado");
        fruits.add("Strawberry");

        System.out.println(fruits);

        System.out.println(fruits.contains("abhay"));
        
        boolean hasApple = fruits.contains("apple");
        System.out.println(hasApple);
    }
}



