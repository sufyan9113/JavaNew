public class PracReve 
{
    
    public static void main(String[] args) 
    
    {
            String s="pwskill java";
            String r="";

                String[] s1=s.split(" ");

                for(int i=s1.length-1 ;i>=0; i--)
                {
                    r=r+s1[i]+" ";
                }
                System.out.println(r);
            /* 
            for(int i=s.length()-1; i>=0; i--)
            {
                r=r+s.charAt(i);
            }
            System.out.println(r);
            */

      /*     String[] s1=s.split(" ");

           for(String r1: s1)
           {
                for(int i=r1.length()-1; i>=0; i--)
                {
                    r=r+r1.charAt(i);
                }
                r=r+" ";
           }
           System.out.println(r);
           */
    }
}
