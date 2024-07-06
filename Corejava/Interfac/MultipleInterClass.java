package Interfac;
public class MultipleInterClass 
{
    public static void main(String[] args) 
    {
        Y a=new Y();
    }
}

class X 
{
    public void m1()
    {
        System.out.println("m2");
    }
} 

class Y extends  X implements Z,ZA,ZB // class Y implements Z extends  X 
{
    public void m2()
    {
        System.out.println("m1");
    }
}

interface Z extends ZA,ZB 
{
    void m2();
}
interface ZA
{

}
interface ZB
{

}