package String;
public class Strings 
{
    public static void main(String[] args) 
    {
        String s=new String("sufyan");
        System.out.println(s);
        s=s.concat(" shaikh");// String class is immutable not change 
        System.out.println(s);

        String s1="check";
        System.out.println(s1);

        String s2="124@()sagaASH";
        System.out.println(s2);

        char[]c={'a','b','c'};
        String s5=new String(c);
        System.out.println(s5);

        StringBuffer s3=new StringBuffer("bgabda");
        System.out.println(s3);
        s3.append(" fbabf"); // mutable String
        System.out.println(s3);

        StringBuilder s4=new StringBuilder("gndg");
        System.out.println(s4);
        s4.append(" ngabs"); // mutable String
        System.out.println(s4);

    
        
    }
}
