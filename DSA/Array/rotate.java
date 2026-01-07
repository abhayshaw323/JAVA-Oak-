public class rotate {
static int[] rotate(int[] arr, int k){
    int n = arr.length;
    k = k % n;
    int[] ans = new int [n];
     int j = 0;
     for(int i=n-k; i<n;i++){
        ans[j++] = arr[i];
     }

     for(int i=0;i<n-k;i++){
        ans[j++] = arr[i];
     }

    return  ans;
}
    public static void main(String[] args) {
        int k = 5;
        int[] arr = {1,2,3,4,5,6,7};
        int[] ans = rotate(arr,k);
        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}
