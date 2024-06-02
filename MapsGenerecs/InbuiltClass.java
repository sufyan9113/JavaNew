package MapsGenerecs;
import java.util.*;
public class InbuiltClass 
{
    public static void main(String[] args) 
    {
      T1 t=new T1();
      

      Thread t1=new Thread(t);
      Thread t2=new Thread(t);

      t1.setName("thread-1");
      t2.setName("thread-2");

      t1.start();
      t2.start();
     
       

    }
}

class T1 implements Runnable
{
    
     public void run() 
    {
        try
        {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            Hashtable h=new Hashtable(); 
    
            h.put(1, "o1");
            h.put(2, "o2");
            h.put(3, "o3");
     
            System.out.println(h);
        }
        catch(Exception e)
        {
            System.out.println("error "+e);
        }
        
    }
}

