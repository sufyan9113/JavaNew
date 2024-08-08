import java.util.*;
public class MiniNum 
{
    public static void main(String[] args) 
    {
        String s1="DDIIDDI";
        Stack<Integer>s=new Stack<>();

        for(int i=0; i<=s1.length();i++)
        {
            s.push(i+1);

            if(i==s1.length() || s1.charAt(i)=='I')
            {
                while(!s.empty())
                {

                    System.out.print(s.pop()+" ");
                }
            }
        }
        System.out.println();
    }
    

}
