package Collections;
import java.util.*;
public class TreeSet1 
{
    public static void main(String[] args) 
    {
        TreeSet s=new TreeSet();

        s.add(5);
        s.add(98);
        s.add(50);
        s.add(10);
        s.add(100);
        s.add(25);
        s.add(100); // duplicated not allowed
        s.add(60);
    //    s.add("check");// only homogenious data

        System.out.println(s);

        System.out.println(s.higher(60));// gives value higher to the parameter
        System.out.println(s.lower(60));  //  gives value lower to the parameter
        System.out.println(s.floor(60));    //if value available than return object same
        System.out.println(s.ceiling(60)); //if not available than given higher and lower value

        System.out.println(s.floor(67));    
        System.out.println(s.ceiling(95));
    }
}
