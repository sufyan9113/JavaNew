class DFSTraversal 
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

        System.out.print("preorder traversal: ");
        preOrder(root);
        System.out.println();
        
        System.out.print("inorder traversal: ");
        inOrder(root);
        System.out.println();

        System.out.print("postorder traversal: ");
        postOrder(root);
        System.out.println();
    }

    public static void preOrder(Node root)
    {
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
      
    }
    public static void inOrder(Node root)
    {
        if(root==null)return;

        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right);
       
    }
    public static void postOrder(Node root)
    {
        if(root==null)return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");
       
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
