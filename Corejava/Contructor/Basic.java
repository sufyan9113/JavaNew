package Contructor;



class Basic
{
    public static void main(String[] args) 
    {
        Chec d=new Chec();
        Chec e=new Chec(5,"abc");
        System.out.println(e.getName()+ " "+e.getAge());
        System.out.println("main method");
        
    }
}

class Chec
{
    private int age;
    private String name;

    Chec()
    {
        System.out.println("default constructor with no parameter");
    }
    
    

    Chec(int age, String name)
    {
        this.age=age;
        this.name=name;
        System.out.println("constructor call parameter");
    }
    

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
   
 
   
    
}