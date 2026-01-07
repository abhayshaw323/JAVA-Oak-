import java.util.Scanner;
import java.util.Arrays;
public class reverse {
    static int[] reverse(int[] arr){
        int i = 0;
        int[] ans = new int[arr.length];
        for(int j=arr.length-1;j>=0;j--){
            ans[i++] = arr[j];
        }
        return ans;
    }
    static void printArray(int[] arr){
        for(int x : arr){
            System.out.println(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
               }
        int[] ans= reverse(arr);
        printArray(ans);


    }
    
}
