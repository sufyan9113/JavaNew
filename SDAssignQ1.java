public class SDAssignQ1 
{
public static void main(String[] args) 
{
    int[] a={3,20,4,6,9}; // input 1
    int[]b={4,3,6,7,1}; // input 2

    evenSum(a); //function call
    evenSum(b); //function call
    
    
}
    public static void evenSum (int[]a)
    {
        int n=a.length; // size of array
        int sum=a[0]; //to store sum of element in even  
        for(int i=2; i<n; i*=2)
    {
        
        sum+=a[i];
        
    }
    System.out.println("output: "+sum);
    }
}
