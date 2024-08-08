package DSA.DivideNConquer;
import java.util.Arrays;

public class KthSmall 
{
    public static void main(String[] args) 
    {
        int[]a={50,10,20,30,5,6,8,90,95,2};
        int k=5;
        int n=a.length;
        int res=small(a, 0, n-1, k);
        System.out.println(Arrays.toString(a));
        System.out.println(res);
    }
    public static int small(int[]a,int i,int j,int k)
    {
        int m=part(a,i,j);

        if(m==k-1)
        {
            return a[m];
        }
        else
        {
            if(m<k-1) return small(a, m+1, j, k);

            else return small(a, i, m-1, k);   
        }
    }
    
    public static int part(int[]a,int l,int h)
    {
        int i=l;
        int pivot=a[l];
        int j;

        for(j=l+1; j<=h; j++)
        {
            if(a[j]<=pivot)
            {
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }

        int temp=a[l];
        a[l]=a[i];
        a[i]=temp;

        return i;

        
    }
}
