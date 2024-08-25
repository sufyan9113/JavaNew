public class MaximumPathSum 
{   
    static int max;
    static int maxPathSum;
    public static void main(String[] args) 
    {
        Node root=new Node(15);
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(-30);
        Node d=new Node(-15);

        root.left=a;
        root.right=b;

        b.left=c;
        b.right=d;

        maxmiSum(root);
        maxPathSum(root);
        
        System.out.println("maximum sum: "+max);
        System.out.println("maximum sum: "+maxPathSum);
    }

    public static int maxmiSum(Node root)
    {
        if(root==null)
        return 0;

        int left= Math.max(0, maxmiSum(root.left));
        int right= Math.max(0, maxmiSum(root.right));
        
        max=Math.max(max,root.data+left+right);

        return root.data+Math.max(left, right);

    }
    public static int maxPathSum(Node root)
    {
        if(root==null) return 0;

        int left=Math.max(0, maxPathSum(root.left));
        int right=Math.max(0, maxPathSum(root.right));
        maxPathSum=Math.max(maxPathSum, root.data+left+right);

        return root.data+Math.max(left, right);


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
