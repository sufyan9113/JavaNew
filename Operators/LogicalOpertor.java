package Operators;
public class LogicalOpertor 

{
    public static void main(String[] args) 
    {
                    // logical operator  && and or || not !

              
            int a=5;
            int b=6;

            boolean check=a>b && a==b;
            System.out.println(check);

            boolean check2=a>=b && a==b;
            System.out.println(check2);

            boolean check3=a>b || a==b;
            System.out.println(check3);

            boolean check4=a>b || a<b;
            System.out.println(check4);

            boolean check5= a!=b;
            System.out.println(check5);
    }
}
