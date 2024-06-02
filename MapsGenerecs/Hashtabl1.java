package MapsGenerecs;
import java.util.*;
public class Hashtabl1 
{
    public static void main(String[] args) 
    {
        Hashtable h=new Hashtable();

        h.put(1, "obj-1");
        h.put(2, "obj-2");
        h.put(1, "obj-3");
        h.putIfAbsent(2, "obj-4");
        System.out.println(h);


        TreeMap t=new TreeMap();

        t.put(1, "fdua");
        t.put(10, "vavg");
        t.put(5, "vbbf");
        t.put(10, "fab");

        System.out.println(t);

    }
}
