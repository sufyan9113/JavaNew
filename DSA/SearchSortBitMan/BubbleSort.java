package DSA.SearchSortBitMan;

import java.util.Arrays;

public class BubbleSort 
{
    
    public static void main(String[]args)
    {
        int[]a={10,15,1,2,8,25,3,9};
        bubbleSort1(a);

    }
    public static void disp(int[]a)
    {
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort1(int[]a)
    {
        int n=a.length;

        for(int i=0; i<n; i++)
        {
            boolean flag=false;
            for(int j=0; j<n-i-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
               
            }
                disp(a);
                if(flag==false)
                {
                    break;
                }
            
        }
    }

}