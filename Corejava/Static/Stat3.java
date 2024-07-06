package Static;

import java.util.Scanner;

class Farmer
{
    int pa;
 // float ri;// copy created for every object
    float dur;
    float intr; 
    static float ri=8.5f;  // only one memory is allocated and for every object cretion copy will be share

    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter principle amount");
        pa=s.nextInt();
        System.out.println("enter duration");
        dur=s.nextFloat();
       // ri=8.5f;  
    }
    void calculate()
    {
        intr=(pa*ri*dur)/100f;
    }
    void disp()
    {
        System.out.println("simple interest: "+intr);
    }
}




public class Stat3 
{
    public static void main(String[] args) 
    {
        Farmer f1=new Farmer();
        f1.input();
        f1.calculate();
        f1.disp();

        Farmer f2=new Farmer();
        f2.input();
        f2.calculate();
        f2.disp();

    }
}
