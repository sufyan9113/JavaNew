package DSA.SDArray;

public class PrefixSum 
{
    public static void main(String[] args) 
    {
        int[]a={1,1,1,1,1};
        int n=a.length;

        for(int i=1;i<n;i++)
        {
            a[i]+=a[i-1];
        }

        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();  
    }
}
