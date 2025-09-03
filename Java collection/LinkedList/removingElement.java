import java.util.*;
public class removingElement {
    public static void main(String[] args) {
         LinkedList<String> names = new LinkedList<>();
        names.add("ALice");
        names.add("Bob");
        names.add("cherry");
        names.add("Banana");
        names.add("chocolate");

        // System.out.println("----------------------------------------------------------");
        // System.out.println("The linked list is " + names);
        
        // System.out.println("The first element is " + names.getFirst() + ".");
        // System.out.println("The Last element is " + names.getLast() + ".");
        // names.set(0,"Abhay");
        // System.out.println("The updated element is " + names + ".");
        
        
        System.out.println("----------------------------------------------------------");
        System.out.println("After removing first elemennt " + names.removeFirst());
        System.out.println("After removing last elemennt " + names.removeLast());
        System.out.println("The updated code" + names);

    }
}
