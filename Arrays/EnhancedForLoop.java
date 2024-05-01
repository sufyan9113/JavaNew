package Arrays;

public class EnhancedForLoop 
{
    public static void main(String[] args) 
    {
        int[]a=new int[4];

        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;

        int[]c={1,2,3,4,5,6};

        int[][]d=new int[2][];
        d[0]=new int[2];
        d[1]=new int[3];

        d[0][0]=1;
        d[0][1]=2;

        d[1][0]=3;
        d[1][1]=4;
        d[1][2]=5;

        int[][] e={{9,10,11,12},{13,14},{15,16,17}};
       
       

        for(int b:a)
        {
            System.out.print(b+" ");
        }
        System.out.println();

        for(int b:c)
        {
            System.out.print(b+" ");
        }
        System.out.println();

        System.out.println("jagged array");

        for(int[] b:d)
        {
            for(int f:b)
            {
                System.out.print(f+" ");
            }
            System.out.println();
            
        }

        System.out.println();

        System.out.println("jagged array 2");

        for(int[]b:e)
        {
            for(int g:b)
            {
                System.out.print(g+ " ");
            }
            System.out.println();
        }

    }
}
