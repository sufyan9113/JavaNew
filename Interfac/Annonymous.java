package Interfac;



public class Annonymous
{
    public static void main(String[] args)
    {
        Cd c=new Cd()
        {
            public void disp()
            {
                System.out.println("in display mehtod annonymous class");
            }
            public void show()
            {
                System.out.println("in show mehtod annonymous class");
            }
        };
        c.disp();
        c.show();
        
    }

}

interface Cd
{
    void disp();
    void show();
}


