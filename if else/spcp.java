import java.util.Scanner;
public class spcp {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the selling price");
        int SP = sc.nextInt();
        System.out.println("Enter the cost price");
        int CP = sc.nextInt();
        if (SP>CP){
            System.out.println("Vendor made a profit of " +(SP-CP));
        }
        else{
            System.out.println("Vendor incured a loss "+(CP-SP));
        }
        }
}
