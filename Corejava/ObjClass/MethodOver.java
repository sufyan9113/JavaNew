package ObjClass;

public class MethodOver 
{
    public static void main(String[] args) 
    {
        MethodOver m=new MethodOver();
        System.out.println("main method");
        m.main();

        MethodOverloading mo= new MethodOverloading();
        mo.method((byte)5);

      

    }

    void main()
    {
        System.out.println("main overload method");
    }
  
}

class MethodOverloading

{
    /* 
    void method(byte a)
    {
        System.out.println("byte "+a);
    }
     */
    void method(short a)
    {
        System.out.println("short "+a);
        
    }

    void method(int a)
    {
        System.out.println("int "+a);
    }

    void method(long a)
    {
        System.out.println("long "+a);
    }

    void method(char a)
    {
        System.out.println("char "+a);
    }

    void method(boolean a)
    {
        System.out.println("boolean "+a);
    }
/* 
    void method(float a)
    {
        System.out.println("float "+a);
    }

    void method(double a)
    {
        System.out.println("double "+a);
    }
    */
    void method(String a)
    {
        System.out.println("double "+a);
    }
}
