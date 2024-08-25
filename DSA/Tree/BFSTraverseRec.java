import java.util.*;
class BFSTraverseRec
{
    public static void main(String[] args) 
    {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(7);

        root.left=a;
        root.right=b;

        a.left=c;

        b.left=d;

        d.left=e;
        d.right=f;
        List<List<Integer>>ans=new ArrayList();
        print(root,ans);
        System.out.println(ans);

    }

    public static void print(Node root,List<List<Integer>>ans)
    {
        int level=1;
        List<Integer>al=new ArrayList<>();
        while(levelOrder(root, level,al))
        {
            ans.add(al);
            level++;
        }
    }
    public static boolean levelOrder(Node root,int level,List<Integer>al)
    {
        if(root==null) return false;
        if(level==1)
        {
            al.add(root.data);
            System.out.println(root.data+" ");
            return true;
        }
        boolean left=levelOrder(root.left, level-1,al);
        boolean right=levelOrder(root.right, level-1,al);
        
        return (left||right);

    }
}
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data=data;
    }
}