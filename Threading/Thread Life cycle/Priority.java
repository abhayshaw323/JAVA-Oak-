class B extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}


public class Priority {
    public static void main(String[] args) {
        
    

    B t1 = new B();
    B t2 = new B();
    B t3 = new B();
    
    t1.setName("t1 thread");
    t2.setName("t2 thread");
    t3.setName("t3 thread");

    t1.setPriority(2);
    t2.setPriority(3);
    t2.setPriority(6);

    t1.start();
    t2.start();
    t3.start();

    

}
}