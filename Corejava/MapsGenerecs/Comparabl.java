package MapsGenerecs;
import java.util.*;

public class Comparabl 
{
    public static void main(String[] args) 
    {
        Employ e1=new Employ("satish", 12, 113);
        Employ e2=new Employ("rohit", 15, 116);
        Employ e3=new Employ("kunal", 11, 118);

        ArrayList<Employ> a=new ArrayList();

        a.add(e1);
        a.add(e2);
        a.add(e3);
        System.out.println(a);

        Collections.sort(a);
        
        System.out.println(a);


    }
}

class Employ implements Comparable<Employ>
{
    String name;
    int age;
    int id;

    public Employ(String name,int age,int id)
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public int compareTo(Employ e)
    {
        if(this.age>e.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    public String toString()
    {
        return name+" "+age+" "+id;
    }

   

   
}
