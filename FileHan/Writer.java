package FileHan;
import java.io.*;

public class Writer 

{
    public static void main(String[] args) throws IOException
    {
        File f1=new File("fd");
        File f2=new File(f1,"file3.txt");
        FileWriter fw=new FileWriter(f2,true);
        PrintWriter p=new PrintWriter(fw);

        p.print(100);
        p.println("write");
        p.println(true);
        p.println(10.8);
        p.println('c');

        p.close();
        

        
    }
}
