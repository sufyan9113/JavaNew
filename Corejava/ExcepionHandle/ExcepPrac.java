package ExcepionHandle;

 class ExcepPrac
{
    public static void main(String[] args)  // throws Exception main is called by JVM so jvm have to handle exception
    {
       // PracExcep p=new PracExcep();
       // p.divid();
      // DuckExcep d=new DuckExcep();
      /*  try
        {
            d.a();
        }
        catch(Exception e)
        {
            System.out.println("error "+e);
        }
        System.out.println("main method completed");
       */
        Custom c=new Custom();
        c.dividePositive();

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
class Custom
{
    int a=10;
    int b=-1;
    int c;

    void dividePositive()
    {
    
        try
        {
            if(b<0)
            {
                Exception e=new MyException("negative number not allowed");
                throw e;
            }
            else
            {
                c=a/b;
            }
        }

        catch(ArithmeticException e)
        {
            System.out.println("cant divide by zero : "+e);
        }
        catch(Exception e)
        {
            System.out.println("error "+e);
        }
        System.out.println(c);
    }
}

class DuckExcep
{
    int a=10;
    int b=0;
    int c;
    void a() throws Exception
    {
        b();
        /* 
        try
        {
            b();
        }
        catch(Exception e)
        {
            System.out.println("error "+e);
        }
        System.out.println("a method completed");
        */
    }
    void b() throws Exception 
    {
        c=a/b;
    }
}

class PracExcep
{
    int a=10;
    int b=5;
    int[]ar={1,2,3,4};

    int c;

    void divid()
    {
        try
        {
            c=a/b;
            System.out.println(ar[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("index limit exceed");
        }
        catch(ArithmeticException e)
        {
            System.out.println("cant divid by zero");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }
        finally
        {
            System.out.println("in finally block");
        }
        
        System.out.println(c);
        System.out.println("completed");
    }



}