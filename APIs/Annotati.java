package APIs;


public class Annotati 
{
    public static void main(String[] args) 
    {
      Animal c=new Cat();
      c.eat();
      c.sleep();
    }
}

@FunctionalInterface    //
interface Func
{
    void inter1();
    void inter2();
}

abstract class Animal
{

    abstract public void sleep();

    public void eat()
    {
        System.out.println("in eat method");
    }
}

class Cat extends Animal
{

    @Override
    public void sleep()
    {
        System.out.println("in sleep method cat");
    }

    public void run()
    {
        System.out.println("in run method cat");
    }
}
