package Encapsulation;

class Student
{
    private int age;
    private String name;

  
    public void setAge(int age)
    {
        this.age=age;
    }

    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
   
    public String getName()
    {
        return name;
    }
    /* 
    void input(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    void disp()
    {
        System.out.println(age);
        System.out.println(name);
    }
*/
}

public class Encap  
{
    
    public static void main(String[] args) 
    {
        Student s1=new Student();
        Student s2=new Student();
        
        s1.setAge(18);
        s1.setName("abcd");

        s2.setAge(20);
        s2.setName("mno");


        int stud1Age=s1.getAge();
        String stud1Name=s1.getName();

        int stud2Age=s2.getAge();
        String stud2Name=s2.getName();

        System.out.println("student 1: Name: "+stud1Name+ " Age: "+stud1Age);
        System.out.println("student 2: Name: "+stud2Name+ " Age: "+stud2Age);
    }
}
