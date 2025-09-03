public class sum {
   public static void main(String[] args) {
        int[] a = {1,3,4,8,6};
        int sum = 0;
        
        for(int elem : a)
        {

            sum += elem;
        }
        System.out.println("Sum of all element : " + sum);
         
        
    }
}
