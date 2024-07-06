package FileHan;

import java.io.*;

class Stu implements Serializable

{
    transient private int age;
    private String name;
    private int num;

    public Stu(int age,String name,int num)
    {
        this.age=age;
        this.name=name;
        this.num=num;
    }

    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(num);
    }

    

    

}

public class Serial 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
       // Stu s=new Stu(10, "virat", 50);

        File f1=new File("fd");
        File f2=new File(f1,"file4.txt");
        /* 
        FileOutputStream fos=new FileOutputStream(f2);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);

        oos.writeObject(s);

        oos.close();
*/
        
 
        FileInputStream fis=new FileInputStream(f2);
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
        
        Stu s=(Stu)ois.readObject();

        ois.close();
        
        s.disp();


        







        



        


    }
}
