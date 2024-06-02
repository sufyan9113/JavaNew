package MultiThreading;
public class SingleRun 
{
    public static void main(String[] args) 
    {
        Single s=new Single();

        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
       

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
       

        
        
    }
}

class Single implements Runnable
{
    public void run()
    {
        if(Thread.currentThread().getName().equals("t2"))
        {
            m1();
        }
        else
        {
            System.out.println("in run method");
        }
        

    }

    public void m1()
    {
        System.out.println("in m1 method");
    }
   

    

}
