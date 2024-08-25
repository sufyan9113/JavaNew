public class SymmetricTree 
{
    static boolean a;
    public static void main(String[] args) 
    {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(3);
        Node e=new Node(4);
        Node f=new Node(4);

        root.left=a;
        root.right=b;

        a.left=c;
        b.right=d;

        a.right=e;
        b.left=f;

        boolean symm=find(root.left,root.right);
        System.out.println("symmetric tree: "+symm);
        
    }
    public static boolean find(Node left,Node right)
    {
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.data!=right.data) return false;

        return find(left.left, right.right) && find(left.right, right.left);
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
