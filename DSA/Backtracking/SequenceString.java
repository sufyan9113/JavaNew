package DSA.Backtracking;
import java.util.*;
public class SequenceString 
{
    public static void main(String[] args) 
    {
        int[]a={1,2};
        printSequence(a,0,new ArrayList<Integer>());
        System.out.println();
    }
    public static void printSequence(int[]a,int ind, ArrayList<Integer>temp)
    {
        if(ind==a.length)
        {
            if(temp.size()>0)
            {
                System.out.print(temp+" ");
            }
            return;
        }

        printSequence(a, ind+1, temp);
        temp.add(a[ind]);

        printSequence(a, ind+1, temp);
        temp.remove(temp.size()-1);

    }

}
