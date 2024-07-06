package MultiThreading;

public class ProduConsuProb 
{
    public static void main(String[] args) 
    {
        Link a=new Link();

        Producer p=new Producer(a);
        Consumer c=new Consumer(a);

        p.start();
        c.start();

    }
    
}

class Link
{
    boolean flag=false;
    int x;

    synchronized public void put(int x)
    {
        try
        {
            if(flag==true)
            {
                wait();
            }
            else
            {
                this.x=x;
                System.out.println("i have produced x "+x);
                flag=true;
                notify();
            }
            
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
        
    }

    synchronized public void get()
    {
        try
        {
            if(flag==false)
            {
                wait();
            }
            else
            {
                System.out.println("i have consumed "+x);
                flag=false;
                notify();
            }
            
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
        
    }
}

class Producer extends Thread
{
    Link k;
    int i=1;
    Producer(Link k)
    {
        this.k=k;
    }

    public void run()
    {
        
        while(i<100)
        {
            k.put(i++);
        }
    }
}

class Consumer extends Thread
{
    Link k;
    int i=1;

    Consumer(Link k)
    {
        this.k=k;
    }
    public void run()
    {
        while(i<100)
        {
             k.get();
             i++;
        }
    }

}
