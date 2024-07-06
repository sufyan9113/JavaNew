package MapsGenerecs;
import java.util.Map.*;
import java.util.*;
public class HashMap3 
{
    public static void main(String[] args) 
    {
        HashMap h=new HashMap();

        h.put(5, "order");
        h.put(1,"java");
        h.put(2, "java");
        h.put(4, "program");
        h.put(3,"skill");
        h.put(3, "check");
        System.out.println(h);

        Collection c=h.values();
        Set s1=h.entrySet();
        Set s2=h.keySet();

        Iterator i1=c.iterator();
        Iterator i2=s1.iterator();
        Iterator i3=s2.iterator();

        while(i1.hasNext())
        {
            //System.out.println(i1.next());
            String name=(String)i1.next();
            System.out.println(name);
        }
        while(i2.hasNext())
        {
           // System.out.println(i2.next());
                Map.Entry e=(Entry) i2.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
        while(i3.hasNext())
        {
           // System.out.println(i3.next());
           Integer i=(Integer) i3.next();
           System.out.println(i);
        }
    }
}
