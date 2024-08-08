package DSA.HashMap1;
import java.util.*;

public class NonRepeat 
{
    public static void main(String[] args) 
    {
        String s="ABBCCAD";
        int n=s.length();
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0; i<n;i++)
        {
            if(h.containsKey(s.charAt(i)))
            {
                h.put(s.charAt(i), h.get(s.charAt(i))+1);
            }
            else                                                                                          
            {
                h.put(s.charAt(i), 1);
            }
        }
        System.out.println(h);

        int res=0;
        for(int i=0; i<n;i++)
        {
            if(h.get(s.charAt(i))==1)
            {
                System.out.println("1st non repeating char of string at index "+i);
                res=1;
                break;
            }
        }

        if(res==0)
        {
            System.out.println("non repeating character not found ");
        }


        
    }
}
