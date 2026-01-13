public class FloorInASortedArray {
    public static int solution(int[] nums, int tar){
        int low = 0, high = nums.length-1,idx = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>tar) high = mid - 1;
            else{
                idx = mid;
                low = mid+1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int target = 5;
        int[] arr = {1,2,8,10,10,10,12,19};
        System.out.println(solution(arr,target));
    }
    
}
