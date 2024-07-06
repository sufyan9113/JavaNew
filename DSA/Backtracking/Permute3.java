package DSA.Backtracking;
import java.util.*;

class Permute3
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3};
        printP(a,new ArrayList<Integer>());
    }

    public static void printP(int[]a,ArrayList<Integer>al)
    {
        if(al.size()==a.length)
        {
            System.out.println(al);
            return;
        }

        for(int i=0; i<a.length; i++)
        {
            if(al.contains(a[i])) continue;
            al.add(a[i]);
            printP(a, al);
            al.remove(al.size()-1);
        }


    }
}