package Collections;
import java.util.*;

public class Enumratio 
{
    public static void main(String[] args) 
    {
        Vector v=new Vector();
        v.add(10);
        v.add(20);
        v.add(30);

        ArrayList a=new ArrayList();

        a.add(40);
        a.add(20);
        a.add(10);


        Iterator i=v.iterator();

        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        System.out.println();

    //    Enumeration e1=a.elements(); only for legacy class

        Enumeration e=v.elements();

        while(e.hasMoreElements())
        {
            System.out.print(e.nextElement()+" ");
        }
        System.out.println();

    }
}
