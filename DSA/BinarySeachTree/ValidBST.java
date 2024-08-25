package DSA.BinarySeachTree;

public class ValidBST 
{
    public static void main(String[] args) 
    {
        Node root=createTree();

        System.out.println("is BST: "+isValid(root, Long.MIN_VALUE, Long.MAX_VALUE));

    }
    public static boolean isValid(Node root,long min,long max)
    {
       
        if(root==null) return true;

        if(root.data<=min || root.data >=max) return false;

        return isValid(root.left, min, root.data) && isValid(root.right, root.data, max);
        
    }
    public static Node createTree()
    {
        Node root=new Node(20);
        Node a=new Node(15);
        Node b=new Node(30);
        Node c=new Node(12);
        Node d=new Node(19);
        Node e=new Node(28);
        Node f=new Node(40);
        Node g=new Node(16);
        Node h=new Node(25);
        
        root.left=a; root.right=b;
        a.left=c; a.right=d;
        b.left=e; b.right=f;
        d.left=g;
        e.left=h;



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
