public class Interrup 
{
    public static void main(String[] args) 
    {
        Inter i=new Inter();

        i.start();
        i.interrupt();

    }
}

class Inter extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("in run method");
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("thread interupted"+e);
        }
        
    }
}
