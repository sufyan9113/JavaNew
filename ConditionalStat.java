import javax.lang.model.util.ElementScanner6;

public class ConditionalStat 
{
    public static void main(String[] args) 
    {
      /*  if (condition) 
            {  only one block executed at a time
                          when condition is false than else block executed
            }
        else if(condition) 
        {
                when first block not executed control reach at next else if block
                when all else if not executed else block executed
        }                                           
            
        } else {
            
       }
       */
        int a=16;
       if(a%2==0)
       {
        System.out.println(a+ " number is even");
       }
       else 
       {
        System.out.println(a+ " number is odd");
       }

       int age=65;

       if(age>=18 && age<=60)
       {
        if(age>=20 && age<30)
        {
            System.out.println("you are in 20's");
        }
        else if(age>=30 && age<40)
        {
            System.out.println("you are in 30's");
        }
        else if(age>=40 && age<50)
        {
            System.out.println("you are in 40's");
        }
        else
        {
            System.out.println("you are in 50's");
        }
       }
       else if(age>60)
       {
        System.out.println("you are old");
       }
       else if(age>=16 && age<20)
       {
        System.out.println("you are in teen age");
       }

       else
       { 
        System.out.println("you are kid");
       }


    }
}
