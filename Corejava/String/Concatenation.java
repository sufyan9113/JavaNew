public class Concatenation 
{
    public static void main(String[] args) 
    {
        String s1="abc";
        String s2="def";
        
        String s3=s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4=new String("ghi");
        String s5=s3.concat(s4);
        System.out.println(s4);
        System.out.println(s5);

        String m=new String("vxy");
        m=m+("z");
        System.out.println(m);


        String n="mln";
        n=n+("op");
        System.out.println(n);


    }
}
