package Polymorphism;
public class PolyPrac 
{
    public static void main(String[] args) 
    {
        Children a=new Children();
        Adult b=new Adult();
        OldMan c=new OldMan();

        Run r=new Run();
        r.disp(a);
        r.disp(b);
        r.disp(c);

/* 
        h=a;        // not atcual polymor
        h.sleep();
        h.eat();
        h=b;
        h.sleep();
        h.eat();
        h=c;
        h.sleep();
        h.eat();
        */
    }
}
class Run
{
    void disp(Human h)
    {
        h.sleep();
        h.eat();
    }
}

class Human
{
    void sleep()
    {
        System.out.println("human needs sleep");
    }
    void eat()
    {
        System.out.println("human eat to live");
    }
}

class Children extends Human
{
    void sleep()
    {
        System.out.println("Children needs more sleep");
    }
    void eat()
    {
        System.out.println("children needs milk");
    }
}

class Adult extends Human
{
    void sleep()
    {
        System.out.println("Adults needs 8hr sleep");
    }
    void eat()
    {
        System.out.println("Adult eats more food");
    }
}

class OldMan extends Human
{
    void sleep()
    {
        System.out.println("OldMan needs more 8hr sleep");
    }
    void eat()
    {
        System.out.println("OldMan eats less food");
    }
}
