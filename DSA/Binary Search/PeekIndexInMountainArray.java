import java.util.Scanner;

public class PeekIndexInMountainArray {
    public static int peek(int[] arr){
        int low = 1, high = arr.length -2 ;                                                      
        // System.out.println(low+high);                                                          
        while (low<=high) {                                                                       
            int mid = (low+high)/2;                                                               
            if(arr[mid] > arr[mid-1] && arr[mid]>arr[mid+1]){                                     
                return arr[mid];
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                low = mid +1;
            }
            else {
                high = mid - 1;
            }
        }
        return 0;
    }
        public static void main(String[] args) {
            int[] arr = {-1,0,1,2,3,6,7,8,3,2,1,0,-1};
            // int[] arr = {1,2,5,6,8,6,3};
            // int[] arr = {1,3,5,6,7,4,2};
            
            System.out.println(peek(arr));
        
        }    
}
                    