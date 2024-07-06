package DSA.Backtracking;

import java.util.Arrays;

public class RateMaze 
{
    public static void main(String[] args) 
    {
        int[][]a={{1,0,1,1},{1,1,1,1},{1,1,0,1}};
        int r=a.length;
        int c=a[0].length;

        boolean[][]isVal=new boolean [r][c];

        printPath(a, isVal, 0, 0, r-1, c-1, "");

        

       
    }
    public static void printPath(int[][]a,boolean[][]isValid,int sr,int sc,int dr,int dc,String s)
    {
        if(sr==dr && sc==dc)
        {
            System.out.println(s);
            return;
        }
        if(sr>dr || sc>dc||sc<0 ||sr<0 || a[sr][sc]==0)
        {
            return ;
        }
        if(isValid[sr][sc]==true)
        {
            return;
        }

        isValid[sr][sc]=true;

        printPath(a, isValid, sr+1, sc, dr, dc, s+"D");
        printPath(a, isValid, sr, sc+1, dr, dc, s+"R");
        printPath(a, isValid, sr-1, sc, dr, dc, s+"U");
        printPath(a, isValid, sr, sc-1, dr, dc, s+"L");
 

        isValid[sr][sc]=false;
    }
}
