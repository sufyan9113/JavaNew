package Interfac;

public class NeedOfInterfac 
{
    public static void main(String[] args) 
    {
       // Laptop l=new Laptop();
       // Desktop ds=new Desktop();

        Computer c=new Desktop();
        Devloper d=new Devloper();
        d.coding(c); //d.coding(l); // d.coding(ds)
    }
}

class Devloper
{
    
        void coding(Computer l) //void coding(Desktop l)  // void coding(Laptop l)
    {
        System.out.println("devloper is coding");
       
        l.codeCompile();
    }
}


interface Computer //abstract class Computer 
{
    

     void codeCompile();
}

class Laptop implements Computer //extends
{
     public void codeCompile()
     {
        System.out.println("code compile by laptop");
     }
}

class Desktop implements Computer //extends

{
    public void codeCompile()
    {
        System.out.println("code compile by desktop");
    }
}
