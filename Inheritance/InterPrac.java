package Inheritance;


class InterPrac

{
    public static void main(String[] args) 
    {
        C a=new Implement();
        a.see();
        a.see2();
        a.see3();
    }
}

interface Ab
{
    void see();

    default void see2()
    {
        System.out.println("default meth");
    }
}
interface C extends Ab
{
    void see3();
}

class Implement implements C
{
     
    public void see()
    {
        System.out.println("see implemented");
    }
    
    public void see3()
    {
        System.out.println("see3 implemented");
    }
}