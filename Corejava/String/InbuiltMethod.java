public class InbuiltMethod 

{
    public static void main(String[] args) 
    {
        String s1="check123";

        System.out.println(s1.length()); //size of String
        System.out.println(s1.substring(1,7));
        System.out.println(s1.charAt(7));
        char[]c=s1.toCharArray();
        System.out.println(s1.toUpperCase());

        for(char ch:c)
        {
            System.out.print(ch);
        }
        System.out.println();
        
    }
}
