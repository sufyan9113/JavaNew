package Static;

class Check
{
    static int age;

    static{
        age=18;
        System.out.println("in static block");
    }
    {
        System.out.println("in non static execution block");
    }
}
public class Stati1 
{

    static int age;

    static{
        age=18;
        System.out.println("in static block");
        System.out.println(age);
    }
    static void disp1()
    {
        System.out.println("in static disp1");
    }
    void disp2()
    {
        System.out.println("in non static disp2");
    }
    public static void main(String[] args) 
    {
        System.out.println("in main method"); //static is independent of object creation
        Stati1.disp1(); //static method called by class reference as it is  property of class
       // Stati1.disp2(); //non static method cannot be called by static bsc non static method depends on object creation
       Stati1 s=new Stati1();
       s.disp1(); //static method also called by object reference
       s.disp2();


       Check c=new Check();

    }
}
