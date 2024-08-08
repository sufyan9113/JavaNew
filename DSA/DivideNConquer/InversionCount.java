package DSA.DivideNConquer;

public class InversionCount 
{
    public static void main(String[] args) 
    {
        int[]a={1,5,2,8,3,4};
        int n=a.length;

        int count1=inversionBrutForce(a,n);
        System.out.println("brutforce count: "+count1);

        int count2=inversionOptim(a,0,n-1);
        System.out.println("optimize count: "+count2);

    }

    public static int inversionBrutForce(int[]a,int n)
    {
        int count=0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[i]>a[j])
                count++;
            }
        }
        return count;
    }
    public static int inversionOptim(int[]a,int i,int j )
    {
        int count=0;

        if(i<j)
        {
            int mid=(i+j)/2;
            count+=inversionOptim(a, i, mid);
            count+=inversionOptim(a, mid+1, j);

            count+=mergeProcedure(a,i,mid,j);
            
        }
        return count;
    }
    public static int mergeProcedure(int[]a,int l,int mid,int h)
    {
        int swap=0;
        int n1=mid-l+1;
        int n2=h-mid;
        int[]la=new int[n1];
        int[]ra=new int[n2];

        int i,j,k;

        for(i=0; i<n1; i++)
        {
            la[i]=a[l+i];
        }
        for(j=0; j<n2; j++)
        {
            ra[j]=a[mid+1+j];
        }

        i=0; j=0; k=l;
        while(i<n1 && j<n2)
        {
            if(la[i]<=ra[j])
            {
                a[k++]=la[i++];
            }
            else
            {
                a[k++]=ra[j++];
                swap+=(mid+1)-(l+i);
            }
        }

        while(i<n1)
        {
            a[k++]=la[i++];
        }
        while(j<n2)
        {
            a[k++]=ra[j++];
        }
        return swap;
    }
}
