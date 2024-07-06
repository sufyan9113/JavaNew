package DSA.SearchSortBitMan;
import java.util.*;
public class LinearSearch 
{
    public static void main(String[] args) 
    {
        int[]a={3,4,8,9,1,2,5};
        int x=input();
        int ind=search(x,a);
        System.out.println("elment "+x+" at index: "+ind);
        
    }
    public static int input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num to be found");
        int x=s.nextInt();
        return x;
    }
    public static int search(int x,int[]a)
    {
        int n=a.length;
        for(int i=0; i<n;i++)
        {
            if(a[i]==x)
            {
                return i;

            }
        }
        return -1;
    }
}
