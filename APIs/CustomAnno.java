package APIs;

import java.lang.annotation.*;


@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
    int age() default 18;
    String name();
}

class CustomAnno
{
    public static void main(String[] args) 
    {
        Player p=new Player();

        Class a=p.getClass();
        Annotation b=a.getAnnotation(CricketPlayer.class);
        CricketPlayer c=(CricketPlayer)b;
        int age=c.age();
        String name=c.name();

        System.out.println(age+" "+name);
    }
}

@CricketPlayer(name = "rohit")
class Player
{
    @CricketPlayer(name = "virat")
    private int age;
    private String name;

    @CricketPlayer(name = "rahul")
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}