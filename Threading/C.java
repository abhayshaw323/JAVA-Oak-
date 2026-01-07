// creating thread by implement Runnable in java
class D implements Runnable 
{
    public void run()
    {
        for(int i=0;i<=5;i++){
            System.out.println("My child thread");
        }
    }
}
public class C {
    public static void main(String[] args)  {
        D r = new D();    
        Thread t = new Thread(r);
        t.start();

        for(int i=0;i<=5;i++)
        {
            System.out.println("Main Thread");
        }
    }
}