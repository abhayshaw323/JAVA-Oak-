public class BinarySearch {
    public static int solution(int[] arr , int target){
        int n = arr.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low +high )/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) { 
                low = mid + 1;
            }
            else { 
                high = mid - 1 ;
            }
        }
        return -1;
    }
    public static void main (String[] args){
        int arr[] ={-1,0,3,5,9,12};
        int target = 9;
        System.out.println(solution(arr,target));
    }
}
