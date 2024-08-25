

public class TreeImplement 
{
    static int count;
    public static void main(String[] args) 
    {
        Node root=new Node(2);
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(6);
        Node d=new Node(5);
        Node e=new Node(11);

        root.left=a;
        root.right=b;

        a.left=c;
        a.right=d;

        b.right=e;

        disp(root);

        sizeOfTree(root);

        System.out.println(sizeOfTree(root));

    }
    public static int sizeOfTree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
       
        return sizeOfTree(root.left) +sizeOfTree(root.right)+1;
        

    }
    
    public static void disp(Node root)
    {
        if(root ==null) return;
        System.out.print(root.data+" ->");
        if(root.left!=null)System.out.print(root.left.data+" ");
        if(root.right!=null)System.out.print(root.right.data+" ");
        System.out.println();


        disp(root.left);
        disp(root.right);
      
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
