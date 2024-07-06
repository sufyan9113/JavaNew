package MultiThreading;

public class DeadLock 
{
    public static void main(String[] args) 
    {
        Library o=new Library();
        Thread t1=new Thread(o);
        Thread t2=new Thread(o);
        t1.setName("student-1");
        t2.setName("student-2");

        t1.start();
        t2.start();
    }

}

class Library implements Runnable
{
    String r1=new String("book-1");
    String r2=new String("book-2");
    String r3=new String("book-3");


    public void run()
    {
        String tName=Thread.currentThread().getName();

        if(tName.equals("student-1"))
        {
            try
            {
                Thread.sleep(1000);
                synchronized(r1)
                {
                    System.out.println(Thread.currentThread().getName()+" get "+r1);
                    Thread.sleep(1000);

                    synchronized(r2)
                    {
                        System.out.println(Thread.currentThread().getName()+" get "+r2);
                        Thread.sleep(1000);

                        synchronized(r3)
                        {
                        System.out.println(Thread.currentThread().getName()+" get "+r3);
                        Thread.sleep(1000);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("error");
            }

        }
        else
        {

            try
            {
                Thread.sleep(1000);
                synchronized(r3)
                {
                    System.out.println(Thread.currentThread().getName()+" get "+r3);
                    Thread.sleep(1000);

                    synchronized(r2)
                    {
                        System.out.println(Thread.currentThread().getName()+" get "+r2);
                        Thread.sleep(1000);

                        synchronized(r1)
                        {
                        System.out.println(Thread.currentThread().getName()+" get "+r1);
                        Thread.sleep(1000);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("error");
            }
        }
    }
}