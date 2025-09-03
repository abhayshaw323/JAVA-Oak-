import java.util.*;
public class ClearArray {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Tokyo");
        cities.add("newyork");
        cities.add("newjersey");
        cities.add("london");
        cities.add("Sydney");
        cities.add("Moscow");
        cities.clear();
        System.out.println("index of tokyo:" + cities);
    }
}
