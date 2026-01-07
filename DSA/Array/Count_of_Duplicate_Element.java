public class Count_of_Duplicate_Element {
    static void Duplicate_element(int[] arr,int n){
        int count =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == n){
                count++;
            }
        }
        System.out.println(n+" is present "+count+" times in the array");
    }
    public static void main(String[] args) {
        int[] arr = {5,6,5,1,5};
        int element = 5;

        Duplicate_element(arr, element);
    }
}
