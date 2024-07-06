package Collections;

import java.util.*;

public class MoreLinkedList 
{
    public static void main(String[] args) 
    {
        LinkedList a=new LinkedList();// both list and deque's method can access

        a.add(10);
        a.add(15);
        a.add(15);
        a.add(20);

    // a.poll();

        List b=new LinkedList(); // implements both list and deque interface only list interface method can access
      //  b.poll();
        b.add(0, 100);

        Deque c=new LinkedList(); //only deque interface method can access

       // c.add(0,100);

      System.out.println(a.get(1));
      System.out.println(a.indexOf(15));
      System.out.println(a.lastIndexOf(15));
      System.out.println(a.getFirst());
      System.out.println(a.getLast());

      a.push(100);  //push object at beginnig
      System.out.println(a); 
      System.out.println(a.pop()); //give first object of list

      


    
    }
}
