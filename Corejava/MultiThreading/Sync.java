package MultiThreading;
public class Sync 
{
    public static void main(String[] args) 
    {
        SyncCheck s=new SyncCheck();
        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
        Thread t3=new Thread(s);

        t1.setName("son-1");
        t2.setName("son-2");
        t3.setName("son-3");

        t1.start();
        t2.start();
        t3.start();

    }
}

class SyncCheck implements Runnable
{
      public void run()
    {
        String tName=Thread.currentThread().getName();

        try
        {
            System.out.println(tName+ " enter in parking");
            Thread.sleep(1000);
            synchronized(this){
            System.out.println(tName+ " got car to drive");
            Thread.sleep(1000);
            System.out.println(tName+ " driving the car");
            Thread.sleep(1000);
            System.out.println(tName+ " cameback and park the car");
            Thread.sleep(1000);
            }

        }
        catch(Exception e)
        {
            System.out.println("error "+e);
        }
        
    }
}


