import java.util.*;

public class Generate_parentheses {

    public static void generate(int n, int l, int r, String s,List<String> ans){
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n) generate(n,l+1,r,s+"(",ans);
        if(r<l) generate(n,l,r+1,s+")",ans);
    }

    
    public static List<String> GenerateParentheses(int n){
        List<String> ans = new ArrayList<>();
        generate(n,0,0,"",ans);
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(GenerateParentheses(n));
       
    }
    
}
