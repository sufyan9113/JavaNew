package ExcepionHandle;

public class Ducking 
{
    public static void main(String[] args) 
    { 
        ThrowExcep t=new ThrowExcep();
        try
        {
            t.a();
        }
        catch(ArithmeticException e)
        {
            System.out.println("error "+e.getMessage());
            
        }
    }
}

class ThrowExcep 
{
    void a() 
    {
        try
        {
            b();
        }
        catch(Exception e)
        {
            System.out.println("error "+e.getMessage());
            
        }
    }

    void b() throws Exception
    {
        int a=10;
        int b=0;
        int r;
        try
        {
            r=a/b;
        }
        catch(Exception e)
        {
            System.out.println("error "+e.getMessage());
            
        }
        

    }
}
