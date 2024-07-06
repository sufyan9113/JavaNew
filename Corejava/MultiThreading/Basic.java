package MultiThreading;
import java.util.Scanner;

public class Basic 
{
    
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
       System.out.println("main metod");   // default thread  single line of execution
       System.out.println("enter 1st number");
       int a=s.nextInt();

       System.out.println("enter 2ndnumber");
       int b=s.nextInt();

       int r=a+b;

       System.out.println(r);

       for(int i=0; i<5; i++)
       {
        System.out.print("* ");
       }
       System.out.println();


       
    }
}
