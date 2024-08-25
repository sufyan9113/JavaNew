
public class TreeImplement1
{
    public static void main(String[] args) 
    {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.right=e;
        System.out.println("leaf count: "+leaf(root));
        System.out.println("size of tree: "+size(root));
        disp(root);
        
    }
    public static int size(Node root)
    {
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static void disp(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+"-> ");
        if(root.left!=null)System.out.print(root.left.data+" ");
        if(root.right!=null)System.out.print(root.right.data);
        System.out.println();

        disp(root.left);
        disp(root.right);

    }
    
    public static int leaf(Node root)
    {
        if(root==null) return 0;
        else if(root.left==null && root.right==null) return 1;
        return leaf(root.left)+leaf(root.right);
        
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
