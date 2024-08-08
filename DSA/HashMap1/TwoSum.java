package DSA.HashMap1;
import java.util.*;
class TwoSum
{
    public static void main(String[] args) 
    {
        int[]a={2,7,11,15};
        int target=9;
        int[] res=new int[2];
        int n=a.length;

        HashMap<Integer,Integer> h=new HashMap();


        for(int i=0; i<n; i++)
        {
            h.put(a[i], i);
        }
        int flag=0;
        for(int i=0; i<n;i++)
        {
            if(a[i]==target && h.containsKey(0))
            {
                res[0]=i;
                res[1]=h.get(0);
                flag=1;
                break;
            }
            else if(h.containsKey(target-a[i])&&h.get(target-a[i])>i)
            {
                res[0]=i;
                res[1]=h.get(target-a[i]);
                flag=1;
                break;
            }
        }
             if(flag==0)
            {
                res[0]=-1;
                res[1]=-1;
            }

        System.out.println("["+res[0]+" , "+res[1]+"]");
    }   
}