public class SearchElementInSortedAndRotatedArray {
        public static int solution(int[] nums , int target){
            int lo = 0, hi = nums.length-1;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(nums[mid] == target)  return mid;
                else if(nums[lo] <= nums[mid]){ // lo to mid is sorted
                    if(nums[lo] <= target && target<nums[mid]){
                        hi = mid - 1;
                    }
                    else {
                        lo = mid + 1;
                    }
                }
                else { // mid to hi is sorted
                    if(nums[mid] < target && target <= nums[hi] ) {
                            lo = mid + 1;
                    }
                    else{
                        hi = mid - 1;
                    }
                }
            }
            return -1;
        }





    public static void main(String[] args) {
        int[] arr = {8,9,10,1,2,3,4,5,6,7};
        int target = 10;
        int result = solution(arr,target);
        if(result == -1 ){
            System.out.println("Target not found");
        }
        else{
            System.out.println("Target is found at index "+result);
        }

    }
}
