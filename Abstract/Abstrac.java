package Abstract;

class Abstrac
{
    public static void main(String[] args) 
    {
       // AeroPlane o=new AeroPlane(); object of  abstract class cannot be created as there no implimentation
            
     
        AeroPlane a=new CargoPlane();
        AeroPlane b=new PassengerPlane();

        a.fly();
        a.takeOff();
        a.landing();
        b.fly();
        b.takeOff();
        b.landing();

    }
}

abstract class AeroPlane 
{
    abstract void fly();
    abstract void takeOff();

    void landing()
    {
        System.out.println("plane is landing");
    }
    
}

class CargoPlane extends AeroPlane
{
    void fly()
    {
        System.out.println("cargoplane fly method");
    }
    
    void takeOff()
    {
        System.out.println("cargoplane takeOff method");
    }
    
}

class PassengerPlane extends AeroPlane
{
    void fly()
    {
        System.out.println("passengerplane fly method");
    }
    void takeOff()
    {
        System.out.println("passengerplane takeOff method");
    }
}