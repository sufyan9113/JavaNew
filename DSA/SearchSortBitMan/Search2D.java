package DSA.SearchSortBitMan;

public class Search2D 
{
    public static void main(String[] args) 
    {
        int[][]a={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int x=30;
        boolean ans=search(a,x);
        System.out.println(ans);
    }
    public static boolean search(int[][]a,int x)
    {
        int n=a.length;
        int m=a[0].length;

        int low=0;
        int high=n*m-1;
        int mid,midE;
        while(low<=high)
        {
            mid=(low+high)/2;
            midE=a[mid/m][mid%m];

            if(midE==x)
            {
                return true;
            }

            else if(midE<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }
        return false;
    }
}
