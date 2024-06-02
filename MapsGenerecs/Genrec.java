package MapsGenerecs;
import java.util.*;
public class Genrec 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> a=new ArrayList<Integer>(); //types safety

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
       // a.add("sufyan");
        
        Iterator i=a.iterator();

        while(i.hasNext())
        {
            Integer i1=(Integer)i.next();
            System.out.println(i1);
        }
        Student s=new Student(10);
        Employee e=new Employee(10);
        ArrayList<Student> a1=new ArrayList<Student>();

        a1.add(s);
       // a1.add(e);
        System.out.println(a1);

}
}

class Student
{
    private int age;


    public Student(int age)
    {
        this.age=age;
    }
}
class Employee
{
    private int age;


    public Employee(int age)
    {
        this.age=age;
    }
}
