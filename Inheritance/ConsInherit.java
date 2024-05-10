package Inheritance;



class ConsInherit 
{
    public static void main(String[] args) 
    {
        Cons2 c=new Cons2();
        Cons2 d=new Cons2(10,20);
    }
}

class Cons1
{
    int a,b;

    public Cons1()
    {
        System.out.println("parent default cons");
    }
    public Cons1(int a, int b)
    {
        System.out.println("parent parameterised cons");

        this.a=a;
        this.b=b;

    }
}

class Cons2 extends Cons1
{
    int c,d;

    public  Cons2()
    {
        this(10,20);
        System.out.println("child default cons");
    }
    public Cons2(int c, int d)
    {   
        super(10,20);
        System.out.println("child parameterised cons");
        this.c=c;
        this.d=d;

    }
}