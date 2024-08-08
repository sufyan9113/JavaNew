import java.util.*;
class ValidParanthesis
{
    public static void main(String[] args) 
    {
        String s1="([{}])";
        
        boolean result=isValid(s1);
        System.out.println(result);

    }
    public static boolean isValid(String s1)
    {
        char[]ch=s1.toCharArray();
        Stack<Character> s=new Stack<>();
        
        for(char c:ch)
        {
            if(c=='(' || c=='[' || c=='{')
            {
                s.push(c);
                continue;
            }
            if(s.empty()) return false;

            char top=s.pop();

                 if(c==')' && top!='(') return false;
            else if(c==']' && top!='[') return false;
            else if(c=='}' && top!='{') return false;
        }

        return (s.empty()==true);
    }
}