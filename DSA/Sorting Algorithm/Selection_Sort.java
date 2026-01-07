public class Selection_Sort {
    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){    // i represent the current index
            // Find the minimum element in unsorted part of thr array
            int min_index =  i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            //swap current element and minimum element  -> current index
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,3,2,5,7,8,1,4,6};
        selectionSort(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
// Worst case   ->  O(n^2)
// Average case ->  O(n^2)
// Best Case    ->  O(n^2)
// Inplace
// Not Stable

// if the relative order of the duplicate element is maintained in the sorted array as it is in the unsorted array is called stable sorting algorithm
