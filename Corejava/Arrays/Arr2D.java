package Arrays;

public class Arr2D
{
    public static void main(String[] args) 
    {
        int[][]a;
        a=new int[3][2];
        
        a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
        a[2][0]=5;
        a[2][1]=6;

        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=1; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int[][]b={{1,2,3},{4,5,6}};

        for(int i=0; i<=1; i++)
        {
            for(int j=0; j<=2; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
