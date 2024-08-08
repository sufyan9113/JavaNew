package DSA.HashMap1;
import java.security.KeyStore.Entry;
import java.util.*;

import MapsGenerecs.HasMap1;
public class Create 
{
    public static void main(String[] args) 
    {
        Student s1=new Student(10, "rahul");
        Student s2=new Student(15, "rohit");
        HashMap<Student,Integer> h1=new HashMap<Student,Integer>();
        h1.put(s1, 1);
        h1.put(s2, 2);
        System.out.println(h1);

        HashMap h=new HashMap<>();

        h.put(1, "abc");
        h.put(2,'c');
        h.put(3, true);
        h.put(4, 12);
        h.put(5, 96.1);
        h.remove(4);

        System.out.println(h);

        System.out.println(h.containsKey(5));
        System.out.println(h.containsValue(false));

        Set s=h.entrySet();
        Iterator i=s.iterator();
        
        

        while(i.hasNext())
        {
            Map.Entry e=(Map.Entry) i.next();
            System.out.println(e.getKey()+" "+e.getValue());

        }
    }
}

class Student 
{
    int age;
    String name;
    Student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString()
    {
        return age+" "+name;
    }
}
