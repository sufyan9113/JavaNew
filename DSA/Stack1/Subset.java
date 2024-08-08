package DSA.Stack1;
import java.util.*;

public class Subset 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3};
        List<Integer>ds=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        print(a,ds,ans,0);
        System.out.println(ans);

    }

    public static void print(int[]a,List<Integer>ds,List<List<Integer>>ans,int ind)
    {
        ans.add(new ArrayList(ds));
    
        for(int i=ind; i<a.length;i++)
        {
            ds.add(a[i]);
            print(a, ds, ans,i+1);
            ds.remove(ds.size()-1);
           
        }
        
        
        
    }
    
}
