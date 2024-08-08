package DSA.DivideNConquer;

public class PeakElem 
{
    public static void main(String[] args) 
    {
        int[]a={6,3,4,5,8,9};
        int n=a.length;
        int ans=find(a,0,n-1,n);
        System.out.println(ans);
    }
    public static int find(int[]a,int l,int h,int n)
    {
        int m=l+(h-l)/2;

        if((m==n-1 ||a[m]>a[m+1])&&(m==0|| a[m]>a[m-1])) return m;
        else if(m<h && a[m+1]>a[m]) return find(a,m+1,h,n);
        else return find(a, l, m-1, n);
    }
}
