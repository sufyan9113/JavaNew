package Assignments;
import java.util.*;
public class HashAssignQ2 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of hashmap");
        int n=s.nextInt();
        TreeMap <String,Integer>h=new TreeMap<>();

        System.out.println("key, value pairs");
        for(int i=0; i<n; i++)
        {
            int key=s.nextInt();
            String value=s.next();
            h.put(value, key);
        }


        System.out.println(h);
    }
}
