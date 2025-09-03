import java.util.*;
public class problem{
    public static void main(String[] args) {
        Stack<Integer> pro = new Stack<>();
        pro.push(5);
        pro.push(12);
        pro.push(55);
        pro.push(58);
        pro.push(65);
        pro.push(78);
    
        while(!pro.empty()){
            System.out.print(pro.pop()+" ");
        }

    }
}