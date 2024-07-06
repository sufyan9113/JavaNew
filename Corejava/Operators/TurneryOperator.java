package Operators;
public class TurneryOperator 
{
    public static void main(String[] args) 
    {
        int age=19;
        
       String s= age>18? "adult":"teenage"; 
       System.out.println(s);

       int a=3; int b=2; int c=1;

       int result= a<b? (a<c?a:c):(b<c?b:c);
       System.out.println(result);

       if(a<b)
       {
            if(a<c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
       }
       else
       {
            if(b<c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
       }


    }
}
