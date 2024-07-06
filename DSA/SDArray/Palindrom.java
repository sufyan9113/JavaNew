package DSA.SDArray;

public class Palindrom 
{
    public static void main(String[] args) 
    {
        int[] a={1,2,5,2,1};
        int[] b=new int[a.length];
        boolean flag=false;
        

        for(int i=a.length-1; i>=0;i--)
        {   
            b[i]=a[a.length-1-i];
        }
        for(int i=0; i<a.length;i++)
        {   
            if(a[i]!=b[i])
            {
                flag=true;
                break;
            }
        }

        if(flag==true)
        {
            System.out.println("not palindrom");
        }
        else
        {
            System.out.println("palindrom");
        }
    }   
}