package MultiThreading;

public class Methods 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("main thread started");

        C1 a=new C1();
        C2 b=new C2();

        Thread t1=new Thread(a);
        Thread t2=new Thread(b);

        System.out.println(t1.isAlive()+" "+t2.isAlive());

        t1.start();
        t2.start();
        System.out.println(t1.isAlive()+" "+t2.isAlive());
        t1.join();
        

        System.out.println("main thread completed");
    }
}

class C1 implements Runnable
{
    public void run()
    {
        for(int i=0; i<3; i++)
        {
            try
            {
                System.out.println("in c1 class");
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
        System.out.println();
    }
}

class C2 implements Runnable
{
    public void run()
    {
        for(int i=0; i<3; i++)
        {
            try
            {
                System.out.println("in c2 class");
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
        System.out.println();
    }
    }

