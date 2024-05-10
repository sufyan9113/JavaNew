package Interfac;

public class NewJava8Feature 
{
    public static void main(String[] args) 
    {
        E a=new D();
        a.disp();
        a.show();
        E.gate();
    }
}
class D implements E
{
    public void disp()
    {
        System.out.println("in disp class D");
    }
    /* 
    public void show()
    {
        System.out.println("show in class D");
    }
    */
    
}
interface E
{
    void disp();

    default void show()
    {
        System.out.println("method implements using default keyword");
    }

    static void gate()
    {
        System.out.println("method implements using static keyword"); 
    }
}
