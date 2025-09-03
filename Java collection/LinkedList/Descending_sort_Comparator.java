import java.util.*;
public class Descending_sort_Comparator {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();
        number.add(10); 
        number.add(20); 
        number.add(80); 
        number.add(8); 
        number.add(9);
        
        System.out.println("The number are : " + number);

        Collections.sort(number,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
        System.out.println("Sorted Descending : " + number);
    }
    

}
