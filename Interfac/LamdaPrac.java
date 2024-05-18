package Interfac;


class LamdaPrac
{
    public static void main(String[] args) 
    {
        I a=(x,y)-> x+y; //{return x+y;};
        int r=a.sum(10, 15);
        System.out.println(r);

        I b= new I()
        {
            public int sum(int a,int b)
    {
        return a+b;
    }
        };
        System.out.println(b.sum(5, 15));
    }
}

interface I
{
    int sum(int a,int b);
    
}
/* 
class B implements I
{
    public int sum(int a,int b)
    {
        return a+b;
    }
}
*/
