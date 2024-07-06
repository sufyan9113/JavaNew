package DSA.SearchSortBitMan;

import java.util.Scanner;

public class BinarySearch 
{
    public static void main(String[] args) 
    {
        int[]a={10,11,20,21,30,35};
        int x=input();
        int ind=binSearch(x, a);
        System.out.println("element "+x+" is at index: "+ind);
    }
    public static int input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter num to be find");
        int x=s.nextInt();
        return x;
    }
    public static  int binSearch(int x,int[]a)
    {
        int n=a.length;
        int low=0;
        int high=n-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(a[mid]==x)
            {
                return mid;
            }
            else if(a[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
            
        }
        return -1;
       
        
        
    }
    
}
