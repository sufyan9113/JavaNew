package DSA.GreedyAlgorithm;

import java.util.Arrays;

public class MaxPower 
{
    public static void main(String[] args) 
    {
        int[]tokens={200,100};
        int power=150;
        int maxScore=findMaxScore(tokens,power);
        System.out.println(maxScore);
    }
    public static int findMaxScore(int[]a,int power)
    {
        Arrays.sort(a);
        int score=0; int maxScore=0;
        int l=0; int r=a.length-1;

        while(l<=r)
        {
            if(power>=a[l])
            {
                power-=a[l];
                score++;
                maxScore=Math.max(maxScore, score);
                l++;
            }
            else if(score>=1)
            {
                score--;
                power+=a[r];
                r--;
            }
            else break;
        }
        return maxScore;
    }
}
