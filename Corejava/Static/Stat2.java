package Static;

class Demo
{
    static int a;
    static int b;
    int c;
    int d;

    static {
        a=10;
        b=20;
        System.out.println(a);
        System.out.println(b);
        System.out.println("in static block");
    }
    {
        c=30;
        d=40;
        System.out.println("in non static instantiation block");   
    }

    static void disp1()
    {
        System.out.println("in static method");
    }

    void disp2()
    {
        System.out.println(c);
        System.out.println(d);
        System.out.println("in non static method");
    }
}
class Stat2 
{
    static int a=10;
    
    public static void main(String[] args) 
    {
        System.out.println("in main method");
        Demo d=new Demo();
        Demo.disp1();
        d.disp2();
    }
    
}

