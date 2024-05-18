package ExcepionHandle;

public class TwoExcepti 
{
    public static void main(String[] args) 
    {
        Excep e=new Excep();
        e.verify();
    }
}

class Excep
{
    int a=10;
    int b=5;
    int[]c={1,2,3,4};
    int r;

    void verify()
    {

        try
        {
            r=a/b;
            System.out.println(c[4]);
        }
       
       catch(ArithmeticException e)
        {
            System.out.println("cant divide by zero "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("invalid index of array "+e);
        }
        catch(Exception e)
        {
            System.out.println("something went wrong "+e);
        }
        
        
        

      

        System.out.println(r);
        System.out.println("task completed");
    }
}
