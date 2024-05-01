package Arrays;

class Arrys
{
    public static void main(String[] args) 
    {
        int a[]; // inta[]=new int[4]; array are object it creates in heap area by using new keyword
        a=new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        int b[]=  {10,20,30};

        for(int i=0; i<=2;i++)
        {
            System.out.println(b[i]);
        }

        String name[]={ "hj","dbf","bfb"};

        for(int i=0; i<=2;i++)
        {
            System.out.println(name[i]);
        }

        String[] s;
        s=new String[6];
    }
}

