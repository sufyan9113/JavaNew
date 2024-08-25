public class MinimumCandy 
{
    public static void main(String[] args) 
    {
        int[]a={1,5,2,1};
        int min=candy(a);
        System.out.println(min);
    }
    public static int candy(int[]a)
    {
        int n=a.length;
        int c[]=new int[n];

        for(int i=0; i<n; i++)
        {
            c[i]=1;
        }

        for(int i=1; i<n; i++)
        {
            if(a[i]>a[i-1])
            {
                c[i]=c[i-1]+1;
            }
        }

        for(int i=n-2; i>=0; i--)
        {
            if(a[i]>a[i+1] && c[i]<=c[i+1]+1 )
            {
                c[i]=c[i+1]+1;
            }
        }
        int total=0;
        for(int e:c)
        {
            total+=e;
            System.out.print(e+" ");
        }
        System.out.println();
        return total;
    }
}
