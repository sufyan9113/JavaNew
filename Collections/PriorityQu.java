package Collections;
import java.util.*;
public class PriorityQu 
{
    public static void main(String[] args) 
    {
        PriorityQueue a=new PriorityQueue();
        PriorityQueue b=new PriorityQueue();

        b.add("fad"); //only stores homogenous data types
        b.add("fanfnd");
        b.add("ijrnr");
        b.add("jervnd");
        System.out.println(b);

        a.add(150);
        a.add(10);
        a.add(50);
        a.add(30);
        a.add(60);
        a.add(90);
        a.add(100);
        a.add(125);
      //  a.add("check"); homogenios data only
        
        System.out.println(a);
    }
}
