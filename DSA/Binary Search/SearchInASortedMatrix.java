public class SearchInASortedMatrix {
    
    public static boolean SearchMatrix(int[][] arr , int target){
        int rows = arr.length,cols = arr[0].length;
        System.out.println(rows);
        System.out.println(cols);
        int lo = 0, hi = rows*cols-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int midRow = mid / cols, midCol = mid % cols;
            if(arr[midRow][midCol] == target) return true;
            else if(arr[midRow][midCol]>target) hi = mid-1;
            else lo = mid +1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,6,12,27,32},
            {38,41,47,49,55},
            {67,68,75,76,81},
            {84,89,91,92,98}
            };
            int target = 0;
            System.out.println(SearchMatrix(arr,target));
    }
}
