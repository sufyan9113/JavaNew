public class MethodString 
{
    public static void main(String[] args) 
    {
        StringBuffer s=new StringBuffer("abc"); // if String value passed 16+String size
        System.out.println(s.capacity()); //inbuilt capacity if constructor is blank 
        System.out.println(s.length());

        StringBuffer u=new StringBuffer();
        System.out.println(u.capacity());
        u.append("abcdefghijklmnop");
        System.out.println(u.capacity());
        u.append("abcdefghijklmnopqr");
        System.out.println(u.capacity());
        u.trimToSize();
        System.out.println(u.capacity());

    
        StringBuilder t=new StringBuilder(100);
        System.out.println(t.capacity());

        t.append("javaabcdef");
        System.out.println(t.capacity());
        t.trimToSize();
        System.out.println(t.capacity());

        System.out.println(t.charAt(5));
        t.setCharAt(5, 'B');
        System.out.println(t);

        System.out.println(t.reverse());
            

    }
}
