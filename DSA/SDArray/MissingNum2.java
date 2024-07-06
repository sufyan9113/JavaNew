package DSA.SDArray;

public class MissingNum2 
{
    public static void main(String[] args) 
    {
        
        int[]a={1,2,3,4,5};
        int n=a.length;
        int xorAr=a[0];
        for(int i=1;i<n;i++)
        {
            xorAr=xorAr^a[i];
        }

        
        int xorN=1;
        for(int i=2;i<=n+1; i++ )
        {
            xorN=xorN^i;
        }

        System.out.println("missing num:"+(xorAr^xorN));
        
    }
}
