import java.util.*;

public class StackQueue 
{
    public static void main(String[] args) 
    {
        StackImplemet s1=new StackImplemet();
       
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        System.out.println("last element removed : "+s1.pop());
        System.out.println("last element removed : "+s1.pop());
       
      
      

    }
}

class StackImplemet
{   
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    
    public void push(int x)
    {
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }

        q1.add(x);

        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }

    }
    public int pop()
    {
        if(q1.isEmpty())
        {
            System.out.println("stack under flow");
            System.exit(0);
        }
        return q1.poll();
    }
}
