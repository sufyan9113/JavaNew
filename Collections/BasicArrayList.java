package Collections;
import java.util.*;


public class BasicArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList a=new ArrayList();
        ArrayList b=new ArrayList();

        

        System.out.println(a.add("sufyan")); //add method return boolean value
        a.add(18);
        a.add(true);
        a.add(15.6);
        a.add('s');
        a.remove(4); //index
        
        System.out.println("size: "+a.size());
        System.out.println(a.indexOf(15.6));
        System.out.println(a.contains(true));
        System.out.println(a);

        b.add("check");
        b.add("check"); //duplicates are allowed
        b.add(false);
        b.add(8.5f);
        b.add(3, "index inject");
        System.out.println(b);
        b.addAll(a); //stores as value of objects
       

        b.add(a); //stores as object
        

        System.out.println(b);

        b.ensureCapacity(15); //it will ensure capacity if data increased it will automatically grow
        System.out.println(b.size());
        b.trimToSize();
        System.out.println(b.size());

        b.clear();
        System.out.println(b);
        

      
        
    }
}
