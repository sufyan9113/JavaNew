package DSA.SDArray;

public class MissingNum 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,6,4,5};
        int sum=0;
        int n=a.length;
        int totalSum=(n+1)*(n+2)/2;

        for(int i:a)
        {
            sum+=i;
        }
       
        System.out.println("missing num: "+(totalSum-sum));
    }
}
