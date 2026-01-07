public class Swapping_number {
    static int[] swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        // a = a+b;
        // b = a-b;
        // a = a-b;

        return new int[]{a,b};
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        int[] result = swap(a,b);
        System.out.println("swapped a = " + result[0] + " b = " +result[1] );
    }
    
}
