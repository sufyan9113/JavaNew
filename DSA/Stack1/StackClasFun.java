
import java.util.*;
public class StackClasFun 
{
    public static void main(String[] args) 
    {
        Stack<Integer> s1=new Stack<>();

        s1.push(2);
        s1.push(4);
        s1.push(6);
        s1.push(8);

        System.out.println("top elment "+s1.peek());

        s1.pop();
       

        System.out.println("top elment "+s1.peek());

        System.out.println("element postion "+s1.search(4));

        System.out.println("is stack empty: "+s1.empty());
    }
}
