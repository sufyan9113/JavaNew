package DSA.BinarySeachTree;
import java.util.*;
class KthSmallestElement
{
    static int count=0;
    static int ans=0;
    public static void main(String[] args) 
    {
        Node root=creteTree();
        int k=3;
        ArrayList<Integer>al=new ArrayList();
        find1(root, k);
        System.out.println(k+" smallest in tree by method1: "+ans);
        find2(root, k, al);
        System.out.println(k+" smallest in tree by method2: "+al.get(k-1));
        
    }
    public static void find1(Node root,int k) //by only traversal
    {
        if(root==null) return;

        find1(root.left, k);
        count++;
        if(count==k)
        {
            ans=root.data;
            return;
        }
        find1(root.right, k);
    }
    public static void find2(Node root,int k,ArrayList<Integer>al) // arraylist
    {
        if(root==null) return;

        find2(root.left, k,al);
        al.add(root.data);
        find2(root.right, k,al);

    }
    public static Node creteTree()
    {
        Node root=new Node(30);
        Node a=new Node(20);
        Node b=new Node(35);
        Node d=new Node(15);
        Node e =new Node(25);
        Node f=new Node(33);
        Node g=new Node(40);

        root.left=a; root.right=b;

        a.left=d; a.right=e;

        b.left=f; b.right=g;

        return root;
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
