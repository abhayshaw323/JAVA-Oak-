import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";

        int left = 0;
        int right = s.length()-1;
        int flag = 1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                flag = 0;
                break;
            }
            left++;
            right--;            
        }
        if (flag == 1){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
