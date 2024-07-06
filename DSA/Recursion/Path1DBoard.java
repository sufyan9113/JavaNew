package DSA.Recursion;

public class Path1DBoard 
{
    public static void main(String[] args) 
    {
        int n=9;
        path(0,n,"");
    }
    public static void path(int cp,int dp,String s)
    {
        if(cp==dp)
        {
            System.out.println(s);
            return;
        }
        if(cp>dp)
        {
            return;
        }
            path(cp+1,dp,s+1);
            path(cp+2,dp,s+2);
            path(cp+3,dp,s+3);
            path(cp+4,dp,s+4);
            path(cp+5,dp,s+5);
            path(cp+6,dp,s+6);
    }
}