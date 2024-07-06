public class Revers3 
{
    public static void main(String[] args) 
    {
        String s1= "pwskill java";
        String s2="";

        String[] s=s1.split(" ");

   /*      for(int i=0; i<s.length;i++)

        {
            for(int j=s[i].length()-1; j>=0; j--)
            {
                s2=s2+s[i].charAt(j);
            }
           s2=s2+" ";
        }
        System.out.println(s2);
*/          
        for(String ele:s)
        {
            for(int i=ele.length()-1; i>=0; i--)
            {
                s2=s2+ele.charAt(i);
            }
                s2=s2+" ";
        }

        System.out.println(s2);




    
    }
}
