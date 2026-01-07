public class Bubble_Sort{
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] a ={7,6,7,9,0,4,4,6,4,9};
        bubbleSort(a);
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}

// Worst case   ->  O(n^2)
// Average case ->  O(n^2)
// Best Case    ->  O(n)
// Inplace
// Stable

// if the relative order of the duplicate element is maintained in the sorted array as it is in the unsorted array is called stable sorting algorithm