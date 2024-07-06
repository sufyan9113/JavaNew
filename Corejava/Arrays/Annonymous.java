package Arrays;

public class Annonymous 
{
    public static void main(String[] args) 
    {
        Annonymous a=new Annonymous();
        a.dispArray(new int[]{1,2,3,4,5});
        a.disp2DArray(new int[][]{{1,2,3,4},{1,2,3,4}});
    }
    void disp2DArray(int[][]a)
    {
        System.out.println("size of array: "+a.length+" * "+a[0].length);
        System.out.println("array elements");

        for(int[] c:a)
        {
            for(int d:c)
            {
                System.out.print(d+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    void dispArray(int[]a)
    {
        System.out.println("size of array: "+a.length);
        System.out.println("array elements");

        for(int b:a)
        {
            System.out.print(b+ " ");
        }
        System.out.println();
    }
}
