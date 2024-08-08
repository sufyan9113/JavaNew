
public class MaxMin 
{
    public static void main(String[] args) 
    {

        int[]a={50,45,11,9,15,75,89,97};
        int n=a.length;
        Pair minmax=getMinMax(a, 0, n-1);
        System.out.println("min: "+minmax.min+" max: "+minmax.max);
        
    
    }
    public static Pair getMinMax(int[]a,int i,int j )
    {
        Pair minmax=new Pair();
        Pair leftMinMax=new Pair();
        Pair rightMinMax=new Pair();

        if(i==j)
        {
            minmax.min=a[i];
            minmax.max=a[i];
            return minmax;
        }

        else if(i==j-1)
        {
            if(a[i]<a[j])
            {
                minmax.min=a[i];
                minmax.max=a[j];
            }
            else
            {
                minmax.min=a[j];
                minmax.max=a[i];
            }
            return minmax;
        }
        else
        {
            int mid=(i+j)/2;

            leftMinMax=getMinMax(a, i, mid);
            rightMinMax=getMinMax(a,mid+1,j);

            if(leftMinMax.min<rightMinMax.min)
            {
                minmax.min=leftMinMax.min;
            }
            else
            {
                minmax.min=rightMinMax.min;
            }

            if(leftMinMax.max>rightMinMax.max)
            {
                minmax.max=leftMinMax.max;
            }
            else
            {
                minmax.max=rightMinMax.max;
            }
            

        }
        return minmax;
    }
}

class Pair
{
    int max;
    int min;
}


      
       
   

