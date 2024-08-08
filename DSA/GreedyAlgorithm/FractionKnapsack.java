package DSA.GreedyAlgorithm;
import java.util.*;

public class FractionKnapsack 
{
    public static void main(String[] args) 
    {
       Obj[]a= {
                new Obj(25, 5),
                new Obj(75, 10),
                new Obj(100, 12),
                new Obj(50, 4),
                new Obj(45, 7),
                new Obj(90, 9),
                new Obj(30, 3)
                };

                int capacity=37;
                double maximumProfit=ans(a,capacity);
                System.out.println(maximumProfit);
               
    }

    public static double ans(Obj[]a,int capacity)
    {
            sortPW(a);

            double currCapacity=capacity;
            double totalProfit=0;

            for(Obj e:a)
            {
                if(currCapacity>e.wt)
                {
                    currCapacity-=e.wt;
                    totalProfit+=e.profit;
                    
                }
                else
                {
                    
                    double fraction=(currCapacity/e.wt);
                    currCapacity-=fraction*e.wt;
                    totalProfit+=fraction*e.profit;
    
                    break;
                }
                
            }
            return totalProfit;
    }
    public static void sortPW(Obj[]a)
    {
     /*   Comparator c=new Comparator<Obj>()
        {
        public int compare(Obj a,Obj b)
        {
        double d1=a.profit/a.wt;
        double d2=b.profit/b.wt;
        if(d1<d2) return 1;
        else return -1;
        }
        };
       */ 
      Comparator<Obj>c =(d,b)->
      {
      double d1=d.profit/d.wt;
      double d2=b.profit/b.wt;
      if(d1<d2) return 1;
      else return -1;
      };
    

       // Arrays.sort(a,c);
/* 
       Arrays.sort(a,(d,b)->
      {
      double d1=d.profit/d.wt;
      double d2=b.profit/b.wt;
      if(d1<d2) return 1;
      else return -1;
      });
      */
    //  Arrays.sort(a);

    Arrays.sort(a,(d,b)->(b.profit/b.wt)-(d.profit/d.wt));
    System.out.println(Arrays.toString(a));
    
       
    }
}
class Comp implements Comparator<Obj>
{
    public int compare(Obj a,Obj b)
    {
        double d1=a.profit/a.wt;
        double d2=b.profit/b.wt;
        if(d1<d2) return 1;
        else return -1;
    }
}
class Obj implements Comparable<Obj>
{
    int profit;
    int wt;

    public Obj(int profit,int wt)
    {
        this.profit=profit;
        this.wt=wt;
    }

    public int compareTo(Obj e)
    {
        double d1=e.profit/e.wt;
        double d2=this.profit/this.wt;

        if(d1>d2) return 1;
        else return -1;
    }
    public String toString()
    {
        return profit+ " "+wt;
    }
}
