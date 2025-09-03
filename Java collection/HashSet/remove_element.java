
import java.util.*;
public class remove_element {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        numbers.add(80);

        numbers.remove(20);
        System.out.println(numbers);
        }    
}
