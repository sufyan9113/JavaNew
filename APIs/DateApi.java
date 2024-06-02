package APIs;
import java.util.Date;
import java.sql.*;
import java.time.*;
public class DateApi 
{
   
    public static void main(String[] args) 
    {
        Date d=new Date();
        System.out.println(d);
        long e=d.getTime();

        java.sql.Date dt=new java.sql.Date(e);
        System.out.println(dt);



       LocalDate f=LocalDate.now();
       System.out.println(f);

       int day=f.getDayOfMonth();
       int month=f.getMonthValue();
       int year=f.getYear();

       System.out.println(day+"/"+month+"/"+year);

       LocalTime t=LocalTime.now();
       System.out.println(t);

       int hour=t.getHour();
       int mint=t.getMinute();
       int sec=t.getSecond();
       int nanSec=t.getNano();
       System.out.println(hour+":"+mint+":"+sec+":"+nanSec);

     

        
        
    }
}
