import java.util.*;
public class Descendig_Sort {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();
        number.addLast(5);
        number.addLast(7);
        number.addLast(6);
        number.addLast(3);
        number.addLast(8);
        number.addLast(1);
        number.addLast(2);

        System.out.println("The number are : " + number);
        Collections.sort(number);
        System.out.println(number);
    }
}

    

