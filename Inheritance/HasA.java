package Inheritance;
class HasA 
{
    public static void main(String[] args) 
    {
        TallyNum t=new TallyNum();
        Employee e=new Employee(t);
       // e.setT(t);
          e.call();
    }     
}

class Employee
{
    private TallyNum t;
    
    public Employee(TallyNum t)
    {
        this.t=t;
    }

    public void setT(TallyNum t)
    {
        this.t=t;
    }
    
    void call()
    {
        t.inUnch();
    }


}

class TallyNum
{
    void inUnch()
    {
        System.out.println("in unch");
    }
}
