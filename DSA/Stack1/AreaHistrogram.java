import java.util.*;
public class AreaHistrogram 
{
    public static void main(String[] args) 
    {
        int[]a={4,2,1,5,6,3,2,4,2};
        int n=a.length;
        int[]nse=new int[n];
        int[] pse=new int[n];

        Stack<Integer>s=new Stack<>();

        s.push(0);
        for(int i=1; i<n;i++)
        {
            while(!s.empty() && a[s.peek()]>a[i])
            {
                nse[s.pop()]=i;
            }
            s.push(i);
        }

        while(!s.empty())
        {
            nse[s.pop()]=n;
        }

        System.out.println(Arrays.toString(nse));
      
        s.push(n-1);

        for(int i=n-2; i>=0; i--)
        {
            while(!s.empty() && a[s.peek()]>a[i])
            {
                pse[s.pop()]=i;
            }
            s.push(i);
        }
        while(!s.empty())
        {
            pse[s.pop()]=-1;
        }
        System.out.println(Arrays.toString(pse));

        int max=0;
        for(int i=0; i<n; i++)
        {
            max=Math.max(max,a[i]*(nse[i]-pse[i]-1));
        }

        System.out.println(max);

        
    }
}
