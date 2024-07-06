package MultiThreading;

public class Synchroni
{
    public static void main(String[] args) 
    {
        Car c=new Car();

        Thread t1 =new Thread(c);
        Thread t2 =new Thread(c);
        Thread t3 =new Thread(c);

        t1.setName("son-1");
        t2.setName("son-2");
        t3.setName("son-3");

        t1.start();
        t2.start();
        t3.start();
     


    

    }
}

class Car implements Runnable
{
   /*synchronized */public void run()
   {
        

        try
        {
            System.out.println(Thread.currentThread().getName()+" has entered in parking");
            Thread.sleep(1000);

            synchronized(this){
            System.out.println(Thread.currentThread().getName()+" got into car");
            Thread.sleep(1000);

            System.out.println(Thread.currentThread().getName()+" started driving car");
            Thread.sleep(1000);

            System.out.println(Thread.currentThread().getName()+" comeback and parked car in parking");
            Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
   }
}
