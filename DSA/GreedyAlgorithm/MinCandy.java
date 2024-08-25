package DSA.GreedyAlgorithm;
public class MinCandy 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3,4,1};
        int res=find(a);
        System.out.println(res);
    }
    public static int find(int[]a)
    {
        int n=a.length;
        int[]c=new int[n];

        for(int i=0; i<n;i++)
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
        for(int e:c)
        {
           
            System.out.print(e+" ");
        }
        System.out.println();
        for(int i=n-2; i>=0;i--)
        {
            if(a[i]>a[i+1] && c[i]<=c[i+1]+1)
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
