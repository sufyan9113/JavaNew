import java.util.*;

public class DequeImp 
{
    public static void main(String[] args) 
    {
        Deque<Integer> d=new ArrayDeque<>();

        d.addFirst(10);
        d.addFirst(20);
        d.addFirst(30);
        d.addLast(40);

        d.offerFirst(1);
        d.offerLast(5);
        System.out.println(d);


        d.removeLast();
        d.removeFirst();
        d.pollFirst();
        d.pollLast();
       System.out.println(d.getFirst());
       System.out.println(d.getLast());
       System.out.println(d.peekFirst());
       System.out.println(d.peekLast());

        System.out.println(d);


       
    
        
        
        
    
        
    }

    
}
