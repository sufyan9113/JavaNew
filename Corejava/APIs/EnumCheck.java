package APIs;
public class EnumCheck 
{
    enum Direction
    {
        EAST,WEST,NORTH,SOUTH;
        private int count;
        Direction()
        {
            System.out.println("in constructor");
        }

        public void setCount(int count)
        {
            this.count=count;
        }

        public int getCount()
        {
            return count;
        }

    }
    public static void main(String[] args) 
    {
        Direction d=Direction.EAST;
        System.out.println(d.ordinal());
        System.out.println(d);

        Direction[] e=d.values();

        for(Direction f:e)
        {
            System.out.println(f+" "+ f.ordinal());
        }

        d.setCount(1);
        System.out.println(d.getCount());

        System.out.println(Direction.WEST.getCount());
    }
}
