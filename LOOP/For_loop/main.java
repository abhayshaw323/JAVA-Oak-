public class main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] a = {1,3,2,5,6,7};
        int val = a[1];
        System.out.println(val);

        int n = a.length;
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        String[] fruits = {"Apple" , "Banana" ,"Cheery"};
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
    
}
