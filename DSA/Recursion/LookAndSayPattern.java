import java.util.*;
class Solution {
    public String countAndSay(int n){
        if(n==1) return "1";
        String s = countAndSay(n-1);
        String ans = "";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int freq = j-i;
                ans += freq;
                ans += s.charAt(i);
                i = j;
            }
        }
        int freq = j-i;
        ans += freq;
        ans += s.charAt(i);
        return ans;
    }
}

public class LookAndSayPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Solution sol = new Solution();
        String result = sol.countAndSay(n);
        System.out.println(result);
    }
}
