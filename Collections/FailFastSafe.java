package Collections;

import java.util.*;
import java.util.concurrent.*;



public class FailFastSafe 
{
    public static void main(String[] args) 
    {
        ArrayList a=new ArrayList();

        a.add(10);
        a.add(20);
        a.add(30);

        /* 
        for(int i=0; i<a.size();i++)
        {                                                       
            System.out.println(a.get(i));   infinite loop
            a.add(50);
        }
         */   
        
         Iterator i=a.iterator();  

         try
        {                   // fail fast exception
         while(i.hasNext())
         {
            System.out.println(i.next());
            
                a.add(10);
         }
        }
        catch(Exception e)
        {
            System.out.println("concurrent modification "+e);
        }

         CopyOnWriteArrayList b=new CopyOnWriteArrayList();  //fail safe

         b.add(10);
         b.add(100);
         b.add(50);

         Iterator i1=b.iterator();

         while(i1.hasNext())
         {
            System.out.println(i1.next());
            b.add(15);
         }
    }
}

    