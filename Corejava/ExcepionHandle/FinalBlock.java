package ExcepionHandle;
import java.util.*;

public class FinalBlock 
{
    public static void main(String[] args) 
    {
        FinalBlo f=new FinalBlo();
        f.finalCheck();
    }
}

class FinalBlo
{
    int a;
    Scanner s=new Scanner(System.in);
    void finalCheck()
    {
        System.out.println("enter number");
        
        /* 
        try(Scanner s=new Scanner(System.in))//  try with resource to close resources
        {
            a=s.nextInt();
        }
        */
        try
        {
            a=s.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("enter number only "+e);
        }
        catch(Exception e)
        {
            System.out.println("something is wrong "+e);
        }
        finally
        {
            s.close();
            System.out.println("in finally block");
        }
        
        System.out.println(a);
        System.out.println("task completed");
    }
    
}
