package DSA.Backtracking;
import java.util.*;

public class NQueen 
{
    public static void main(String[] args) 
    {
        int n=4;
        
        char[][]board=new char[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                board[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList();
        queen(board,0,ans);

        System.out.println(ans);
    }

    public static void queen(char[][]q,int row,List<List<String>>ans)
    {
        int n=q.length;
        if(row==n)
        {
            List<String>al=new ArrayList();

            for(int i=0; i<n; i++)
            {
                String s="";
                for(int j=0; j<n; j++)
                {
                    s+=q[i][j];
                }
                al.add(s);
            }
            ans.add(al);
           
           return;
        }

            for(int j=0; j<n;j++)
            {
                if(isSafe(row,j,q))
                {
                    q[row][j]='Q';
                    queen(q, row+1,ans);
                    q[row][j]='.';
                }
            }
        }
        

    public static boolean isSafe(int row,int col,char[][]q)
    {
        int n=q.length;

        //check for col
        for(int i=0; i<n; i++)
        {
            if(q[i][col]=='Q')
            {
                return false;
            }
        }

         //check for row
         for(int i=0; i<n; i++)
         {
             if(q[row][i]=='Q')
             {
                 return false;
             }
         }

         //check for NE
         int i=row;
         int j=col;
         while(i>=0 && j<n)
         {
            if(q[i][j]=='Q')
            {
                return false;
            }
            i--;
            j++;
         }

          //check for SE
           i=row;
           j=col;
          while(i<n && j<n)
          {
             if(q[i][j]=='Q')
             {
                 return false;
             }
             i++;
             j++;
          }

          //check for SW
          i=row;
          j=col;
         while(i<n && j>=0)
         {
            if(q[i][j]=='Q')
            {
                return false;
            }
            i++;
            j--;
         }

         //check for NW
         i=row;
         j=col;
        while(i>=0 && j>=0)
        {
           if(q[i][j]=='Q')
           {
               return false;
           }
           i--;
           j--;
        }

        return true;
    }
}
