package DSA.Recursion;



class Multiplier
{
    public static void main(String[] args) 
    {
        int n=4;
        int k=5;

        multiPrint(n, k);


    }
    public static void multiPrint(int n, int k)
    {
        if(k==1)
        {
            System.out.print(n+" ");
            return;
        }
        else
        {
            multiPrint(n, k-1);
            System.out.print((n*k)+" ");
        }
        

        
       
        
        
    }
}

