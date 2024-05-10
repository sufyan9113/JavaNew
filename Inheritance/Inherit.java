package Inheritance;

public class Inherit 
{
    
    public static void main(String[] args) 
    {
        DerivedClass c=new DerivedClass();
        c.sleep();
        c.eat();
     //   System.out.println(c.name); //private member are not part of inheritance also constructor of parent class
        

        
    }

    
}

class BaseClass
{
    int age;
    private String name;

     BaseClass()
    {
        age=18;
        System.out.println("in BaseClass constr");
        System.out.println("age: "+age);
       // System.out.println(name);
    }

    void sleep()
    {
        System.out.println("in sleep parent class");
    }
}

class DerivedClass extends BaseClass
{

    /*   public SubClass() default cons by jvm
    {
        super(); call parent class constructor
        //body
    }

    */
    void eat()
    {
        System.out.println("in eat child class");
        System.out.println(age);
        //System.out.println(name);
    }
}


