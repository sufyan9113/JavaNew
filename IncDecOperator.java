public class IncDecOperator 
{
    public static void main(String[] args) 
    {
        int a=5;
        int b;

     // a   6-   7  -    8       9   8       7
     //b    5    7       8       8   8       8   
        b= a++ + ++a + ++a + a++ + --a + a--;

        System.out.println(a);
        System.out.println(b);

        

       
    }
}
