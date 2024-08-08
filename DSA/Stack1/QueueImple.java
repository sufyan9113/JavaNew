import java.util.*;

public class QueueImple 
{
    public static void main(String[] args) 
    {
        Queue<Integer>q=new LinkedList();

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        System.out.println("first element before "+q.peek()); //

        q.remove();
        System.out.println("first element after "+q.peek()); // first element after
        System.out.println(q);

    }   
}
