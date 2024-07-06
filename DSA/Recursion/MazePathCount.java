package DSA.Recursion;

public class MazePathCount 
{
    
    public static void main(String[] args) 
    {
        int r=4;
        int c=6;
        int res=count(0,0,r,c);
        System.out.println(res);
    }

    public static int count(int sr,int sc,int dr,int dc)
    {
        
        if(sr==dr-1 && sc==dc-1)
        {
            return 1;
        }
        if(sr>=dr || sc>=dc )
        {
            return 0;
        }
        int down=count(sr+1, sc, dr,dc);
        int right=count(sr, sc+1,dr,dc);
        int ways=down+right;
        return ways;
    }
}
