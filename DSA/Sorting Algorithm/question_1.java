
//   Find the longest consecutive 1's in the array

public class question_1 {
    static int solution(int[] nums){
        int n = nums.length;
        int max = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;

            if(count>max){
                max = count;
            }
            }
            else{
                count = 0;
            }
        }

        return max;
        
    }

    public static void main(String[] args) {
            int[] arr = {1,1,0,1,1,1};
            System.out.println((solution(arr)));
    }
}
