package MapsGenerecs;

public class CustomeGener 
{
    public static void main(String[] args) 
    {
        Gen1<Integer> g=new Gen1<Integer>(15);
        g.disp();
        System.out.println( g.getObj());

        Gen1<String> g1=new Gen1<String>("check");

        g1.disp();
        System.out.println(g1.getObj());
    }
}


class Gen1<M>
{
    M obj;

    public Gen1(M obj)
    {
        this.obj=obj;
    }

    public void disp()
    {
        System.out.println(obj.getClass().getName());
    }

    public M getObj()
    {
        return obj;
    }
}