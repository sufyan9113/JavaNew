package DSA.Recursion;
import java.util.*;
public class Power 
{
    public static void main(String[] args) 
    {
        
            Scanner s=new Scanner(System.in);
            System.out.println("enter value of a");
            int a=s.nextInt();
            System.out.println("enter value of b");
            int b=s.nextInt();
    
            long r=getPower(a,b);
            System.out.println("power of a^b ="+r);
    }
        public static long getPower(int a,int b)
        {
            long ans,finalAns=0;

            if(b<=1)
            {
                return a;
            }
           
            else
            {
             ans=getPower(a,b/2);
            }
            
            finalAns=ans*ans;

            if(b%2==0)
            {
                return finalAns;
            }
            else
            {
                return a*finalAns;
            }
            

            
        }
    
}
