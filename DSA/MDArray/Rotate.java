package DSA.MDArray;
import java.util.Arrays;

public class Rotate 
{
    public static void main(String[] args) 
    {
        int[][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int n=a.length;
        int m=a[0].length;

        int[][]b=new int[m][n];

        for(int i=0; i<n;i++)
        {
            for(int j=0; j<m; j++)
            {

               b[j][i]=a[i][j];
            }
        }
        for(var i:b)
        {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();

        for(int i=0; i<b.length;i++)
        {
            int li=0;
            int ri=b[0].length-1;
            while(li<ri)
            {
                int temp=b[i][li];
                b[i][li]=b[i][ri];
                b[i][ri]=temp;
                li++;
                ri--;
            }
        }
        for(var i:b)
        {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();

    }
}
