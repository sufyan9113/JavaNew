package Inheritance;

public class TypesInherit 
{
    public static void main(String[] args) 
    {
        Child1 c1=new Child1();
        Child2 c2=new Child2();
        Child3 c3=new Child3();

        c1.eat();
        c2.eat();
        c3.eat();

        c1.sleep();
        c2.sleep();
        c2.walk();
        c3.talk();
        
    }
}

class Parent
{
    int age; 
    String name;

    Parent()
    {
        age=18;
        name="abc";
        System.out.println("in parent class construc");
        System.out.println(age);
    }
    void eat()
    {
        System.out.println("eat method parent class");
        System.out.println(name);
    }
}

class Child1 extends Parent
{
    void sleep()
    {
        System.out.println("sleep method child1 class");
        System.out.println(name);
    }
}

class Child2 extends Child1
{
    void walk()
    {
        System.out.println("walk method child2 class");
        System.out.println(name);
    }
}

class Child3 extends Parent 
{
    void talk()
    {
        System.out.println("talk method child3 class");
        System.out.println(name);
    }
}
