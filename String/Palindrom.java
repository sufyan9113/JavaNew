public class Palindrom 
{
    
    public static void main(String[] args) 
    {

        String s="madam";

        String s1="";

        for(int i=s.length()-1; i>=0; i--)
        {
            s1=s1+s.charAt(i);
        }
        if(s1.equals(s))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not Palindrom");
        }
       

        /* 
        String s="2661";
        int flag=0;
        for(int i=0; i<s.length()/2; i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {   
                flag=1;
                break;
            }
        }

        if(flag==1)
        {
            System.out.println("Not Palindrom");
        }
        else
        {
            System.out.println("Palindrom");
        }
        */


    }    
}
