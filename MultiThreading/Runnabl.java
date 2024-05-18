package MultiThreading;

import java.util.Scanner;

public class Runnabl 
{
    public static void main(String[] args) 
    {

        Check r1=new Check();
        Runnable r2=()->{
            System.out.println("in 1 thread");
            try
            {
                for(int i=0; i<5; i++)
                {
                    System.out.print("* ");
                    Thread.sleep(1000);
                }
                System.out.println();
            }
            catch(Exception e)
            {
                System.out.println("exception occurs");
            }
           
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();

       


       

        

            
        
    }
}

class Check implements Runnable 
{
    public void run()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("in 2 thread");

        System.out.println("enter 1st number: ");
        int a=s.nextInt();

        System.out.println("enter 2nd number: ");
        int b=s.nextInt();

        System.out.println("result: "+a*b);


    }
}
