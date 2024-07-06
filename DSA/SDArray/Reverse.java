package DSA.SDArray;

public class Reverse 
{
    
    public static void main(String[] args) 
    {
        int[]a ={1,2,3,4,5};
        int n=a.length;
        Reverse r=new Reverse();

        for(int i=0; i<n/2;i++)
        {
            r.swap(i, n, a);
        }

        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }

    public  void swap(int b,int n,int[]ar)
    {
            int temp=ar[b];
            ar[b]=ar[n-1-b];
            ar[n-1-b]=temp;
    }
}
