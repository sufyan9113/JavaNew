package DSA.GreedyAlgorithm;

public class MinSwap 
{
    public static void main(String[] args) 
    {
        String s="][][";
        int ans=countSwap(s);
        System.out.println(ans);
    }
    public static int countSwap(String s)
    {
        char[]ch=s.toCharArray();
        int countL=0; int countR=0; int imbalance=0; int swap=0;

        for(char c:ch)
        {
            if(c=='[')
            {
                countL++;
                if(imbalance>0)
                {
                    swap+=imbalance;
                    imbalance--;
                }
            }
            else if(c==']')
            {
                countR++;
                imbalance=countR-countL;
            }
        }
        return swap;
    }
}

