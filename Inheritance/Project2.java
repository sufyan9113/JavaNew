package Inheritance;
import java.util.*;
class Project2 
{
    public static void main(String[] args) 
    {
        Rectangle a=new Rectangle();
        Square b=new Square();
        Circle c=new Circle();

        Load l=new Load();
        l.start(a);
        l.start(b);
        l.start(c);
    }
}

class Load
{
    void start(AreaCal a)
    {
        a.input();
        a.cal();
        a.disp();
    }
}
abstract class AreaCal
{
    float area;

    abstract void input();
    abstract void cal();
    void disp()
    {
        System.out.println("area is: "+area);
    }
    
}

class Rectangle extends AreaCal

{
    float length;
    float breadh;
    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter rectangle length");
        length=s.nextFloat();
        System.out.println("enter rectangle breadh");
        breadh=s.nextFloat();
        
    }
    void cal()
    {
        area=length*breadh;
    }

    
}

class Square extends AreaCal

{
    float length;
   
    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter sqaure length");
        length=s.nextFloat();
    }
    void cal()
    {
        area=length*length;
    }

    
}

class Circle extends AreaCal

{
    float radius;
    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter circle radius");
        radius=s.nextFloat();
    }
    void cal()
    {
        area=3.14f*radius*radius;
    }

    
}
