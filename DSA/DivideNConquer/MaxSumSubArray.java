package DSA.DivideNConquer;

public class MaxSumSubArray 
{
    public static void main(String[] args) 
    {

        int[]a={-1,2,3,4,-5};
        int n=a.length;
        int ans=maxSum(a, 0, n-1);
        System.out.println(ans);

    }
    public static int maxSum(int[]a,int l,int h)
    {
       if(l>h)
       {
        return Integer.MIN_VALUE;
       }
       if(l==h)
       {
        return a[l];
       }

       int m=(l+h)/2;

       return Math.max(Math.max(maxSum(a, l, m-1),maxSum(a, m+1, h)),combineSum(a,l,m,h));
    }
    public static int combineSum(int[]a,int l,int m,int h)
    {
        int sum=0;
        int leftSum=Integer.MIN_VALUE;

        for(int i=m; i>=l; i--)
        {
            sum+=a[i];
            if(sum>leftSum)
            {
                leftSum=sum;
            }
        }

        sum=0;
        int rightSum=Integer.MIN_VALUE;

        for(int i=m; i<=h;i++)
        {
            sum+=a[i];
            if(sum>rightSum)
            {
                rightSum=sum;
            }
        }

        return Math.max(Math.max(leftSum, rightSum),leftSum+rightSum-a[m]);
    }
    
}
