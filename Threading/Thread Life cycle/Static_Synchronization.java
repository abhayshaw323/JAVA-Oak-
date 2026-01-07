class Bank extends Thread
{
   static int bal = 5000;
   static int withdraw;

    Bank(int withdraw)
    {
        this.withdraw=withdraw;
    }
    public static synchronized void withdraw()
    {
        String name =Thread.currentThread().getName();
        if(withdraw<=bal)
        {
            System.out.println(name + "Withdrawn money");
            bal = bal-withdraw;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void run()
    {
        withdraw();
    }
}

public class Static_Synchronization {
    public static void main(String[] args) {
        Bank obj1 = new Bank(5000);

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj1);

        t1.setName("Abhay ");
        t2.setName("Disha ");

        Bank obj2 = new Bank(5000);

        Thread t3=new Thread(obj2);
        Thread t4=new Thread(obj2);

        t3.setName("Animesh ");
        t4.setName("Mouli");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
