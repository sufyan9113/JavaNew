public class HeightTree 
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
        Node h=new Node(9);
        
        root.left=a;
        root.right=d;

        a.left=b;
        a.right=c;

        d.left=e;
        d.right=f;

        e.left=g;
        e.right=h;

        System.out.println("height of tree: "+height(root));
    }
    public static int height(Node root)
    {
        if(root==null) return 0;

        return 1+ Math.max(height(root.left),height(root.right));
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
