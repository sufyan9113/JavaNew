package Loops;
public class PatternTrai1 
{
    public static void main(String[] args) 
    {
        int row=6; int col=11;

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(j>=i && j<col-i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
}
}
