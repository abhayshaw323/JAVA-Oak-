import java.util.*;
public class AcessChar {
    public static void main(String[] args) {
       ArrayList<Character> chr = new ArrayList<>();
       chr.add('A');
       chr.add('B');
       chr.add('A');
       chr.add('A');
       chr.add('A');
       
       System.out.println("Element at index 2: " + chr.get(2));
    }
    
}
