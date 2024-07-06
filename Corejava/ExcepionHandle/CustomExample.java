package ExcepionHandle;

import java.util.Scanner;

public class CustomExample 
{
    public static void main(String[] args) 
    {
        Verify v=new Verify();
        v.accountVerify();
    }

}

class Verify
{
    void accountVerify()
    {
        Login a=new Login();
        a.input();

        try
        {
            a.check();
        }
        catch(MyExcep e1)
        {
            try
            {
                System.out.println("incorrect id/ password");
                System.out.println("try again");
                a.input();
                a.check();
            }
            catch(MyExcep e2)
            {
                try
                {
                    System.out.println("incorrect id/ password");
                    System.out.println("try again");
                    a.input();
                    a.check();
                }
                    catch(MyExcep e3)
                    {

                    System.out.println("incorrect id/password account locked");
    
                    }
            
        }
        
    }
    
}
}

class MyExcep extends Exception
{

}

class Login
{
    Scanner s=new Scanner(System.in);
    int userId=904588;
    String password="sufyan113";
    int inputUserId;
    String inputPassword;

    void input()
    {
        System.out.println("enter user id");
        inputUserId=s.nextInt();
        System.out.println("enter password");
        inputPassword=s.next();
    }
    void check() throws MyExcep
    {
        if(userId==inputUserId && password.equals(inputPassword))
        {
            System.out.println("welcome to your account");
        }
        else
        {
            MyExcep e=new MyExcep();
            throw e; 
            //System.out.println("incorrect id/password");
        }
    }

}
