package Abstract;
public class Abstractrac 
{
    public static void main(String[] args) 
    {
        
    }
}

abstract class Test
{
     abstract void testRun();
}

 abstract class Final extends Test
{
    /* 
    void testRun()
    {
        System.out.println("testrun meth");
    }
    */

}

interface Test1
{
     void testRun();
}

abstract class Final1 implements Test1
{
    /* 
    void testRun()
    {
        System.out.println("testrun meth");
    }
    */

}
