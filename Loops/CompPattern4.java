package Loops;


public class CompPattern4
{

public static void main(String[] args) 
{
    
    int row=4; int col=7;

    for(int i=0; i<row; i++)
    {
        for(int j=0; j<=col ; j++)
        {
            if(j>=row-i && j<=row+i)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }


    
}
}




