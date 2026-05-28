import java.util.Scanner;

public class Histogram_Pattern_Printing {

    public static void pattern(int[] arr) {

        int max = 0;

        for (int x : arr) {
            max = Math.max(max, x);
        }

        for (int row = 1; row <= max; row++) {

            for (int col = 0; col < arr.length; col++) {

                if (arr[col] >= row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        pattern(arr);

        sc.close();
    }
}