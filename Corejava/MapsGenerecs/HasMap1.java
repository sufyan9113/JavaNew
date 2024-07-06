package MapsGenerecs;
import  java.util.*;

public class HasMap1 
{
    public static void main(String[] args) 
    {
        Student s1=new Student("s1", 15, "ahmedabad");
        Student s2=new Student("s2", 10 , "bangluru");
        Student s3=new Student("s3", 20, "mumbai");

        HashMap h=new HashMap();

        h.put(1, s1);
        h.put(2, s2);
        h.put(3, s3);

        System.out.println(h);

       Set s= h.entrySet();

       Iterator i=s.iterator();

       while(i.hasNext())
       {
            //System.out.println(i.next());
            Map.Entry e= (Map.Entry) i.next();
            System.out.println(e.getKey()+" "+e.getValue());
       }

        

    }
}

class Student
{
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city)
    {
        this.name=name;
        this.age=age;
        this.city=city; 
    }

    public String getName()
    {
            return name;
    }
    public int getAge()
    {
            return age;
    }
    public String getCity()
    {
            return city;
    }

    public String toString()
    {
            return name+ " "+age+" "+city;
    }


}
