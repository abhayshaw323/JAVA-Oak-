public class SuspendAndResume extends Thread{
    public void run()
    {
        String name = Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        SuspendAndResume t1=new SuspendAndResume();
        SuspendAndResume t2=new SuspendAndResume();
        SuspendAndResume t3=new SuspendAndResume();

        t1.setName("abhay");
        t2.setName("Animesh");
        t3.setName("Abhijit");

        t1.start();

        t2.start();
        t2.suspend();  

        t3.start();
        t2.resume();


    }
}
