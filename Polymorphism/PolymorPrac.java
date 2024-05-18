package Polymorphism;

class PolymorPrac
{
    public static void main(String[] args) 
    {
       Animal a=new Cat();
       Animal b=new Dog();
       Run r=new Run();
       r.runMethod(a);
       r.runMethod(b);
    }
}

class Run
{
    void runMethod(Animal a)
    {
        a.sleep();
        a.eat();
    }
}
abstract class Animal
{
   abstract void sleep();
   abstract void eat();
}

class Cat extends Animal
{
    public void sleep()
    {
        System.out.println("cat sleep");
    }
    public void eat()
    {
        System.out.println("cat eat");
    }
}

class Dog extends Animal
{
    public void sleep()
    {
        System.out.println("dog sleep");
    }
    public void eat()
    {
        System.out.println("dog eat");
    }
}


