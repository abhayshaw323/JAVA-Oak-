public class RecursionOnArray {
        public static void recPrint(int[] nums, int idx){
            int n = nums.length;
            if(idx == n) return;
            System.out.println(nums[idx]);
            recPrint(nums, idx+1);
        }
    



    public static void main(String[] args) {
        int[] arr = {5,3,7,12,76,9,34,5};
        recPrint(arr,0);
    }
}
