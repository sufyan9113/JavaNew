package DSA.Backtracking;

public class RateMaze2 
{
    public static void main(String[] args) 
    {
       
        int[][]a={{1,0,1,1},{1,1,1,1},{1,1,0,1}};
        int r=a.length;
        int c=a[0].length;
      
        print(a,0,0,r-1,c-1,"");
    }
    public static void print(int[][]a,int sr,int sc,int dr,int dc,String s)
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
        if(a[sr][sc]==0)
        {
            return;
        }
        if(a[sr][sc]==-1)
        {
            return;
        }
        
        a[sr][sc]=-1;

        //right
        print(a,sr, sc+1, dr, dc,s+"R");

        //down
        print(a,sr+1, sc, dr, dc,s+"D");

        //left
         print(a,sr, sc-1, dr, dc,s+"L");

        //up
        print(a,sr-1, sc, dr, dc,s+"U");

        a[sr][sc]=1;
    }
}
