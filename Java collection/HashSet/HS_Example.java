import java.util.*;
public class HS_Example {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(10);//duplictaes will not be allowed
        numbers.add(20);
        numbers.add(50);
        numbers.add(50);
        numbers.add(30);

        if(numbers.contains(10))
        {
            System.out.println("Already there!");
        }
        else{
            System.out.println("the number is not there ");
        }

        System.out.println("HashSet" + numbers);

    }
    
}
