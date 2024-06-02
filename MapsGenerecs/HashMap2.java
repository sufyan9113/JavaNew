package MapsGenerecs;
import java.util.*;
import java.util.Map.*;
public class HashMap2 
{
    public static void main(String[] args) 
    {
        Student s1=new Student("s1",15);
        Student s2=new Student("s2",20);
        HashMap h=new HashMap();

        h.put(1, s1);
        h.put(2, s2);

        System.out.println(h);

        Set s=h.entrySet();

        Iterator i=s.iterator();

        while(i.hasNext())
        {
            Map.Entry e=(Entry) i.next();
            System.out.println(e.getKey()+" "+e.getValue());

        }
    }
}

class Student
{
    private String name;
    private int age;

    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        return name+" "+age;
    }
}

