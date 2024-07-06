package Abstract;

class ExtendAbstract 
{
    public static void main(String[] args) 
    {
        Cd c=new Cd();
        c.disp();
        c.show();
        c.run();
    }
}

class Cd extends Ab
{
    /* 
    public Cd()
    {
        super(10);
    }
    */
    void disp()
    {
        System.out.println("in disp Cd class");
    }

    
    void show() 
    {
        System.out.println("in show Cd class");
    }
}

abstract class Ab
{
    public Ab()  // we can write constructor in abstract class
    {
        System.out.println("Ab constructor");
    }
    public Ab(int a)
    {
        System.out.println("Ab parameterised constructor");
    }
    abstract void disp();

    abstract void show();

    public void run()
    {
        System.out.println("in run Ab class");
    }
}