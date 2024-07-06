package DSA.Recursion;
import java.util.*;
class Fibonacci
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num to find factorial");
        int n=s.nextInt();

        int r=getFibo(n);
        System.out.println("fibonacci of "+n+"= "+r);
    }
    public static int getFibo(int n)
    {
        if(n==0|| n==1)
        {
            return n;
        }
       

        return getFibo(n-1)+getFibo(n-2);
    }

}