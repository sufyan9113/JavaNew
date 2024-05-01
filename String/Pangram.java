
class Pangram
{
    public static void main(String[] args) 
    {
        int flag=0;
        String s= "the quick brown fox jumps over lazy dog";
        s=s.replace(" ", "");

       // s.toLowerCase(); //if required

       char[]c=s.toCharArray();

       int[]a=new int[26];          //a[c[i]-97]

       for(int i=0; i<c.length; i++)
       {
            a[c[i]-97]++;
       }

        for(int i=0; i<a.length;i++)
       {
            if(a[i]==0)
            {
                flag=1;
                break;
            }
       }
            if(flag==1)
            {
            System.out.println(" not pangram");
            }
            else{
                System.out.println(" pangram");  
             }
            
            

        

    }
}