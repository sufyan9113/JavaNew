package DSA.SearchSortBitMan;

import java.util.Scanner;

public class LowerBound 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array elements");
        int e=s.nextInt();
        int[]a=new int[e];
        System.out.println("enter array elements values");
        for(int i=0; i<e; i++)
        {
            a[i]=s.nextInt();
        }

        int x=input();
        int ind=lowSearch(x, a);
        System.out.println("element "+x+ " found at index: "+ind);

    }
    public static int input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter element to search");
        int x=s.nextInt();
        return x;
    }
    public static int lowSearch(int x,int[]a)
    {
        int n=a.length;
        int low=0; int high=n-1;
        int result=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(a[mid]==x)
            {
                result=mid;
                high=mid-1;
            }
            else if(a[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

           

        }
        return result;
    }
}
