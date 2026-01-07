import java.util.Arrays;
public class Most_frequent_Character_Second_optimal {
    static char frequent_Character(String s ){
      int n =s.length();
      int maxFreq = -1;
      char ans = s.charAt(0);
      int[] freq = new int[26];
      for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        int idx = ch -97;
        freq[idx]++;
      }
      for(int i=0;i<n;i++){
        if(freq[i]>maxFreq){
            maxFreq = freq[i];
            ans = (char) (i + 97);
        }
      }
        return ans;
    }
    public static void main(String[] args) {
        String s = "testsample";
        System.out.println(frequent_Character(s));
    }
}

// T.C. = O(n)


