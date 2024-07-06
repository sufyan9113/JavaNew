package DSA.MDArray;
import java.util.*;

public class PrefixSum2 
{
    static int r1,r2,c1,c2;
    public static void main(String[] args) 
    {
      
        int[][]a=arrayInput();
        disp(a);
        sum(a);
        range();
        disp(a);
       int sum=output(a, r1, c1, r2, c2);
       System.out.println(sum);
        
    }
    public static int output(int[][]a,int r1,int c1,int r2,int c2)
    {
       int total,left,up,rep,sum=0;
        
       total=a[r2][c2];
       left=a[r2][c1-1];
       up=a[r1-1][c2];
       rep=a[r1-1][c1-1];

       sum=total-left-up+rep;

        
        return sum;
    }
    public static void sum(int[][]a)
    {
        int n=a.length;
        int m=a[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=1; j<m; j++)
            {
                a[i][j]+=a[i][j-1];
            }
        }

        for(int j=0; j<m; j++)
        {
            for(int i=1; i<n; i++)
            {
                a[i][j]+=a[i-1][j];
            }
        }
    }
    public static void range()
    {
       
        Scanner s=new Scanner(System.in);

        System.out.println("enter value of r1");
        r1=s.nextInt();

        System.out.println("enter value of c1");
        c1=s.nextInt();

        System.out.println("enter value of r2");
        r2=s.nextInt();

        System.out.println("enter value of c2");
        c2=s.nextInt();

    }
    public static void disp(int[][]a)
    {
        for(var i: a)
        {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] arrayInput()
    {
        int n,m;
        Scanner s=new Scanner(System.in);
        System.out.println("enter num rows");
        n=s.nextInt();

        System.out.println("enter num col");
        m=s.nextInt();

        int[][]a=new int[n][m];

        System.out.println("enter values of arrays");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                a[i][j]=s.nextInt();
            }
            System.out.println();
        }

         return a;

    }
}

