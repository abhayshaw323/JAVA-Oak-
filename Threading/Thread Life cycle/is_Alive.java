class g  extends Thread{
    public void run()
    {
        System.out.println("IsAlive method program....");
    }
}


public class is_Alive {
    public static void main(String[] args) {
        
        g t1 = new g();
        g t2 = new g();

        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t2.start();
    }
    
}
