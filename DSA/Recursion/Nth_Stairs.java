import java.util.Scanner;

public class Nth_Stairs {
    public static int CountWays(int  n){
        if(n==1) return 1;
        if(n==2) return 2;
        return CountWays(n-1) + CountWays(n-2);
    } 

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        int result = CountWays(n);
        System.out.println(result);
    }

}
