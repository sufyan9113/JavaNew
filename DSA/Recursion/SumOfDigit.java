package DSA.Recursion;

public class SumOfDigit 
{
    public static void main(String[] args) 
    {
        int num=1234;
        int sum=sumDigit(num);
        System.out.println(sum);
    }

    public static int sumDigit(int n)
    {
        
        if(n==0)
        {
            return 0;
        }
       
        return n%10+sumDigit(n/10);
        
    }


}
