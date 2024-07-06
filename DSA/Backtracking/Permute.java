package DSA.Backtracking;

public class Permute 
{
    public static void main(String[] args) 
    {
        String s="ABC";
        permut(s, 0, s.length()-1);
    }

    public static void permut(String s,int l,int r)
    {
      //  System.out.println("call of head"+l);
        if(l==r)
        {
            System.out.println(s);
        }
        else
        {
            for(int i=l; i<=r; i++)
            {
                //System.out.println("call of loop "+l);
                s=swap(s,l,i);
               // System.out.println("swap "+s);
                permut(s, l+1, r);
                s=swap(s,l,i);
              //  System.out.println("reswap "+s);
            }
        }
    }

    public static String swap(String s,int i,int j)
    {
        char[] c=s.toCharArray();

        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;

        return String.valueOf(c);
    }
    
}
