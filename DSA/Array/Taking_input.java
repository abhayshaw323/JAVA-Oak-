import java.util.Scanner;
public class Taking_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the element");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }

        System.out.println("Printing the element");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i] + " is at the index "+ i);
        }
    }
}
