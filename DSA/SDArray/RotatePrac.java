package DSA.SDArray;
import java.util.Arrays;

class RotatePrac
{
    public static void main(String[] args) 
    {
        int[][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][]b={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        disp(a);
        rotate(a);
        prefix(b);
        

    }
    public static void formula(int r1,int c1,int r2,int c2,int[][]a)
    {
        int sum,total,left,up,rep=0;

        total=a[r2][c2];
        left=a[r2][c1-1];
        up=a[r1-1][c2];
        rep=a[r1-1][c1-1];
        sum=total-left-up+rep;
        System.out.println(sum);

    }
    public static void prefix(int[][]a)
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
        disp(a);

        for(int i=1; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j]+=a[i-1][j];
            }
        }
        disp(a);
        formula(2, 2, 3, 3, a);
    }
    public static void rotate(int[][]a)
    {
        int n=a.length;
        int m=a[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=i+1;j<m;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        disp(a);

        for(int i=0;i<n; i++)
        {
            int li=0;
            int ri=n-1;
            while(li<ri)
            {
                int temp=a[i][li];
                a[i][li]=a[i][ri];
                a[i][ri]=temp;
                li++;
                ri--;
            }
        }
        disp(a);
        
    }
    public static void disp(int[][]a)
    {
        for(var i:a)
        {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
    }
}

