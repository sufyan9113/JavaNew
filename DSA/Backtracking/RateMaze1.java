package DSA.Backtracking;

public class RateMaze1 
{
    public static void main(String[] args) 
    {
        int r=3;
        int c=3;
        boolean[][]o=new boolean[r][c];
        print(0,0,r-1,c-1,o,"");
    }
    public static void print(int sr,int sc,int dr,int dc,boolean[][]isValid,String s)
    {
        if(sr==dr && sc==dc )
        {
            System.out.println(s);
            return;
        }
        if(sr>dr ||sc>dc || sr<0||sc<0)
        {
            return;
        }
        if(isValid[sr][sc]==true)
        {
            return;
        }

        isValid[sr][sc]=true;

        //right
        print(sr, sc+1, dr, dc, isValid,s+"R");

        //down
        print(sr+1, sc, dr, dc, isValid,s+"D");

        //left
         print(sr, sc-1, dr, dc, isValid,s+"L");

        //up
        print(sr-1, sc, dr, dc, isValid,s+"U");

        isValid[sr][sc]=false;
    }
    
}
