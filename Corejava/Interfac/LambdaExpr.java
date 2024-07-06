package Interfac;

 class LambdaExpr 
{

    public static void main(String[] args) 
    {
        L o=(a,b) -> System.out.println("run implements");
        o.runLamb(10,20);

    }
    
}

interface L
{
    void runLamb(int a,int b);
}
