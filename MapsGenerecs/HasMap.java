package MapsGenerecs;

import java.util.*;
import java.util.Map.Entry;

class HasMap
{
    public static void main(String[] args) 
    {
        HashMap h=new HashMap();

        h.put(1, "obj-1"); // key and value can be of any types
        h.put(2, "obj-2");  // indersion order not protected
        h.put(2, "check"); // no duplicates of key allowed
        h.put(3, "sufyan");
        h.put(5, "java"); // value can be duplicates
        h.put(4, "java");
        h.put("java", "language");
        h.put(null, null);

        System.out.println(h);
        System.out.println(h.get(5));

        System.out.println(h.size());
      //  Collection s=h.values();  // gives values
          Set s=h.entrySet();       //gives entry both key and values
      //  Set s=h.keySet();         // gives key

        Iterator i=s.iterator();

        while(i.hasNext())
        {
            // System.out.println(i.next());
            // Integer k=(Integer)i.next();
           // System.out.println(k);
         // String name=(String)i.next();
          // System.out.println(name);

            Map.Entry e= (Entry) i.next();
           // System.out.println(e);
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}