import java.util.*;
public class UpdateInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
         numbers.add(1);
         numbers.add(2);
         numbers.add(3);
         numbers.add(4);
         numbers.add(5);
         numbers.add(6);
         System.out.println("Before Updation " +numbers);
         numbers.set(0, 7);
         System.out.println("After Updation " +numbers);
    }
    
}
