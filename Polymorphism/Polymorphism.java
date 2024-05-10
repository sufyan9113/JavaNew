package Polymorphism;

public class Polymorphism 
{
    public static void main(String[] args) 
    {
        Cat a=new Cat();
        Animal b=new Dog();
        Animal c=new Horse();

        Animal an=new Animal();

       

    
        an=a;
        an.eat();
        an.sleep();

        an=b;
        an.eat();
        an.sleep();

        an=c;
        an.eat();
        an.sleep();
    

       
    }
}

class Animal
{
    void eat()
    {
        System.out.println("animal eats");
    }

    void sleep()
    {
        System.out.println("animal sleep");
    }
}

class Cat extends Animal
{
    
    void eat()
    {
        System.out.println("cat eat fish");
    }
    void sleep()
    {
        System.out.println("cat sleep");
    }
}

class Dog extends Animal
{
    void eat()
    {
        System.out.println("dog eat meat");
    }
    void sleep()
    {
        System.out.println("dog sleep");
    }
}

class Horse extends Animal
{
    
    void eat()
    {
        System.out.println("Horse eat grass");
    }
    void sleep()
    {
        System.out.println("horse sleep");
    }
}
