

class ReverseString
{
    public static void main(String[] args) 
    {
        String s="pwskill";
        String r="";

        for(int i=s.length()-1; i>=0; i--)
        {
            r=r+s.charAt(i);
        }
        System.out.println(r);
        /* 
        char[]c=s.toCharArray();

        for(int i=0; i<c.length/2; i++)
        {
           char temp=c[i];
           c[i]=c[c.length-i-1];
           c[c.length-i-1]=temp;
        }

        
        System.out.println(c);

        for(char m:c)
        {
            r=r+m;
        }
        System.out.println(r);
        */
       
        
    }
}