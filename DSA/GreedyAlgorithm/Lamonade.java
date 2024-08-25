package DSA.GreedyAlgorithm;

import java.util.Arrays;

class Lamonade
{
    public static void main(String[] args) 
    {
        boolean ans=findResult(new int[]{5,5,10,10,20});
        
        System.out.println(ans);
        ans=findResult(new int[]{5,5,5,5,10,20,10});
        System.out.println(ans);
        
    }
    public static boolean findResult(int[]a)
    {
        
        int five=0; int ten=0; int twenty=0;

        for(int e:a)
        {
            if(e==5)
            {
                five++;
            }
            else if(e==10)
            {
                if(five==0)
                {
                    return false;
                }
                else
                {
                    five--;
                    ten++;
                }
            }
            else
            {
                if(five>0 && ten>0)
                {
                    five--;
                    ten--;
                    twenty++;
                }
                else if(five>=3)
                {
                    five-=3;
                    twenty++;
                }
                else return false;
            }
        }
        return true;

    }
}