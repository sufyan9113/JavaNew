import java.util.Arrays;

public class Median2SortedArr 
{
    public static void main(String[] args) 
    {
        int[]a={1,2}; //sorted array
        int[]b={3,4};
        int m=a.length;
        int n=b.length;

        double mediun=ans(a,b,m,n);
        System.out.println(mediun);

    }
    public static double ans(int[]a,int[]b,int m,int n) //a small array and m small size of a array
    {
        if(m>n) return ans(b, a, n, m);
        int low=0; int high=m; int med=((m+n)+1)/2;

        while(low<=high)
        {
            int cut1=(low+high)/2;
            int cut2=med-cut1;

            int l1=cut1==0?Integer.MIN_VALUE:a[cut1-1];System.out.println(l1);
            int l2=cut2==0?Integer.MIN_VALUE:b[cut2-1];System.out.println(l2);
            int r1=cut1==m?Integer.MAX_VALUE:a[cut1];System.out.println(r1);
            int r2=cut2==n?Integer.MAX_VALUE:b[cut2];System.out.println(r2);

            if(l1<=r2 && l2<=r1)
            {
                System.out.println("in ans conditio");
                if((m+n)%2!=0)
                {
                    System.out.println("odd ans");
                    return Math.max(l1, l2);
                } 
                else
                {
                    System.out.println("even ans");
                    return (double)(Math.max(l1, l2)+Math.min(r1, r2))/2;
                } 
            }
            else if(l1>r2)
            {
                System.out.println("in l1>r2");
                high=cut1-1;
            } 

            else
            {
                System.out.println("in l2>r1");
                low=cut1+1;
            } 
        }
        return -1;
    }
}
