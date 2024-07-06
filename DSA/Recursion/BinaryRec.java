package DSA.Recursion;

public class BinaryRec 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,4,6,7,10,15,20,25,26,29};
        int low=0;
        int high=a.length-1;
        int x=29;
        int ind=search(low,high,a,x);
        System.out.println(ind);


    }
    public static int search(int low,int high,int[]a,int x)
    {
        int mid=low+(high-low)/2;
        int res=-1;

        while(low<=high)
        {

        if(a[mid]==x)
        {
            return mid;
        }
        else if(a[mid]<x)
        {
            return search(mid+1, high, a, x);
        }
        else
        {
            return search(low, mid-1, a, x);
        }
    }
        return res;
    }
}
