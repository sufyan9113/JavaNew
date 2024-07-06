package ExcepionHandle;
import java.util.InputMismatchException;

public class TryCatchTree 
{
    public static void main(String[] args) 
    {
        
        try
        {
            System.out.println("outer try");
            try
            {
                System.out.println("inner try");
                int a=10/0;
            }
            catch(InputMismatchException e)      // if exception is not handle by  inner catch it will handle by outer catch 
            {
                System.out.println("inner catch");
            }
            finally
            {
                System.out.println("inner finally");
            }
            System.out.println("inner completed");    
        }

        catch(Exception e)
        {
            System.out.println("outer catch");
        }
        finally
        {
            System.out.println("outer finally");
        }

        System.out.println("task completed");   

    }
}

