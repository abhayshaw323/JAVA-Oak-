import java.util.LinkedList;
public class insertion_At_End_At_Beg {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(5);
        numbers.add(4);
        numbers.add(9);
        numbers.add(7);
        numbers.add(6);
        System.out.println("Before adding element " + numbers);
        
        numbers.addFirst(8);
        System.out.println("After adding at first " + numbers);

        numbers.addLast(2);
        System.out.println("After adding at last " + numbers);
    }
}
