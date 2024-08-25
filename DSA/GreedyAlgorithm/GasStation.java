package DSA.GreedyAlgorithm;

public class GasStation 
{
    public static void main(String[] args) 
    {
        int[]a={2,3,4};
        int[]b={3,4,3};
        int startInd=find(a,b);
        System.out.println(startInd);
    }
    public static int find(int[]a,int[]b)
    {
        int n=a.length;
        int start=0; int fuel=0; int sum=0;

        for(int i=0; i<n;i++)
        {
            sum+=a[i]-b[i];
            fuel+=a[i]-b[i];
            if(fuel<0)
            {
                fuel=0; 
                start=i+1;
            }
        }
        if(sum>=0) return start%(n);
        else return -1;
    }
}
