package DSA.Backtracking;
import java.util.*;
public class PermuteArray 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3};
        int n=a.length;
        disp(0,a);
    }

    public static void disp(int l,int[]a)
    {
        int n=a.length;
        if(l==n-1)
        {
            System.out.println(Arrays.toString(a));
            
        }
       
            for(int i=l; i<n; i++)
            {
                swap(l,i,a);
                disp(l+1,a);
                swap(l,i,a);

            }
        
    }

    public static void swap(int i, int j,int[]a)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

        
    }
}
