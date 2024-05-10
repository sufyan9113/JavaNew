package AccessModifier.Pac1;
import AccessModifier.Pac2.*;


public class Java1 extends Java4
{
     protected int age1=8;
    
    public static void main(String[] args) 
    {
        
/* 
         Java1 j1=new Java1();
        System.out.println(j1.age1); //same class

        Java2 j2=new Java2();
        System.out.println(j2.age2); //outside class same package

        Java3 j3=new Java3();
        System.out.println(j3.age3); //subclass outside package
 
        Java4 j4=new Java4();
        System.out.println(j4.age4); //non-subclass outside package
*/
        Java4 j=new Java4();
        System.out.println(j.age4);
        j.disp();



    }
}

