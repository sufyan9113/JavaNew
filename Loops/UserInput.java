package Loops;
import java.util.*;

public class UserInput 
{
    public static void main(String[] args) 
    {
        int a; String str; double d; char c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter int");
        a=s.nextInt();
        System.out.println(a);

        System.out.println("enter String");
        str=s.next();
        System.out.println(str);

        System.out.println("enter double");
        d=s.nextDouble();
        System.out.println(d);

        System.out.println("enter char");
        c=s.next().charAt(0);
        System.out.println(c);

    }
}
