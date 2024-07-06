package Arrays;

public class JaggedArr 
{
    public static void main(String[] args) 
    {
        int[][]a=new int[3][];

        a[0]=new int[4];
        a[1]=new int[2];
        a[2]=new int[5];

        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;
        a[0][3]=4;

        a[1][0]=5;
        a[1][1]=6;

        a[2][0]=7;
        a[2][1]=8;
        a[2][2]=9;
        a[2][3]=10;
        a[2][4]=11;
       
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        int[][]b={{1,2,3,4,5},{6,7,8},{9,10,11,12},{13,14}};

        for(int i=0; i<b.length;i++)
        {
            for(int j=0; j<b[i].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }


    }
}
