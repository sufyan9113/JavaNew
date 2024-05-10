package Inheritance;

public class MethodsType 
{
    public static void main(String[] args) 
    {
        SubClass s=new SubClass();
        s.disp();
        s.check();
        s.show();
    }
}

class SuperClass 
{
    int age;
    String name;

    void disp() // inherited method
    {
        System.out.println("inherited method");
       // System.out.println("age : "+age +" name: "+name);
    }
     void check()
    {
        System.out.println("check superclass");
    }
}

class SubClass extends SuperClass
{

     void check() // overriding method
    {
        System.out.println("check subclass override");
    }

    void show() //specialised method
    {
        System.out.println("specialised method");
       // System.out.println(age+" "+name);
    }
}
