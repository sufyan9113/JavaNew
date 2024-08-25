

class MajorityEle
{
    public static void main(String[] args) 
    {
        int[]a={2,2,1,1,1,1,2,2,2};
        int res=maxEle(a);
        System.out.println(res);
    }
    public static int maxEle(int[]a)
    {
        int majE=a[0]; int majCount=1;

        for(int i=1; i<a.length; i++)
        {
            if(a[i]==majE)
            {
                majCount++;
            }
            else
            {
                majCount--;

                if(majCount==0)
                {
                    majE=a[i];
                    majCount=1;
                }
            }
        }
        return majE;
    }
}