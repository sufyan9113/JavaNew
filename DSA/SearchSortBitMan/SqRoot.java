package DSA.SearchSortBitMan;

import java.util.Arrays;
import java.util.Scanner;

public class SqRoot 
{
    public static void main(String[] args) 
    {
        System.out.println("enter num");
        Scanner s=new Scanner(System.in);
        int e=s.nextInt();
        int result=searchSqRoot(e);
        System.out.println("sq root of "+e+": "+result);

        
    }

    public static int searchSqRoot(int x)
    {
        int result=0;
        int low=0;
        int high=x;
        
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if(val==x)
            {
                return mid;
            }
            else if(val<x)
            {
                result=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return result;
    }
}
