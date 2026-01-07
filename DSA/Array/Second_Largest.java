import java.util.Scanner;
import java.util.Arrays;
public class Second_Largest {
    static int second_largest_element(int[] arr){
        Arrays.sort(arr);
        int n = arr[arr.length-2];
        return n;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of element");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
    }
    System.out.println(second_largest_element(arr));
    
        
    }
}
