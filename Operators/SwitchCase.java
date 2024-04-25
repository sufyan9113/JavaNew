package Operators;

public class SwitchCase 
{
    public static void main(String[] args) 
    {
        int day=6;
        String dayString="";
        String dayType="";

        switch(day)
        {
        case 1:dayString="Monday";  
        break;

        case 2:dayString="tuesday"; 
        break;

        case 3:dayString="Wednesday";
        break; 

        case 4:dayString="Thursday"; 
        break;

        case 5:dayString="Friday"; 
        break;

        case 6:dayString="Saturday"; 
        break;

        case 7:dayString="Sunday"; 
        break;
        default: dayString="invalid day";
        }
    switch(day)
    {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        dayType="Weekday";
        break;

        case 6:
        case 7:
        dayType="Weekend";
        break;

        default: dayType="invalid dayType";
        
    }

        System.out.println(dayString+" is a "+dayType);
        
}

}
