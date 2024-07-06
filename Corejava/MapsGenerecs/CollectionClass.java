package MapsGenerecs;
import java.util.*;
public class CollectionClass 
{
   
    public static void main(String[] args) 
    {
        ArrayList a=new ArrayList();

        a.add(10);
        a.add(25);
        a.add(5);
        a.add(15);
        a.add(30);
        System.out.println(a);

        Collections.sort(a);
        System.out.println(a);
        System.out.println(Collections.binarySearch(a, 15));

        Collections.reverse(a);

        System.out.println(a);

        Collections.shuffle(a);
        System.out.println(a);
        
        System.out.println(Collections.frequency(a, 15));

        

    }

}
