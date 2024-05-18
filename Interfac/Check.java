package Interfac;


public class Check 
{
    public static void main(String[] args) 
    {
        Xy o=new Xy();
        o.m1();
        o.m2();
   
        
       

    }
}

class Xy extends Cd implements Ab //implements Ab extends Cd
{
    public void m1()
    {
        System.out.println("m1 method");
    }
}

interface Ab
{
    public void m1();
         
}
interface A
{
    void check();
}

interface B extends Ab,A
{

}

class Cd
{
    int a=10;

    public void m2()
    {
        System.out.println("m2 method");
        System.out.println(a);
    }
}
