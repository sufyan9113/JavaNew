package Static;


class Stat
{
     
        
        static int age;
        static
        {                                       // non static block execute at time of object creation
            age=18;
            System.out.println("in static block");
            System.out.println(age);
        }

    public static void main(String[]args)
    {
        System.out.println("main method");
        Stat s=new Stat();
            
    }
}