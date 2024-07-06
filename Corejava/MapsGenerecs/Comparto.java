package MapsGenerecs;

import java.util.*;
public class Comparto 
{
    public static void main(String[] args) 
    {
        Learner s1=new Learner("jay", 18, 45);
        Learner s2=new Learner("rahul", 15, 30);
        Learner s3=new Learner("rohan", 17, 40);
        Learner s4=new Learner("suresh", 19, 35);
        
        ArrayList<Learner> a=new ArrayList();

        Comparator<Learner> s=( b, c)->
        {

                if(b.age>c.age) //a.marks>b.marks
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            
        };
            
        

        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        System.out.println(a);

        Collections.sort(a,s);
        System.out.println(a);
    }
}
/* 
class Sort implements Comparator<Learner>
{
    public int compare(Learner a,Learner b)
    {
        if(a.age>b.age) //a.marks>b.marks
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
*/
class Learner
{
    String name;
    int age;
    int marks;

    public Learner(String name,int age,int marks)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
    }

    public String toString()
    {
        return "name:"+name+" age:"+age+" marks:"+marks;
    }

}
