
public class Exception_Propagation 
{
    public static void main(String[] args) throws ArithmeticException{
        m1();
    }
    public static void m1()
    {
        try{
            m2();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    public static void m2()
    {
        System.out.println(10/0);
    }
}
