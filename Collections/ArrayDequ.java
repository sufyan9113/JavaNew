package Collections;
import java.util.*;
public class ArrayDequ 
{
    public static void main(String[] args) 
    {
        ArrayDeque a=new ArrayDeque();

        a.add(100);
        a.add("ckf");
        a.add(100);
        a.addFirst(5);
        a.addLast(50); //index based access not allowed

        System.out.println(a);

        a.offer(60); //possible that data cannot be inserted
        a.offerFirst(80);
        a.offerLast(90);

        System.out.println(a);
    }
}
