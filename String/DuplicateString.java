public class DuplicateString 
{
    public static void main(String[] args) 
    {
        String s="abcdcaa";

        System.out.println(s);
        String s1="";

        for(int i=0; i<s.length();i++)
        {   
            boolean flag=false;
            for(int j=i+1; j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    System.out.println(s.charAt(i));
                    flag=true;
                    break;
                }
            }

            if(flag==false)
            {
                s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1);
        
    }
}
