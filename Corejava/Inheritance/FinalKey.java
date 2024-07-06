package Inheritance;

public class FinalKey 
{
    public static void main(String[] args) 
    {
        Man m=new Man();
        m.think();

        
    }
}

//final class Human // if class made final it will not participate in inheritance
class Human
{
    final int age=10; // if final is applied to variable it becomes constant

    final void think()
    {
        //age=15;
        System.out.println("think method parent");
    }
}

class Man extends Human
{
  /*  final void think() // if final is applied to method than it cannnot be override
    {
        //age=15;
        System.out.println("think method parent");
    }
    */
}
