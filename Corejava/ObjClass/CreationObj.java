package ObjClass;

public class CreationObj 
{
    int a=10;
    String name="abc";
    public static void main(String[] args) 
    {
        CreationObj o1=new CreationObj();
        CreationObj o2=new CreationObj();
        o1.a=5;
        o2.name="def";

        System.out.println(o1.a);
        System.out.println(o1.name);

        System.out.println(o2.a);
        System.out.println(o2.name);
        o1.check();
        o2.check();
        check2();
    }
     void check()

    {
        int a=10;
        System.out.println("check "+a);
      
    }

    static void check2()
    {
        int a=10;
        System.out.println("check2 "+a);
    }
}
