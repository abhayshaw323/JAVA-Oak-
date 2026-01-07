public class Insertion_Sort {
    static void insertionSort(int[] a){
        int n = a.length;
        for(int i=1;i<n;i++){
            int j =i;

            while(j>0 && a[j] < a[j-1] ){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,3,2,5,7,8};
        insertionSort(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    
}
// Worst case   ->  O(n^2)
// Average case ->  O(n^2)
// Best Case    ->  O(n^2)
// Inplace
// Stable

// if the relative order of the duplicate element is maintained in the sorted array as it is in the unsorted array is called stable sorting algorithm