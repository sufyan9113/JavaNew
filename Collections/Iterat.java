package Collections;
import java.util.*;

public class Iterat 
{
    public static void main(String[] args) 
    {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(50);
        a.add(15);
        a.add(100);
        a.add(20);

        Iterator i=a.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        ListIterator i1=a.listIterator(a.size()); //only for List interface classes // can travers reverse

        while(i1.hasPrevious())
        {
            System.out.println(i1.previous());
        }
            
        
    }
}
