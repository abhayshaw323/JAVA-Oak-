
// Creating thread in java by extending thread in java
class A extends Thread{
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++){
                System.out.println("Akhilesh");
                Thread.sleep(1000);
                }
        }
        catch(InterruptedException i)
        {

        }
    }

}

public class B {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("Ankush");
            Thread.sleep(1000);
        }
    }
    
}
