import java.util.*;
public class Search_element{
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();
        number.push(100);
        number.push(200);
        number.push(500);
        number.push(600);

        System.out.println("the searched element is at index : " + number.search(500));

    }
}