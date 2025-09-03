import java.util.*;
public class iterate_over_stack{
    public static void main(String[] args) {
        Stack<Character> alphabet = new Stack<>();
        alphabet.push('A');
        alphabet.push('b');
        alphabet.push('h');
        alphabet.push('a');
        alphabet.push('y');

        System.out.println(alphabet);

        for(Character alpha : alphabet){
            System.out.println(alpha);
        }
        
    }
}