// Sleep Method
// interrupt Exception
class E extends Thread{
    public void run()
    {
        String n=Thread.currentThread().getName();
        
        for(int i=0;i<=3;i++){
            System.out.println(n);
        }
    }
}

public class SleepMethod {
    public static void main(String[] args) {
        
        E t1 = new E();
        E t2 = new E();
        E t3 = new E();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t2.start();
        try{
            t2.join();
        }
        catch(InterruptedException i){

        }
        
        t1.start();
        t3.start();


    }
}
