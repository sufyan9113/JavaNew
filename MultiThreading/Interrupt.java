package MultiThreading;

public class Interrupt 
{
    public static void main(String[] args) 
    {
        CheckIntr c=new CheckIntr();
        Thread t=new Thread(c);

        t.start();
        t.interrupt();
    }
}

class CheckIntr implements Runnable
{
    public void run()
    {
        try
        {
            for(int i=0; i<3 ;i++)
            {
                System.out.println("interrupt method");
                Thread.sleep(1000);
            }
            
        }
        catch(Exception e)
        {
            System.out.println("thread interrupted");
        }
        
        System.out.println("task completed");
        
    }
}
