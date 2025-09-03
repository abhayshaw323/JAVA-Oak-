import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        Integer [] numbers = {8,5,9,4,6,1};
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("The normal number is " + numList);

       Collections.sort(numList);
        System.out.println("The sorted array is " + numList);

      //  Collections.reverse(numList);
        System.out.println("The reversed array is " + numList.reversed());
    }
}
