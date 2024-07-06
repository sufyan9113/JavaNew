package Inheritance;

class Specialised1 
{
    public static void main(String[] args)
    {
        Paren o=new Chil();
        o.awake();
        o.sleep();
        //o.eat(); by parent type reference can not access specialised method
        ((Chil) o).eat(); //downcasting required
    }
}

class Paren
{
    void awake()
    {
        System.out.println("awake method parent");
    }
    void sleep()
    {
        System.out.println("sleep method parent");
    }

}
class Chil extends Paren
{
    void sleep() // overriden method
    {
        System.out.println("sleep method child");
    }

    void eat() // specialised method child
    {
        System.out.println("eat method child");
    }
}
