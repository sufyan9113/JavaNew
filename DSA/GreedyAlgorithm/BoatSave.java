package DSA.GreedyAlgorithm;

import java.util.Arrays;

public class BoatSave 
{
    public static void main(String[] args) 
    {
        int res=minBoat(new int[]{3,5,3,4},5);
        System.out.println(res);

        res=minBoat(new int[]{3,2,2,1},3);
        System.out.println(res);
    }
    public static int minBoat(int[]a,int limit)
    {
        Arrays.sort(a);
        int count=0;

        int l=0; int r=a.length-1;

        while(l<=r)
        {
            if(a[l]+a[r]<=limit)
            {
                l++;
                r--;
                
            }
            else
            {
                r--;
            }
            count++;
        }
        return count;
    }
}
