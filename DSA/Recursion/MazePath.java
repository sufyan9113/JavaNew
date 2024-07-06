package DSA.Recursion;

public class MazePath 
{
    public static void main(String[] args) 
    {
        pathPrint(0,0,3 ,3,"");
    }

    public static void pathPrint(int cr,int cc,int dr,int dc,String s)
    {
        if(cr>=dr|| cc>=dc)
        {
            return;
        }
        if(cr==dr-1&& cc==dc-1)
        {
            System.out.println(s);
            return;
        }

        pathPrint(cr, cc+1, dr, dc, s+"H");
        pathPrint(cr+1, cc, dr, dc, s+"V");
    }

}
