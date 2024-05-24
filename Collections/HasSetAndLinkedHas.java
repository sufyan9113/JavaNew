package Collections;
import java.util.*;
public class HasSetAndLinkedHas 
{
    public static void main(String[] args) 
    {
        HashSet h=new HashSet();

        h.add(10);
        h.add(100);
        h.add(100);
        h.add("check");
        h.add(75);
        h.add(15);
        System.out.println(h);

        LinkedHashSet h1=new LinkedHashSet();

        h1.add(100);
        h1.add(5);
        h1.add("check");
        h1.add(15);
        

        System.out.println(h1);

    
        
        
    }
}
