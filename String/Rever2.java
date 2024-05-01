public class Rever2 
{
    public static void main(String[] args) 
    {
        String s1="pwskill java";
        String s2="";

        String[] s=s1.split(" ");

        for(int i=s.length-1; i>=0; i--)
        {
            s2=s2+s[i]+" ";
        }
        System.out.println(s2);
    }
}
