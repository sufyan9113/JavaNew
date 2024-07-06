package DSA.SearchSortBitMan;

import java.util.Arrays;

public class Selection 
{
    public static void main(String[] args) 
    {
        int[]a={5,10,1,8,14,2,25,3};
        selectionSort(a);
       
    }
    public static void selectionSort(int[]a)
    {
        int n=a.length;
        for(int i=0; i<n;i++)
        {
            int min=i;
            for(int j=i+1; j<n; j++)
            {
                if(a[min]>a[j])
                {
                min=j;
                }
            }
            if(min!=i)
            {
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
            disp(a);
            
        }
    } 
    public static void disp(int[]a)
    {
        System.out.println(Arrays.toString(a));
    }
}
