public class set_mismatch {

    static int[] findErrorNums(int[] nums) {
    int n = nums.length;
    int[] freq = new int[n + 1];   // 1-based indexing
    int[] ans = new int[2];        // [duplicate, missing]

    // Count frequency of each number
    for (int num : nums) {
        freq[num]++;
    }

    // Find duplicate and missing
    for (int i = 1; i <= n; i++) {
        if (freq[i] == 2) {
            ans[0] = i;     // duplicate
        }
        if (freq[i] == 0) {
            ans[1] = i;     // missing
        }
    }

    return ans;
}

    
    public static void main(String[] args) {
            int[] arr = {1,2,2,4};
            System.out.println(java.util.Arrays.toString(findErrorNums(arr)));
}
}