package DSA.SDArray;

public class Palindrom2 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3,4,3,2,1};
        int n=a.length;
        boolean flag=false;

        for(int i=0;i<n/2;i++)
        {
            if(a[i]!=a[n-1-i])
            {
                System.out.println("not palindrom");
                flag=true;
                break;
            }
            
            
        }

        if(flag==false)
        {
            System.out.println("palindrom");
        }
        
    }
}
