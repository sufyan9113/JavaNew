package DSA.Backtracking;
import java.util.*;
public class Permute2 
{
    public static void main(String[] args) 
    {
        String s="abc";
        List<String>l=new ArrayList<String>();
        call(s,"",l);

        System.out.println(l);

        for( String p:l)
        {
            System.out.println(p);
        }

   
    }
    public static void call(String s,String t,List<String>l)
    {
        if(s.equals(""))
        {
            l.add(t);
            return;
        }

        for(int i=0; i<s.length();i++)
        {
            char c=s.charAt(i);
            
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            String rem=left+right;
            call(rem, t+c,l);
    
        }
    }
}
