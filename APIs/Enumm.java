package APIs;

public class Enumm 
{
    enum Day
    {
        MON,TUE,WED,THU,FRI,SAT,SUN;
        
    }

    
    public static void main(String[] args) 
    {
        Day d=Day.MON;
        int ind=d.ordinal();
        System.out.println(d);
        System.out.println(ind);

        Day d2=Day.TUE;
        System.out.println(d2);
        System.out.println(d2.ordinal());

        

        Day[] ar=Day.values();
        for(Day a:ar)
        {
            System.out.println(a+" "+a.ordinal());
        }
    
    }
}
