package Assignments;
import java.util.*;
public class HashAssignQ5 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("enter ransomnote string");
        String r=s.next();
        System.out.println("enter ransomnote magazine String");
        String m=s.next();

        HashMap<Character,Integer>h1=new HashMap<>();
        HashMap<Character,Integer>h2=new HashMap<>();

        for(int i=0; i<r.length(); i++)
        {
            char c=r.charAt(i);
            if(h1.containsKey(c))
            {
                h1.put(c, h1.get(c)+1);
            }
            else
            {
                h1.put(c, 1);
            }
        }
        System.out.println(h1);

        for(int i=0; i<m.length(); i++)
        {
            char c=m.charAt(i);
            if(h2.containsKey(c))
            {
                h2.put(c, h2.get(c)+1);
            }
            else
            {
                h2.put(c, 1);
            }
        }
        System.out.println(h2);

        boolean res=true;
       
    
        for(Map.Entry<Character,Integer> e:h1.entrySet())
        {
            if(!h2.containsKey(e.getKey())|| e.getValue()> h2.get(e.getKey()) )
            {
                res=false;
                break;
            }
        }
        System.out.println(res);
    
}
}
