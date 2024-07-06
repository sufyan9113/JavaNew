package DSA.Backtracking;
import java.util.*;
public class Tiling 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter board size in 2*n form");
        int n=s.nextInt();
        int count=countWays( n);
        System.out.println(count);
        
    }
    public static int countWays(int n)
    {
        
            if(n<=3)
            {
                return n;
            }

            return countWays(n-1)+countWays(n-2);
        
    }
}
