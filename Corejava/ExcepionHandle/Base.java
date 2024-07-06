package ExcepionHandle;

 class Base 
{
    public static void main(String[] args) 
    {
        Check ch=new Check();
        ch.excep();
       
       
        
    }
}

 class Check
{
    int a=10;
    int b=0;
    int c;

    void excep() 
    {
        
        try
        {
            c=a/b; //critical statement
            System.out.println("in try block"); //only execute if exception not occurs
        } 
        catch(Exception e)
        {
            System.out.println("error: "+e);
        }
        System.out.println(c);
        System.out.println("check");
        
        

    }
}

