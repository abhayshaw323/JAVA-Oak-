import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int ans = fact(n);
        System.out.println(ans);
    }

    public static int fact(int n){
        if (n==0 || n==1) return 1;
        int ans = n* fact(n-1);
        return ans;
    }
}
