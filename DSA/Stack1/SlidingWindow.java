import java.util.*;
public class SlidingWindow 
{
    public static void main(String[] args) 
    {
        int[]a={2,4,7,10,12,15,25,17};
        ans(a);
    }

    public static void ans(int[]a)
    {
        ArrayList<Integer>al=new ArrayList<>();
        int n=a.length;

        for(int i=0; i<=n-3; i++)
        {
            int max=0;
            for(int j=i; j<=i+3-1&& j<n; j++)
            {
               max=Math.max(max, a[j]);
                
            }
            al.add(max);
        }

        System.out.println(al);
    }
}
