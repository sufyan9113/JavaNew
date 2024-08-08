package DSA.Stack1;
import java.util.*;
public class StackPracSearch 
{
    public static void main(String[] args) 
    {
        int[]a={2,4,7,9,12,15,11,25};
        int n=a.length;
        int k=4;

        for(int i=0; i<=n-k+1; i++)
        {
            int max=-1;
            for(int j=i; j<i+k-1 && j<n; j++)
            {
                max=Math.max(max, a[j]);
            }
            System.out.println(max);
        }
    }
}
