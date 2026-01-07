import java.util.Arrays;
public class question {
    static int[] solution(int[] nums, int n){
        int a = nums.length;
        int left = 0;
        int right = n;
        int[] arr_1 = new int[a];
        int index = 0;
        while(left<n){
            arr_1[index++] = nums[left];
            arr_1[index++] = nums[right];
            left++;
            right++;            
        }
        return arr_1;
    }
    


    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(solution(arr,n)));
        
    }
}
