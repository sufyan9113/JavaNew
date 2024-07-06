package DSA.Recursion;

class AlternateSign
{
    public static void main(String[] args) 
    {
        int n=6;
        int alterSignSum=alterSignSum(n);
        System.out.println(alterSignSum);
    }

    public static int alterSignSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
       
        if(n%2==0)
        {
            return -n+alterSignSum(n-1);
        }
        else
        {
            return n+alterSignSum(n-1);
        }
    
    }
}