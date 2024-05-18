package Abstract;
public class AbstCns 
{
    public static void main(String[] args) 
    {
        Mn a=new B();
        St.Sti o=new St.Sti();
        o.change();
        
    }
}

abstract class Mn
{
    public Mn()
    {
        System.out.println("abstract class cnstruct");
    }
}
class B extends Mn
{

}

class St
{
    static class Sti
    {
        void change()
        {
            System.out.println("inner static class method");
        }
    }
}
