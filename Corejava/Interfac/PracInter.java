package Interfac;


public class PracInter 
{
    public static void main(String[] args) 
    {
        Ab o=new Ab();
        o.check();
        o.check2();
        o.check3();
        A.check4();
        System.out.println("*****************");
        

        C c=new C()
        {
            public void inner()
            {
                System.out.println("inner class implementatin");
            }

            public void inner2()
            {
                System.out.println("inner2 class implementatin");
            }
        };
        c.inner();
        c.inner2();

        System.out.println("*****************");

        Lambda le= (a ,b)->System.out.println("lamba ex "+a+" "+b );
        le.verify(10,20);

        System.out.println("*****************");

        Outer b=new Outer();
      //  System.out.println(b.age);
        Outer.Inner i=b.new Inner();
        i.innerMeth();

        Outer.Inner2 m=new Outer.Inner2();
        m.innerMethStatic();

    
    }
}

class  Outer
{
    int age;

    static class  Inner2
    {
       void innerMethStatic()
        {
            System.out.println("static inner class meth");
        }
    }
    
    class Inner
    {
        void innerMeth()
        {
            System.out.println("inner class meth");
        }
    }
    

    
}

interface Lambda
{
    void verify(int a,int b);
}

interface C
{
    void inner();
    void inner2();

   
}

interface A
{
    int a=10; //public static final
    void check(); //public abstract method
    
    static void check4()
    {
        System.out.println("check4 static method implemented");
    }


}

interface B
{
    void check2();

    default void check3()
    {
        System.out.println("check3 implemented default method");
    }



    
}

 class Ab implements A,B
{
 
    public void check()
    {
        System.out.println("check in Ab class");
        
        System.out.println(a);
    }

    public void check2()
    {
        System.out.println("check2 in Ab class");
        
    }
  
}
