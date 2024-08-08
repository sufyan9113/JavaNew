package DSA.DivideNConquer;

public class MergeSort 
{
    public static void main(String[] args) 
    {
        int[]a={50,20,40,90,88,11,13};
        int n=a.length;
        print(a);
        mergeSort(a,0,n-1);
        print(a);
    }
    public static void mergeSort(int[]a,int i,int j)
    {
        int mid=(i+j)/2;
        if(i<j)
        {
            mergeSort(a, i, mid);
            mergeSort(a, mid+1, j);
            mergerSelection(a,mid,i,j);
        }

        
    }
    public static void mergerSelection(int[]a,int mid,int l,int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;
        int[]ls=new int[n1];
        int[]rs=new int[n2];

        int i,k,j;
        for(i=0; i<n1; i++)
        {
            ls[i]=a[l+i];
        }
        for(j=0; j<n2; j++)
        {
            rs[j]=a[mid+1+j];
        }

        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2)
        {
            if(ls[i]<=rs[j])
            {
                a[k]=ls[i];
                i++;
               
            }
            else
            {
                a[k]=rs[j];
                j++;
                
            }
            k++;
        }

        while(i<n1)
        {
            a[k]=ls[i];
            i++;
            k++;
        }

        while(j<n2)
        {
            a[k]=rs[j];
            j++;
            k++;
        }
        
        print(a);

    }
    public static void print(int[]a)
    {
        for(int e:a)
        {
            System.out.print(e+" ");
        }
        System.out.println();
    }

    
}
