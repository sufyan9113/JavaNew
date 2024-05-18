package ObjClass;
public class Varia 
{
    int a;

    public static void main(String[] args) 
    {
        int a=10;
        Varia v=new Varia();
        v.vaiCheck(a,v);
        System.out.println(v.a);

    }
    void vaiCheck(int a,Varia v)
    {
        v.a=a;
    }

}
