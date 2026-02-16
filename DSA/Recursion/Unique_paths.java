import java.util.Scanner;

class Solution{
    public int uniquePaths(int m, int n){
        if(n==1 && m==1) return 1;
        if(n==0 || m==0) return 0;
        return uniquePaths(m, n-1) + uniquePaths(m-1, n);
    }
}


public class Unique_paths {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        Solution obj = new Solution();
        System.out.println(obj.uniquePaths(m, n));
        
        sc.close();

}
}
