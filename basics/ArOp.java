import java.util.Scanner;
public class ArOp {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println(x^y);
        System.out.println(x&y);
        System.out.println("The number x is "+x);
        System.out.println(""+x+y);

    }
}   
