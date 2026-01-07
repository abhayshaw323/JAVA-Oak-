import java.util.Scanner;
public class BInary_to_Decimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        String binarystr = sc.next(); // take input as a string 

        if (!binarystr.matches("[01]+")){
            System.out.println("Invalid input! Please enter only 0s and 1s");
            return;
        }

        int binary_num = Integer.parseInt(binarystr);
        int ans = 0;
        int pw = 1;

        while(binary_num>0){
            int unit_digit = binary_num % 10;
            ans += (unit_digit * pw );
            binary_num /= 10;
            pw *= 2;

        }
        System.out.println(ans);
        sc.close();
    }
}