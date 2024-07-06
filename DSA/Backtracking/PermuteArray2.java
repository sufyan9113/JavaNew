package DSA.Backtracking;
import java.util.*;
public class PermuteArray2 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3};
        ArrayList<Integer>ds=new ArrayList<>();
        List<ArrayList<Integer>>ans=new ArrayList<>();
        boolean[] isValid=new boolean[a.length];

        find(a,ds,ans,isValid);

        System.out.println(ans);
    }

    public static void find(int[]a,ArrayList<Integer>ds,List<ArrayList<Integer>>ans,boolean[] isValid)
    {
        if(ds.size()==a.length)
        {
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0; i<ds.size(); i++)
            {
                al.add(ds.get(i));
            }

            ans.add(al);
            return;
        }

        for(int i=0; i<a.length; i++)
        {
            if(isValid[i]==false)
            {
                ds.add(a[i]);
                isValid[i]=true;
                find(a, ds, ans, isValid);
                isValid[i]=false;
                ds.remove(ds.size()-1);
            }
        }

        

    }
}
