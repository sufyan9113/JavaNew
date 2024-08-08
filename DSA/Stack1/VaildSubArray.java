import java.util.*;

public class VaildSubArray 
{
    public static void main(String[] args) 
    {
        int[]a={1,4,2,5,3};
        int n=a.length;
        int[]nse=new int[n];
        Stack<Integer>s=new Stack<>();

        s.push(0);

        for(int i=1; i<n; i++)
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
        int sum=0;

        for(int i=0; i<n; i++)
        {
            sum+=nse[i]-i;
        }

        System.out.println(sum);

    }
}
