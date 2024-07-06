package DSA.Recursion;

import java.util.Scanner;

class Staicase
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num of stairs");
        int stairs=s.nextInt();

        int ways=countWays(stairs+1);
        System.out.println("no of ways to climb "+stairs+" stairs = "+ways);

    }

    public static int countWays(int n)
    {
        int res=0;
        if(n<=1)
        {
            return n;
        }

        else
        {
            res=countWays(n-1)+countWays(n-2);
        }
        return res;

    }
}