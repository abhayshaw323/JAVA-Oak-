import java.util.*;
public class is_Empty {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();
        System.out.println("Is Stack empty?" + number.empty());
        number.push(100);
        System.out.println("Is Stack empty?" + number.empty());
        

    }
}
