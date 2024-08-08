package DSA.Stack1;
import java.util.*;

class NonRepeat
{
    public static void main(String[] args) 
    {
        String s="({[]})";
        boolean r=check(s);
        System.out.println(r);

    }
    public static boolean check(String s1)
    {
        char[]ch=s1.toCharArray();

        Stack<Character> s=new Stack<>();

        for(char c:ch)
        {

            if(c=='{' || c=='[' || c=='(')
            {
                s.push(c);
                continue;
            }

            else if(s.empty()) return false;

            char top=s.pop(); 

            if(top=='{' && c!='}') return false;

            if(top=='[' && c!=']') return false;

            if(top=='(' && c!=')') return false;

        }
        return s.empty();
    }
}