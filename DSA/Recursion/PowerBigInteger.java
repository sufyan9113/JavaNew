package DSA.Recursion;
import java.math.*;

public class PowerBigInteger 
{
    public static void main(String[] args) 
    {
        BigInteger a=BigInteger.valueOf(2);
        int b=64;
        BigInteger res=pow(a,b);
        System.out.println("a^b ="+res);
    }
    public static BigInteger pow(BigInteger a,int b)
    {
       BigInteger res,fin;

        if(b<=1)
        {
            return a;
        }
        else
        {
            res=pow(a, b/2);
        }
        
        fin=res.multiply(res);

        if(b%2==0)

        {
            return fin;
        }
        else
        {
            return a.multiply(fin);
        }

    }

}
