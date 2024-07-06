package DSA.Backtracking;

public class KnightPlacement 
{
    public static void main(String[] args) 
    {
        int n=2;

        char[][]c=new char[n][n];

        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++)
            {
                c[i][j]='X';
            }
        }
        place(c,0,0);
    }

    public static void place(char[][]c,int row, int col)
    {
        int n=c.length;

        if(row==n)
        {
            for(int i=0; i<n;i++)
            {
                for(int j=0; j<n;j++)
                {
                System.out.print(c[i][j]+" ");
                
                }
                System.out.println();
            }
            System.out.println();
            return;

        }

        else if(isSafe(c,row,col))
        {
            c[row][col]='K';
            if(col!=n-1)
            {
                place(c, row, col+1);
            }
            else
            {
                place(c, row+1, 0);
            }
            c[row][col]='X';
        }
            if(col!=n-1)
            {
                place(c, row, col+1);
            }
            else
            {
                place(c, row+1, 0);
            }

            
        }
    

    public static boolean isSafe(char[][]c,int row,int col)
    {
        int n=c.length;

        // 2 up 1 right
        int i=row-2;
        int j=col+1;
        if(i>=0 && j<n && c[i][j]=='K') return false;


        // 2 up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && c[i][j]=='K') return false;


         // 2 down 1 right
         i=row+2;
         j=col+1;
         if(i<n && j<n && c[i][j]=='K') return false;

         // 2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && c[i][j]=='K') return false;


        // 2 left 1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && c[i][j]=='K') return false;


        // 2 left 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && c[i][j]=='K') return false;


         // 2 right 1up
         i=row-1;
         j=col+2;
         if(i>=0 && j<n && c[i][j]=='K') return false;

         // 2 right 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && c[i][j]=='K') return false;

        return true;
    }
}
