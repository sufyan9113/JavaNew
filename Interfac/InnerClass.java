package Interfac;
public class InnerClass
{
    public static void main(String[] args) 
    {
       /*  Car c=new Car();
        Car.Engine e=c.new Engine();
        c.carStart();
        e.engineStart();
        */
      //  new Car().carStart();
       // new Car().new Engine().engineStart();

       Car.Engine e=new Car().new Engine();
       e.engineStart();
       
    }
}

class Car
{
    void carStart()
    {
        System.out.println("car start");
    }

    class Engine
    {
        void engineStart()
    {
        System.out.println("engine start");
    }
    }
}
