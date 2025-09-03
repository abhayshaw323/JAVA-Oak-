import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int x = sc.nextInt();
        System.out.println("The resultant AP is");
        for(int i=1;i<=2*x-1;i+=2){
            System.out.println(i);
        }
    }
}
