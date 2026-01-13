public class FirstOccurence {
        public static int firstOccurence(int[] arr, int tar){
            int low = 0;
           int high = arr.length -1 ;
           int idx = -1;
           while(low<= high){
            int mid = (low + high)/2; 
                  if(arr[mid] > tar) {
                    high = mid -1 ;
                  }
                  else if(arr[mid] < tar){
                    low = mid + 1;
                  }
                  else {
                    idx = mid;
                    high = mid -1;
                  }

           }
           return idx;
        }


    public static void main(String[] args) {
        int target = 5;
        int[] arr = {1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        System.out.println(firstOccurence(arr,target));
    }
    
}
