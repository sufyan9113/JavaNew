package ExcepionHandle;
public class FinallyVsReturn 
{
    public static void main(String[] args) 
    {
       int a=fin();
       System.out.println(a);
    }
    static int fin()
    {
        try
        {
            return 0;
            
            
        }
        
        catch(Exception e)
        {
            return 1;
        }
        finally
        {
                System.out.println("in finally after return");
        }
        
        //System.out.println("in fin method");
    }
}
