package MultiThreading;
public class DeadLock1 
{
    public static void main(String[] args) 
    {
        Library1 a=new Library1();

        Thread t1=new Thread(a);
        Thread t2=new Thread(a);

        t1.setName("student-1");
        t2.setName("student-2");

        t1.start();
        t2.start();
    }
}

class Library1 implements Runnable
{
    String r1=new String("book-1");
    String r2=new String("book-2");
    String r3=new String("book-3");
    String tName;


    public void run()
    {
        tName=Thread.currentThread().getName();
        
        if(tName.equals("student-1"))
        {
            try
            {
                Thread.sleep(1000);
                synchronized(r1)
                {
                    System.out.println(Thread.currentThread().getName()+ " got "+r1);
                    Thread.sleep(1000);

                    synchronized(r2)
                    {
                        System.out.println(Thread.currentThread().getName()+ " got "+r2);
                        Thread.sleep(1000);

                        synchronized(r3)
                        {
                            System.out.println(Thread.currentThread().getName()+ " got "+r3);
                            Thread.sleep(1000);
                        }
                    }

                }
            }
            catch(Exception e)
            {
                System.out.println("error "+e);
            }
        }

        else
        {
            try
            {
                Thread.sleep(1000);
                synchronized(r3)
                {
                    System.out.println(Thread.currentThread().getName()+ " got "+r3);
                    Thread.sleep(1000);

                    synchronized(r2)
                    {
                        System.out.println(Thread.currentThread().getName()+ " got "+r2);
                        Thread.sleep(1000);

                        synchronized(r1)
                        {
                            System.out.println(Thread.currentThread().getName()+ " got "+r1);
                            Thread.sleep(1000);
                        }
                    }

                }
            }
            catch(Exception e)
            {
                System.out.println("error "+e);
            }
        }
    }
}
