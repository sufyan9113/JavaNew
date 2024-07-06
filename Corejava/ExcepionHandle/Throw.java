package ExcepionHandle;

public class Throw 
{
    public static void main(String[] args) 
    {
         
        try
        {
            alpha();  
        }
        catch(Exception e)
        {
            System.out.println("something is wrong "+e);
        }
        

        //alpha();
       
        
        
        
    }

    public static void alpha()  throws ArithmeticException,Exception
    {
        int a=10;
        int b=0;
        int c=0;

        try
        {
            c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception occured  "+e);
            throw e;
        }
        catch(Exception e)
        {
            System.out.println("exception error;  "+e);
            throw e;
        }
        finally
        {
            System.out.println("in finally block");
        }
        System.out.println(c);
        
    }
}
