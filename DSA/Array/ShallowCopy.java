import java.util.Scanner;
public class ShallowCopy {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]  + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing the Original array");
        printArray(arr);

        //trying too copy arr to arr_2
        int[] arr_2 =  arr;
        System.out.println("Printing the Copied array");
        printArray(arr_2);

        // Changing the value of arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("Original array after changing the arr_2");
        printArray(arr);
        System.out.println("Copied array after changing the arr_2");
        printArray(arr_2);

    }






}
