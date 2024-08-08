import java.util.*;
class JobScheduling
{
    public static void main(String[] args) 
    {
       ArrayList<Job> a=new ArrayList<>();
       a.add(new Job(1,5,55));
       a.add(new Job(2,2,65));
       a.add(new Job(3,7,75));
       a.add(new Job(4,3,60));
       a.add(new Job(5,2,70));
       a.add(new Job(6,1,50));
       a.add(new Job(7,4,85));
       a.add(new Job(8,5,68));
       a.add(new Job(9,3,45));

       //Collections.sort(a,(c,d)->d.profit-c.profit);
       
       find(a, 7);
       
    }
    public static void find(ArrayList<Job>ar,int maxDeadline)
    {
        sortProfit(ar, 0, ar.size()-1);
        System.out.println(ar);

        boolean[]flag=new boolean[maxDeadline];
        int[]ans=new int[maxDeadline];

        for(int i=0; i<ans.length;i++)
        {
            for(int j=Math.min(maxDeadline-1, ar.get(i).deadline-1); j>=0; j--)
            {
                if(flag[j]==false)
                {
                    flag[j]=true;
                    ans[j]=ar.get(i).id;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ans));


    }

    public static void sortProfit(ArrayList<Job>ar,int l,int h)
    {
        if(l<h)
        {
            int m=partition(ar,l,h);

            sortProfit(ar, l, m-1);
            sortProfit(ar, m+1, h);
        }
    }
    public static int partition(ArrayList<Job>ar,int l,int h)
    {
        int i=l;
        int pivot=ar.get(l).profit;
        int j;

        for(j=l+1; j<=h;j++)
        {
            int ele=ar.get(j).profit;
            if(ele>=pivot)
            {
                i++;
                Job temp=ar.get(i);
                ar.set(i, ar.get(j));
                ar.set(j, temp);
            }
        }

        Job temp=ar.get(l);
        ar.set(l, ar.get(i));
        ar.set(i, temp);
        return i;
    }
}

class Job
{
    int id;
    int deadline;
    int profit;

    Job(int id,int deadline,int profit)
    {
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }

    public String toString()
    {
        return id+" "+deadline+" "+profit;
    }
}


