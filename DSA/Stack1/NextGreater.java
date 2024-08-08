package DSA.Stack1;

import java.util.*;
class NextGreater
{
    public static void main(String[] args) 
    {
        int[]a={1,5,3,2,1,6,3,4};

        Stack<Integer>s=new Stack<>();

        int n=a.length;
        int[]res=new int[n];
        s.push(0);
        for(int i=1; i<n;i++)
        {
            while(!s.empty() && a[i]>a[s.peek()])
            {
                res[s.pop()]=i;
            }
            s.push(i);
        }

        while(!s.empty())
        {
            res[s.pop()]=n;
        }

        System.out.println(Arrays.toString(res));
    }
}