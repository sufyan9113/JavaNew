package ExcepionHandle;

public class ExceptionCase 
{
    public static void main(String[] args) 
    {
        
        try
        {
            System.out.println("in try block");
            int a=10/0;
        }
        catch(Exception e)
        {
            int a=10/0;
            System.out.println("in catch block");
            
        }
        finally
        {
            System.out.println("in finally block");
        }
        System.out.println("task completed");
    }
}
