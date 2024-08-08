package DSA.DivideNConquer;

public class QuickSort 
{
    public static void main(String[] args) 
    {
        int[]a={50,10,40,60,10,15,25,8,27,63};
        int n=a.length;
        print(a);
        quickSort(a,0,n-1);
        print(a);
    }
    public static void quickSort(int[]a,int i,int j)
    {
        if(i<j)
        {
            int m=partition(a,i,j);
            quickSort(a, i, m-1);
            quickSort(a,m+1,j);
        }
    }
    public static int partition(int[]a,int l,int h)
    {
        // random index
        /* 
            int randomInd= l+(int)Math.random()%(h-l+1);
            int tem=a[randomInd];
            a[randomInd]=a[l];
            a[l]=tem;
         */
        
        int i,j,pivot;
        i=l;
        pivot=a[l];

        for(j=l+1; j<=h;j++)
        {
            if(a[j]<=pivot)
            {
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[l];
        a[l]=a[i];
        a[i]=temp;

        return i;
    }
    public static void print(int[]a)
    {
        for(int e: a)
        {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
