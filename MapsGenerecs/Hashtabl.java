package MapsGenerecs;

import java.util.*;

public class Hashtabl 
{
    public static void main(String[] args) 
    {
        Hashtable h=new Hashtable();

        h.put(1, "java");
        h.put(2, "java");
        h.put(3, "pw");         //insertion order not preserved
        h.putIfAbsent(3, "pw"); //n duplicates values allowed
        h.put(3, "pw");
        h.put(4, "skill");
       //h.put(6, null); //null value not allowed in key and value

        System.out.println(h);

        TreeMap t=new TreeMap();

        t.put(3,"check");
        t.put(10, "java-1"); //insertion not preserved // output in sorted form //duplicates not allowed
        t.put(1, "pwskill");
        t.put(5, "key");
        t.put(5, "key2");
        t.put(6, null); //null value not allowed in key but in value it is allowed

        System.out.println(t);
    }
}
