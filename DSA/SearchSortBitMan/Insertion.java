package DSA.SearchSortBitMan;

import java.util.Arrays;

public class Insertion 
{
    public static void main(String[] args)
    {
        int[]a={8,15,6,9,1,4,25,18};
        insertSort(a);
    


    }
    public static void insertSort(int[]a)
    {
        int n=a.length;

        for(int i=1; i<n;i++)
        {
            int j=i;
            while(j>0&& a[j]<a[j-1])
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
            disp(a);
            
        }
    }
    public static void disp(int[]a)
    {
        System.out.println(Arrays.toString(a));
    }
}
