class thread extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
        for(int i=0;i<=2;i++)
        {
            System.out.println(name);
            Thread.yield();
        }
    }
}
class thread2 extends Thread
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        for(int i=0;i<=2;i++)
        {
            System.out.println(name);
        }
    }
}
class Yeild{
    public static void main(String[] args) {
        thread t1=new thread();
        thread t2=new thread();

        t1.start();
        t2.start();
    }
}