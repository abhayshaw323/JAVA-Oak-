import java.util.Arrays;

public class Most_frequent_Character_optimal {
  
    static char frequent_Character(String s ){
      int n =s.length();
      int maxFreq = -1;
      char ans = s.charAt(0);
      char[] arr = s.toCharArray();
      Arrays.sort(arr);
      int i=0,j=0;
      while(j<n){
        if(arr[i] == arr[j]){
            j++;
        }
        else{
            int freq = j-i;
            if(freq > maxFreq){
                maxFreq = freq;
                ans = arr[i];
            }
            i = j;
        }
      }
     int freq = j-i;
            if(freq > maxFreq){
                maxFreq = freq;
                ans = arr[i];
            }
      
     
        return ans;
    }
    public static void main(String[] args) {
        String s = "testsample";
        System.out.println(frequent_Character(s));
    }
}


// T.C. O(nlogn)