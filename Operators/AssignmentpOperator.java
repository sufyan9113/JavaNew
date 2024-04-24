package Operators;
public class AssignmentpOperator 
{
    public static void main(String[] args) 
    {
        int a,b,c,d;
        a=b=c=d=10; //chain assignment

        System.out.println(a+" "+b+" "+c+" "+d);

        int e=0; int f=5;

        e+=5; //compoud assignment // e=e+5;
        System.out.println(e);

        f-=3;
        System.out.println(f);
    }   
}
