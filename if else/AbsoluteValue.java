import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is: ");
        int x = sc.nextInt();
        if (x >= 0 ){

            System.out.println("The absolute value is "+x);
        }
        if (x<0){
            x = x * -1;
            System.out.println("The absolute value is "+x);
        }
    }
}
