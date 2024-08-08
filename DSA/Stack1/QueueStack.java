import java.util.*;
public class QueueStack 
{
  public static void main(String[] args) 
  {
    Stack<Integer>s1=new Stack<>();
    Stack<Integer>s2=new Stack<>();
   
    enqueue(1, s1);
    enqueue(2, s1);
    enqueue(3, s1);
    enqueue(4, s1);

    System.out.println(s1);
    System.out.println(s2);

    int x=dequeue(s1,s2);
    System.out.println(x);
     x=dequeue(s1,s2);
    System.out.println(x);
 
    System.out.println(s1);
    System.out.println(s2);
  }  
  public static void enqueue(int x,Stack<Integer>s1)
  {
    s1.push(x);
    
  } 

  public static int dequeue(Stack<Integer>s1,Stack<Integer>s2)
  {
    int ele;
    if(s1.empty()&& s2.empty())
    {
      System.out.println("stack is empty");
      System.exit(0);
    }
    if(s2.empty())
    {
      while(!s1.empty())
      {
        
        ele=s1.pop();
        s2.push(ele);
      }
    }
    
      ele=s2.pop();
      return ele;
  }
}
