package MapsGenerecs;
import java.util.*;

public class WeakHasMap1 
{
    public static void main(String[] args) 
    {
        Student1 s=new Student1("student-1", 15);
        Student1 s2=new Student1("student-2", 25);
        HashMap h=new HashMap();
        WeakHashMap h1=new WeakHashMap();

        h1.put(s2, 2);
        h.put(s, 1);
        
        System.out.println(h);
        System.out.println(h1);

        s=null;
        s2=null;
      

       System.gc();
       System.out.println(h);
       System.out.println(h1);

       System.out.println("last line");




    }
}

class Student1
{
    private String name;
    private int age;

    public Student1(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public String toString()
    {
        return name+ " "+age;
    }

   
    public void finalize()  
    {
       
        System.out.println("garbage collection done");
    }
}
