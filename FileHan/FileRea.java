package FileHan;
import java.io.*;


public class FileRea 
{
    public static void main(String[] args) throws IOException
    {
        File dr=new File("fd");
        File f1=new File(dr, "file1.txt");

        FileReader fr=new FileReader(f1);
/* 
        int i=fr.read();

        while(i!=-1)
        {
            System.out.print(i+":");
            System.out.println((char)i);
            i=fr.read();

        }
*/
        char[]c=new char[(int)f1.length()];

        fr.read(c);

        for(char ch:c)
        {
            System.out.print(ch);
        }
        System.out.println();


    }
}
