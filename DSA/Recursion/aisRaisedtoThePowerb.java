import java.util.*;
public class aisRaisedtoThePowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base ");
        int a = sc.nextInt();
        System.out.print("Enter Exponent ");
        int b = sc.nextInt();
        System.out.println("Raised to the power " +b+" is "+Math.pow(a,b));
        System.out.println("Raised to the power " +b+" is "+pow(a,b));
        System.out.println("Raised to the power " +b+" is "+power(a,b));
    }
    public static int pow(int a,int b){
        if(b==0) return 1;
        return a *pow(a,b-1);
    }
    public static int power(int a,int b){
        if(b==0) return 1;
        int call = power(a,b/2);
        if(b%2==0) return call * call;
        else return a * call * call;

    }
}
