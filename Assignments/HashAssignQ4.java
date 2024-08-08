package Assignments;
import java.util.*;
public class HashAssignQ4 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();

        int[]a=new int[n];

        System.out.println("enter array elements");
        for(int i=0; i<n;i++)
        {
            a[i]=s.nextInt();
        }

        TreeMap<Integer,Integer> t=new TreeMap<>();

        for(int i=0; i<n; i++)
        {
            t.put(a[i], 1);
        }

        System.out.println("largest element "+t.lastKey());
    }
}
