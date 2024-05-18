package ExcepionHandle;

public class Custom 
{
    public static void main(String[] args) 
    {
        int a=10;
        int b=-1;
        int c=0;
        

        try
        {

        if(b<0)
        {
            Exception e=new MyException("negitive number not allowed");
            throw e;
        }
        else
        {
           c=a/b;
           System.out.println(c);
        } 
           
        }
        catch(Exception e)
        {
            System.out.println("enter valid number "+e);
        }
        
    }
}

class MyException extends Exception
{
    public MyException()
    {

    }
    public MyException(String s)
    {
        super(s);
    }
}
