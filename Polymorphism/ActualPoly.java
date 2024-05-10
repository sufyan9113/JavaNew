package Polymorphism;

public class ActualPoly 
{
    public static void main(String[] args) 
    {
        Suzuki c1=new Suzuki();
        Hyundai c2=new Hyundai();
        Kia c3=new Kia();

        Start s=new Start();
        s.spark(c1);
        s.spark(c2);
        s.spark(c3);

    }
}

class Start
{
    void spark(Car c)
    {
        c.start();
        c.breakes();
    }
}

class Car
{
    void start()
    {
        System.out.println("car starting");
    }

    void breakes()
    {
        System.out.println("car stopped");
    }
    
}

class Suzuki extends Car
{
    void start()
    {
        System.out.println("Suzuki starting");
    }

    void breakes()
    {
        System.out.println("Suzuki stopped");
    }

}

class Hyundai extends Car
{

    void start()
    {
        System.out.println("Hyundai starting");
    }

    void breakes()
    {
        System.out.println("Hyundai stopped");
    }
}

class Kia extends Car

{

    void start()
    {
        System.out.println("Kia starting");
    }

    void breakes()
    {
        System.out.println("Kia stopped");
    }
}
