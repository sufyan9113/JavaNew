package Interfac;

interface Ab
{
  //  int a; vairable are public static final by default;
      int a=10;

    //  void disp()
    //  {   method are public abstract by default only body no implementation 
        //
     // }

      void disp();

}

public class Basic
{

    public static void main(String[] args) 
    {
     // Ab a=new Ab(); // cannot instantiate inteface (object cannot be made) referece object can be created

      System.out.println(Ab.a);
      //Ab.a=15; // as variable is public static final it can be accessed by interface but cannot be changed

       
    }

}