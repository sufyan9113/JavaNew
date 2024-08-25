
public class LowestCommonAncestor
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
        Node g=new Node(8);
        
        root.left=a;
        root.right=b;

        b.left=c;
        b.right=d;

        c.left=g;

        d.left=e;
        d.right=f;
        

        Node res=findLCA(root, a, g);

        System.out.println(res.data+" ");

    }
    public static Node findLCA(Node root,Node p,Node q)
    {
        if(root==null) return null;

        if(root==p || root ==q) return root;

        Node left=findLCA(root.left, p, q);
        Node right=findLCA(root.right, p, q);

        if(left!=null && right!=null) return root;

        if(left!=null) return left;

        else return right;
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
