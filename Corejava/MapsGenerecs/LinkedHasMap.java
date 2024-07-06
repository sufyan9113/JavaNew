package MapsGenerecs;

import java.util.*;

public class LinkedHasMap 
{
   public static void main(String[] args) 
   {
        LinkedHashMap h=new LinkedHashMap();

        h.put(1, "check");
        h.put(2, "java");
        h.put(3, "obj");
      //  h.put(3, "obj-2");

        System.out.println(h); //insertion order preserved


   } 
}
