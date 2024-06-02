package APIs;

public class EnumSwitch 
{
    enum Direction
    {
        EAST,WEST,NORTH,SOUTH;
    }
    public static void main(String[] args) 
    {
        Direction d=Direction.SOUTH;

        switch(d)
        {
            case EAST: System.out.println("east");
            break;

            case WEST: System.out.println("west");
            break;

            case NORTH: System.out.println("north");
            break;

            case SOUTH: System.out.println("south");
            break;

            default : System.out.println("wrong direction");
        }
    }
}
