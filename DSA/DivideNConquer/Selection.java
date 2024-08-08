package DSA.DivideNConquer;

import java.util.Arrays;

public class Selection 
{
    public static void main(String[] args) 
    {
        int[]a={50,30,70,90,10,34,89,98,13};
        int n=a.length;
        int ans=findSmall(a, 0, n-1,n-3+1 );
        System.out.println(ans);
        System.out.println(Arrays.toString(a));
    }

    public static int findSmall(int[]a,int i,int j,int k)
    {
       
            int m=partition(a,i,j);
            if(m==k-1)
            {
                return a[m];
            }
            else if(m>k-1)
            {
                return findSmall(a, i, m-1, k);
            }  
        
            return findSmall(a, m+1, j, k);
    
       
        
         
    }
    public static int partition(int[]a,int l,int h)
    {
        int i,j,pivot;
        i=l;
        pivot=a[l];

        for(j=l+1; j<=h;j++)
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
        System.out.println(i);
        System.out.println(Arrays.toString(a));
        
        return i;
    
    }
}
