package Assignments;

import java.util.*;

public class HashAssignQ3 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();
        int[]a=new int[n];
        System.out.println("enter array elements");

        for(int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }
        isDuplicate(a);
    }

    public static void isDuplicate(int[]a)
    {
        
        HashMap<Integer,Integer> h=new HashMap<>();
        boolean ans=false;
        for(int i=0; i<a.length; i++)
        {
            if(h.containsKey(a[i]))
            {
                ans=true;
                System.out.println("yes");
                break;
            }
            else
            {
                h.put(a[i], 1);
            }
        }
        if(ans==false)
        {

            System.out.println("no");
        }
        
    
      


    } 
}
