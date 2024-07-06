package Interfac;



class implementInter
{
    public static void main(String[] args) 
    {
        C obj=new C();
      //  A obj=new C(); interface refence type only method in A interface can be called

        obj.disp();
        obj.show();
    }   
}

class C implements A,B // class can implements multiple interface for this each method is to be implemented
{
    public void disp()
    {
        System.out.println("in disp interface a");
    }
    public void show()
    {
        System.out.println("in show interface b");
    }
}

interface A
{
    public A() // cannot write constructor in interface
    {
        System.out.println("constructor");
    }
    void disp();
}

interface B
{
    void show();
}