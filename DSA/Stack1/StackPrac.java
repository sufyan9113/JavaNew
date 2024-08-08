package DSA.Stack1;
import java.util.*;

public class StackPrac 
{
    public static void main(String[] args) 
    {
       int[]a={4,2,1,5,6,3,2,4,2};
       int[]p=pSmall(a);
       System.out.println(Arrays.toString(p));

       int[]n=nSmall(a);
       System.out.println(Arrays.toString(n));

       int[]w=width(n,p);
       System.out.println(Arrays.toString(w));

       int[]ar=area(a,w);
       System.out.println(Arrays.toString(ar));

       int res=ans(ar);
       System.out.println(res);
    }

    public static int[] pSmall(int[]a)
    {
        int n=a.length;
        int[]p=new int[n];

        for(int i=n-1; i>0; i--)
        {
            for(int j=i-1; j>=0; j--)
            {
                if(a[j]<a[i])
                {
                    p[i]=j;
                    break;
                }
                else
                {
                    p[i]=-1;
                }
            }
        }
        p[0]=-1;
        return p;
    }
    public static int[] nSmall(int[]a)
    {
        int l=a.length;
        int[]n=new int[l];

        for(int i=0; i<l-1; i++)
        {
            for(int j=i+1; j<l; j++)
            {
                if(a[j]<a[i])
                {
                    n[i]=j;
                    break;
                }
                else
                {
                    n[i]=l;
                }
            }
        }
        n[l-1]=l;
        return n;
    }
    public static int[] width(int[]n,int[]p)
    {
        int l=n.length;
        int[]w=new int[l];

        for(int i=0; i<l; i++)
        {
            w[i]=n[i]-p[i]-1;
        }
        return w;

    }
    public static int[] area(int[]a,int[]w)
    {
        int n=a.length;
        int[]ar=new int[n];

        for(int i=0; i<n;i++)
        {
            ar[i]=a[i]*w[i];
        }
        return ar;

    }
    
    public static int ans(int[]ar)
    {
        int max=-1;

        for(int i=0; i<ar.length;i++)
        {
            max=Math.max(max, ar[i]);
        }
        return max;
    }
        

}


