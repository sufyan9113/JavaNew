package DSA.SDArray;

public class Duplicate 
{
    public static void main(String[] args) 
    {
        int[] a={2,6,2,6,8,1,4,6};
        int n=a.length;

        for(int i=0;i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]);
                    break;
                }
            }

        }
    }
}
