package DSA.Recursion;

public class BalanceParanthesis 
{
    public static void main(String[] args) 
    {
        int n=2;
        printCombi(0, 0, n, "");
    }

    public static void printCombi(int oc,int cc,int n,String s)
    {
        
        if(oc==n&&cc==n)
        {
            System.out.println(s);
            return;
        }

        if(oc<n)
        {
            printCombi(oc+1, cc, n, s+"(");
        }

        if(oc>cc)
        {
            printCombi(oc, cc+1, n, s+")");
        }
    }
}
