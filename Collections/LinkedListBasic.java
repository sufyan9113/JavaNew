package Collections;
import java.util.*;
public class LinkedListBasic 
{
    public static void main(String[] args) 
    {
        LinkedList a=new LinkedList();

        a.add("pwskill");
        a.add(15);
        a.add('c');
       

        System.out.println(a);

        a.addFirst(96.6f);
        a.addLast(false);

        System.out.println(a);

        a.add(3, 50);
        a.add(4,50);

        System.out.println(a);

        System.out.println(a.peek()); 
        System.out.println(a);
        System.out.println(a.poll());// return first object and remove from linkedList
        System.out.println(a);
    }
}
