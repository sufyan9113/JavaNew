package Contructor;

public class ConstructorOverloading 
{
    public static void main(String[] args) 
    {
        Test t1=new Test();
        Test t2=new Test(10);
        Test t3=new Test("check");
        Test t4=new Test("abc",10);
    }
}

class Test
{
    private int age;
    private String name;

    public Test()
    {
        this(10);
        System.out.println(name+" "+age+" zero parameter cons");
    }

    public Test(int age)
    {
        this("abc");
        this.age=age;
        System.out.println(name+" "+age+" int cons");
    }

    public Test(String name)
    {
        this("abc",10);
        this.name=name;
        System.out.println(name+" "+age+" string cons");
    }
    public Test(String name,int age)
    {
        super();
        this.name=name;
        this.age=age;
        System.out.println(name+" "+age+" String int cons");
    }

    public void disp()
    {
        System.out.println(name+" "+age);
    }
}
