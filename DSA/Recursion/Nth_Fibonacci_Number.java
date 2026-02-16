import java.util.*;
public class Nth_Fibonacci_Number {
    public static int Fibonacci(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        int result = Fibonacci(n);
        System.out.println(result);
    }
    
}
