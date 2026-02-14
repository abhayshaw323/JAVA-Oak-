import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        write(n);
    }

     public static void write(int n){
        if(n==0) return;
        System.out.print(n+" ");
        write(n-1);
        System.out.print(n+" ");
    }
}
