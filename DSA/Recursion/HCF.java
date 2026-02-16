import java.util.*;
public class HCF {
    public static int HCF(int a, int b){
        if(a==0) return b;
        return HCF(b%a,a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int a = sc.nextInt();
        System.out.print("Enter the second number ");
        int b = sc.nextInt();
        int hcf = 1;
        HCF(a,b);

        for(int i=1;i<=Math.min(a,b);i++){
                if(a%i==0 && b%i==0){
                    hcf = i;
                }
        }
        System.out.println("HCF = " + hcf);
    }
    
}
