    class Solution {
    public int hIndex(int[] citations) {
        
        int n = citations.length;
        int[] count = new int[n+1]; 
        
        for(int c  : citations){
            if(c>=n) {
                count[n]++;
            }
            else {
                count[c]++;
            }
        }
        
        int total = 0;
        for(int i=n;i>=0;i--){
            total = count[i] +total;
            if(total>=i){
                return i;
            }
        }
        return 0;
        
    }
}
public class finding_H_index {
    public static void main(String[] args) {
        Solution sol = new Solution();
    
        int[] citations = {3, 0, 6, 1, 5};
        
        int result = sol.hIndex(citations);
        
        System.out.println("H-Index: " + result);
    }
}
