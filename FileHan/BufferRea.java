package FileHan;
import java.io.*;
public class BufferRea
{
    public static void main(String[] args) throws IOException
    {
        File dr=new File("fd");
        File f=new File(dr,"file2.txt");
        FileReader fw=new FileReader(f);
        BufferedReader br=new BufferedReader(fw);

       String s= br.readLine();

       while(s!=null)
       {
        System.out.println(s);
        s= br.readLine();

       }
       
    }
}
