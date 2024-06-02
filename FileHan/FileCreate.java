package FileHan;
import java.io.*;

class FileCreate
{
    public static void main(String[] args) throws IOException
    {
        
        File f1=new File("file1.txt");
        System.out.println(f1.exists());
        f1.createNewFile();
        System.out.println(f1.exists());

        File f2=new File("fd");
        System.out.println(f2.isDirectory());
        f2.mkdir();

        File  f3=new File(f2, "file2.txt");
        System.out.println(f3.isFile());
        f3.createNewFile();
        System.out.println(f3.isFile());

        String[]s=f2.list();

        for ( String t : s) 
        {
            System.out.println(t);
        }

        
    }
}