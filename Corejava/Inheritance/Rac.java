package Inheritance;
import javax.xml.catalog.Catalog;

public class Rac 
{
    
    public static void main(String[] args) 
    {
        Cat c=new Cat("cat","british");
        c.eat();
    }
}

class Cat extends Animal
{
    private String name;
    private String breed;

    public Cat(String name,String breed)
    {
        super(name);
        this.name=name;
        this.breed=breed;
    }

    @Override
    public void eat()
    {
        super.eat();
        System.out.println("Override eat methOd");
    }


}
class Animal
{
    private String name;

    Animal (String name)
    {
        this.name=name;
    }

    public void eat()
    {
        System.out.println(name+" is eating");
    }
}

