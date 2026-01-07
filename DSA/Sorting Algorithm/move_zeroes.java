public class move_zeroes{
    static void move_zeros(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j] == 0 && a[j+1] != 0){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp; 
                }
                
            }
        }
        for(int val : a){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,5,0,3,4,2};
        move_zeros(arr);
    }
}