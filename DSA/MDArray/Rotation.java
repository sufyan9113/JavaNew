package DSA.MDArray;

import java.util.Arrays;

public class Rotation 
{
    public static void main(String[] args) 
    {
        int[][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=a.length;

        disp(a);
        transpose(a,n);
        disp(a);
        rowColChange(a,n);
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

    public static void transpose(int[][]a,int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public static void rowColChange(int [][]a,int n)
    {
        for(int i=0; i<n; i++)
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
    }
}
