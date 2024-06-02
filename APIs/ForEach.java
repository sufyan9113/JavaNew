package APIs;
import java.util.*;
import java.util.function.Consumer;

public class ForEach 
{
    public static void main(String[] args) 
    {
        List<Integer>a=new ArrayList<>();
        /* 
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        */

        a=Arrays.asList(10,20,30,40);

        Iterator it=a.iterator();

        System.out.println("iterator output");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

/* 
        Consumer<Integer> c=new Consumer<>()
        {
            public void accept(Integer i)
            {
                System.out.println(i);
            }
        };
*/
        System.out.println("for each output");
        a.forEach(i->System.out.println(i));
        /* 
        a.forEach(new Consumer<>()
        {
            public void accept(Integer i)
            {
                System.out.println(i);
            }
        }
        );
        */

        /* 
        for(Integer i:a)
        {
            System.out.println(i);
        }
        */

    }
}

/* 
class Check implements Consumer<Integer>
{
    public void accept(Integer i)
    {
        System.out.println(i);
    }
}
*/