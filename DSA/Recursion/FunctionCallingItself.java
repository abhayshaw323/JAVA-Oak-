import java.util.*;

public class FunctionCallingItself{
    static int n;
    public static void main(String[] args) {
        print(5);
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        write(n);
    }

    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }

    public static void write(int n){
        if(n==0) return;
        write(n-1);
        System.out.println(n+"");
    }
}