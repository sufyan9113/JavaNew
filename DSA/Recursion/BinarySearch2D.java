package DSA.Recursion;

public class BinarySearch2D 
{

    public static void main(String[] args) 
    {
        int[][]a={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int x=23;
        int n=a.length;
        int m=a[0].length;
        int high=n*m-1;

        boolean ans=search(0,high,a,x,m);
        System.out.println(ans);
        
    }
    public static boolean search(int low,int high,int[][]a,int x,int m)
    {
        int mid;
        int midE;
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
                return search(mid+1, high, a, x,m);
            }
            else
            {
                return search(low, mid-1, a, x,m);
            }

        }
        return false;
    }
    
}
