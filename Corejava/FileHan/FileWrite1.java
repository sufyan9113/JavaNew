package FileHan;
import java.io.*;


class FileWrite1
{
    public static void main(String[] args) throws IOException
    {
        File f=new File("fd");
        System.out.println(f.isDirectory());
        File f2=new File(f,"file1.txt");
        FileWriter fw=new FileWriter(f2,true);  

        fw.write("line1"); //
        fw.write("\n");
        fw.write("line2");
        fw.write("\n");
        fw.write(68); //ascii 
        fw.write("\n");
        fw.write(65); 
        fw.write("\n");
        fw.write(105);
        fw.write("\n");

        char[] c={'w','r','i','t','e'};
        fw.write(c);
       // fw.close();
       fw.flush();

        System.out.println("open  file");

        
    }
}