package MultiThreading;

import java.util.Scanner;

public class CreateThread 
{
    public static void main(String[] args) 
    {
        System.out.println("main thread");

        Input t1=new Input();
        Display t2=new Display();

        t1.start();
        t2.start();
    }   
}

class Input extends Thread

{
    public void run()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("in input class");
        System.out.println("enter number: ");
        int a=s.nextInt();
        System.out.println("enter number: ");
        int b=s.nextInt();

        System.out.println("result = "+(a+b));


    }
}

class Display extends Thread
{
    public void run()
    {
        System.out.println("in disp class");

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
            System.out.println("something is wrong");
        }
        
    }
}
