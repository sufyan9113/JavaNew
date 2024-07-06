package Arrays;
import java.util.Scanner;

class Arr
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int[][]a=new int[3][];

        for(int i=0; i<a.length; i++)
        {
            System.out.println("enter student count of class "+i+1+" :");
            a[i]=new int[s.nextInt()];

        }

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.println("enter student marks");
                a[i][j]=s.nextInt();
            }

        }

     /*   Scanner s=new Scanner(System.in);
        System.out.println("enter no of class");
        int classNo =s.nextInt();
        System.out.println("enter no of students");
        int studNo=s.nextInt();
        int[][]stud=new int[classNo][studNo];

        for(int i=0; i<stud.length; i++)
        {
            for(int j=0; j<stud[i].length; j++)
            {
                System.out.println("enter student marks");
                stud[i][j]=s.nextInt();
            }

        }
*/
        for(int[]b:a)
        {
            for(int c:b)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }    
}