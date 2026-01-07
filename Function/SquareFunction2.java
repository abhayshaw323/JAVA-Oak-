public class SquareFunction2 {
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static int square(int n)
    {
        return mul(n,n);
    }
    public static void main(String[] args) 
    {
        SquareFunction2 obj_a = new SquareFunction2();
        System.out.println(square(5));    
    }
    
}
