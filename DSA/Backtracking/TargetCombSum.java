package DSA.Backtracking;
import java.util.*;
public class TargetCombSum 
{
   public static void main(String[] args) 
   {
        int[]a={2,3,6,7};
        int target=7;
        List<List<Integer>>ans=combinationSum(a, target);
        System.out.println(ans);
   }

   public  static List<List<Integer>> combinationSum(int[]a,int target)
   {
        List<List<Integer>>ans=new ArrayList();
        helper(a, target,ans,new ArrayList<Integer>(),0);
        return ans;
   }
   public static void helper(int[]a,int target,List<List<Integer>>ans,List<Integer>al,int ind)
   {
        if(target==0)
        {
            ans.add(new ArrayList<>(al));
            return;
        }

        else if(target<0)
        {
            return;
        }

        for(int i=ind; i<a.length; i++)
        {
            al.add(a[i]);
            helper(a, target-a[i], ans, al, i);
            al.remove(al.size()-1);
        }

   }


}

