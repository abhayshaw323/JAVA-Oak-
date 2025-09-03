import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length ");
        int len = sc.nextInt();
        System.out.println("Enter the breadth ");
        int bre = sc.nextInt();
        int A_r = len * bre;
        int p_r = 2*(len+bre);
        if(A_r > p_r){
            System.out.println("Area of rectangle is greater");

        }
        else{
            System.out.println("Perimeter of rectangle is greater");
        }
    }
}
