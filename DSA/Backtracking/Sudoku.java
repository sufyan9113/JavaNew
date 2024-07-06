package DSA.Backtracking;

public class Sudoku 
{
   
    public static void main(String[] args) 
    {
        int[][]a= { {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        printSudoku(a, 0, 0);
    }


public static void printSudoku(int[][]a,int row,int col)
{
    if(row==9)
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
           
        }
        return;
        
    }

        if(a[row][col]!=0)
        {

            if(col!=8) printSudoku(a, row, col+1);
            else printSudoku(a, row+1, 0);
        }

        else
        {
            for(int i=1; i<=9; i++)
            {
                if(isValid(a,row,col,i))
                {
                    a[row][col]=i;
                    if(col!=8) printSudoku(a, row, col+1);
                    else printSudoku(a, row+1, 0);
                    a[row][col]=0;

                }

            }
            
        }

}
    public static boolean isValid(int[][]a,int row,int col, int n)
    {
        for(int i=0; i<9; i++)
        {
            if(a[i][col]==n) return false;
        }

        for(int j=0; j<9; j++)
        {
            if(a[row][j]==n) return false;
        }

        int sR=row/3*3;
        int sC=col/3*3;

        for(int i=sR; i<sR+3; i++)
        {
            for(int j=sC; j<sC+3; j++)
            {
                if(a[i][j]==n) return false;
            }
        }

        return true;
    
    }


}
