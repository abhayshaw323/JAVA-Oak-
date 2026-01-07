import java.util.Scanner;
public class rectangularPatern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the column");
        int r = sc.nextInt();
        System.out.println("Enter the Rows");
        int c = sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}