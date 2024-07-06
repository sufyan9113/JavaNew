package APIs;

public class Enumm2 
{
    enum Day
    {
        MON("check"),TUE,WED,THU,FRI,SAT,SUN;
        int num;

        // public static final Day MON=new Day();
        // public static final Day TUE=new Day();

        Day(String name)
        {
            System.out.println("in day cons");
        }

        void setNum(int num)
        {
            this.num=num;
        }

        int getNum()
        {
            return num;
        }
    }
    public static void main(String[] args) 
    {
        Day d=Day.MON;

        Day.MON.setNum(10);
        System.out.println(Day.MON.getNum());

        System.out.println(Day.TUE.getNum());

        Day.WED.setNum(20);
        System.out.println(Day.WED.getNum());



    }    
}
