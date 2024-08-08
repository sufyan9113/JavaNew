package DSA.DivideNConquer;

public class SearchRotatSort 
{
    public static void main(String[] args) 
    {
      int[]a={5,6,7,8,9,10,1,2,3};
      int n=a.length;
      for(int i=0; i<n; i++)
      {
        int x=a[i];
        int pivot=findPivot(a, 0, n-1);
        //System.out.println(pivot);
        int ans=findElement(a, pivot, x,0,n-1);
        System.out.println("element: "+x+" index: "+ans+" ");
        
      }
      
    }
    public static int findPivot(int[]a,int l,int h)
    {
      int m=(l+h)/2;
      if(h<l) return -1;
      
      if(m<h && a[m]>a[m+1]) return m;
      if(m>l && a[m-1]>a[m]) return m-1;
      else
      {
        if(a[l]>=a[m]) return findPivot(a, l, m-1);
        else return findPivot(a, m+1, h);
      }
    }
    public static int findElement(int[]a,int pivot,int x,int l,int h)
    {
      if(pivot==-1) return binary(a, 0,h, x);

      if(a[pivot]==x) return pivot;

      if(x>=a[l]) return binary(a, l, pivot-1, x);

      else return binary(a, pivot+1, h, x);

    }
    public static int binary(int[]a,int l,int h,int x)
    {
      int mid=(l+h)/2;
       if(l>h) return -1;

       else if(a[mid]==x) return  mid;

       else if(a[mid]>x) return binary(a, l, mid-1, x);

       else return binary(a, mid+1, h, x);
    }

  }

