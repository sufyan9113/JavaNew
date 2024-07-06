package DSA.Recursion;

import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num to find factorial");
        int n=s.nextInt();

        int r=getFactorial(n);
        System.out.println("factorial of "+n+"= "+r);
    }
    public static int getFactorial(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }

        return n*getFactorial(n-1);
    }
}
