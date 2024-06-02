package MapsGenerecs;
public class Custom 
{
    public static void main(String[] args) 
    {
        Gen<String> g=new Gen<String>("java");
        g.disp();
        System.out.println( g.getObj());

    }
}

class Gen<I>
{
    I obj;

    public Gen(I obj)
    {
        this.obj=obj;
    }

    public void disp()
    {
        System.out.println(obj.getClass().getName());
    }
    public I getObj()
    {
        return obj;
    }
}
