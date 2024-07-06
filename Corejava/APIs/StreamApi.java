package APIs;
import java.util.*;




public class StreamApi 
{
    public static void main(String[] args) 
    {
        List<Integer> a=Arrays.asList(8,6,1,3,7,2,10);

         Ab ab=new Ab();
         Bc bc=new Bc();
        Stream<Integer> s1=a.stream();
        Stream<Integer>s2=s1.filter(ab);
        Stream<Integer>s3=s2.map(bc);
        Stream<Integer>s4=s3.sorted();

        s4.forEach(i->System.out.println(i));
        

    }
}
class Bc implements Function<Integer,Integer>
{
    public Integer apply(Integer i)
    {
        return i*2;
    }
}

class Ab implements Predicate<Integer>
{
    public boolean test(Integer i)
    {
        if (i%2==0)
        return true;
        else
        return false;
        
    }
}

