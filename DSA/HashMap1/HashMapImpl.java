package DSA.HashMap1;
import java.util.*;
public class HashMapImpl 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,String>h=new HashMap<>();
        h.put(3, "check");
        h.put(1, "abc");
        h.put(7, "test");
        h.put(5, "cab");

        System.out.println(h);

        LinkedHashMap<Integer,String>lh=new LinkedHashMap<>();
        lh.put(3, "check");
        lh.put(1, "abc");
        lh.put(7, "test");
        lh.put(5, "cab");

        
        System.out.println(lh);

       TreeMap<Integer,String>t=new TreeMap<>();
        t.put(3, "check");
        t.put(1, "abc");
        t.put(7, "test");
        t.put(5, "cab");

        System.out.println(t);
       

        
    }
}
