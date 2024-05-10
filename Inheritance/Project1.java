package Inheritance;

import java.util.*;
public class Project1 
{
    public static void main(String[] args) 
    {
        Rectangle a=new Rectangle();
        Square b=new Square();
        Circle c=new Circle();

        a.input();
        a.calculate();
        a.disp();

        b.input();
        b.calculate();
        b.disp();

        c.input();
        c.calculate();
        c.disp();

        



    }
}

class Rectangle
{
    float length;
    float breadh;
    float area;

    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter length of rectangle");
        length=s.nextFloat();
        System.out.println("enter breadth of rectangle");
        breadh=s.nextFloat();
    }

    void calculate()
    {
        area=length*breadh;
    }

    void disp()
    {
        System.out.println("the area of rectangle is: "+area);
    }

    
}
class Square
{
    float length;
    float area;

    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter length of sqaure");
        length=s.nextFloat();

    }

    void calculate()
    {
        area=length*length;
    }

    void disp()
    {
        System.out.println("the area of sqaure is: "+area);
    }

}
class Circle
{
    float radius;
    float area;

    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter radius of sqaure");
        radius=s.nextFloat();

    }

    void calculate()
    {
        area=3.14f*radius*radius;
    }

    void disp()
    {
        System.out.println("the area of cirlce is: "+area);
    }
}
