package DSA.GreedyAlgorithm;

import java.util.*;

class MergeInterval
{
    public static void main(String[] args) 
    {
        int[][]inter={{1,3},{15,18},{2,6},{8,10}};
        Arrays.sort(inter,(a,b)->a[0]-b[0]);
        System.out.println(Arrays.deepToString(inter));

        LinkedList<int[]>a=new LinkedList<>();

        for(int[]e:inter)
        {
            if(a.isEmpty() || a.getLast()[1]<e[0]) //if not overlap
            {
                a.add(e);
                System.out.println("in non overlap");
            }
            else
            {
               
                a.getLast()[1]=Math.max(a.getLast()[1], e[1]);
               
                System.out.println("in overlap");
                
            }
        }
        int[][]ans1= a.toArray(new int[a.size()][]);


        for(int[]e:a)
        {
           
            System.out.println(Arrays.toString(e));
        }

   


    }
}

class Imple implements Comparator<int[]>
{
    public int compare(int[]a,int[]b)
    {
        if(a[0]>b[0])
        {
            return 1;
        }
        else
        {
            return-1;
        }
    }
}
