package APIs;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class StreamApi2 
{
    public static void main(String[] args) 
    {
        List<Integer> al=Arrays.asList(3,2,1,5,8,4,9,12);

        Predicate<Integer>p=new Predicate<>()
        {
            public boolean test(Integer i)
            {
                if(i%2==0)
                return true;
                else 
                return false;
            }
        };

        Function<Integer,Integer> f=new Function<Integer,Integer>()
        {
            public Integer apply(Integer i)
            {
                return i*2;
            }
        };

       // Stream<Integer>s1=al.stream().sorted().filter(i->i%2==0).map(i->i*5);

       Stream<Integer>s1=al.stream().filter(p).sorted().map(f);
        s1.forEach(n->System.out.println(n));

      
        


    }
}
