public class StringMemory 
{
    public static void main(String[] args) 
    {
        String s1="abc";        // object created in scp in heap
        String s2="def";
        String s5="def";

        String s3= new String("def"); // object created in heap
        String s4= new String("def");

        boolean check=s1==s2;
        System.out.println(check);

        boolean check1=s3==s4;
        System.out.println(check1);

        boolean check4=s2==s5;
        System.out.println(check4);

        boolean check3=s2==s3;
        System.out.println(check3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s2.equals(s5));

        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s3));
        


    }
}
