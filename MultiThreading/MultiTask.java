package MultiThreading;

import java.util.Scanner;

public class MultiTask 
{
    public static void main(String[] args) 
    {
        Mult t1=new Mult();
        Mult t2=new Mult();

        t1.setName("task-1");
        t2.setName("task-2");

        t1.start();
        t2.start();
    }
}

class Mult extends Thread
{
    public void run()
    {

        String threadName=Thread.currentThread().getName();

        if(threadName.equals("task-1"))
        {
            task1();
        }
        else
        {
            task2();
        }
        
        
        
    }
    public void task1()
    {
        System.out.println("int task 1");
        Scanner s=new Scanner(System.in);

        System.out.println("enter num1 :");
        int a=s.nextInt();
        System.out.println("enter num2 :");
        int b=s.nextInt();

        System.out.println(a+b);
    }

    public void task2()
    {
        System.out.println("in task 2");
        for(int i=0; i<5; i++)
        {
            try
            {
                System.out.print("* ");
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("error");
            }
            
        }
        System.out.println();    
    }
}
