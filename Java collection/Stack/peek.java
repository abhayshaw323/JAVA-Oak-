import java.util.*;
public class peek {
    public static void main(String[] args) {
        Stack<Character> alphabet = new Stack<>();
        alphabet.push('X');
        alphabet.push('A');
        alphabet.push('B');
        alphabet.push('C');
        alphabet.push('L');
        System.out.println(alphabet.peek());
        System.out.println(alphabet);
        
    }
}
