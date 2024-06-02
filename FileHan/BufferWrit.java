package FileHan;
import java.io.*;
public class BufferWrit 
{
    public static void main(String[] args) throws IOException
    {
        File dr=new File("fd");
        File f=new File(dr,"file2.txt");
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter br=new BufferedWriter(fw);

        br.write(123);
        br.newLine();
        br.write('a');
        br.newLine();
        br.write("buffer");
        br.newLine();
        br.flush();
        br.close();
        
    }
}
