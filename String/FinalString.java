public class FinalString 
{
    public static void main(String[] args) 
    {

        StringBuffer q=new StringBuffer("xy");
        q.append("z");
        System.out.println(q);
        q=new StringBuffer("mno");
        System.out.println(q);


        final StringBuffer s;
        s=new StringBuffer("abc");
        s.append("def");
        System.out.println(s);

       s=new StringBuffer("ghi");// after final keyword change in object is allowed but reference variable cannot be changed 
        System.out.println(s);
    }
}
