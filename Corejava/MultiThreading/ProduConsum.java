

class ProduConsum
{
    public static void main(String[] args) 
    {
        Link a=new Link();

        Producer p=new Producer(a);
        Consumer c=new Consumer(a);

        Thread t1=new Thread(p);
        Thread t2=new Thread(c);

        t1.start();
        t2.start();
    }
}

class Link
{
    int i;
    boolean flag=false;
    
    synchronized public void put(int i)
    {
       
        try
        {
            if(flag==true)
            {
                wait();
            }
            else
            {
                this.i=i;
                System.out.println("i have put "+i);
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
                
                System.out.println("i have get "+i);
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

class Producer implements Runnable
{
    Link o;
    int i=1;

    Producer(Link o)
    {
        this.o=o;
    }
    public void run()
    {
        
        while(i<100)
        {
            o.put(i++);
            
        }
    }
}

class Consumer implements Runnable
{
    Link o;
    int i=1;

    Consumer(Link o)
    {
        this.o=o;
    }
     public void run()
    {
        while(i<100)
        {
            o.get();
            i++;
        }

    }

}