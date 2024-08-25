import java.util.*;

class TreeRevision
{
    
    static int maxDiameter;
    static Node b;
    static Node j;
    static int maxPathSum=Integer.MIN_VALUE;
    public static void main(String[] args) 
    {
        Node root=createTree();
    

        DFSTraversal(root);
        BFSTraversal(root);
        System.out.println("no of leaves: "+findLeaves(root));
        System.out.println("size of tree: "+size(root));
        System.out.println("height of tree: "+height(root));
        diameter(root);
        System.out.println("diameter of tree: "+maxDiameter);
        System.out.println("symmetric tree: "+symmetric(root,root));
        System.out.println("lowest common ancestor of g and h node is: "+lowestCommonAncestor(root,b,j).data);
        maxPathSum(root);
        System.out.println("maximum path sum: "+maxPathSum);

      
         
    
    }
    public static int maxPathSum(Node root)
    {
        if(root==null) return 0;

        int left=Math.max(0, maxPathSum(root.left));
        int right=Math.max(0, maxPathSum(root.right));
        maxPathSum=Math.max(maxPathSum, root.data+left+right);

        return root.data+Math.max(left, right);


    }
    public static Node lowestCommonAncestor(Node root,Node p,Node q)
    {
        if(root==null) return null;

        if(root==p || root ==q) return root;

        Node left=lowestCommonAncestor(root.left, p, q);
        Node right=lowestCommonAncestor(root.right, p, q);

        if(left!=null && right!=null) return root;

        if(left!=null) return left;
        else return right;
    }

    public static boolean symmetric(Node left, Node right)
    {
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        
        if(left.data!=right.data)return false;

        return symmetric(left.left, right.right) && symmetric(left.right, right.left);
    }
    public static Node createTree()
    {
        
        Node root=new Node(1);
        Node a=new Node(2);
        b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(7);
        Node g=new Node(8);
        Node h=new Node(9);
        Node i=new Node(10);
        j=new Node(11);

        
        root.left=a; root.right=b;
        a.left=c; a.right=d;
        b.left=e; b.right=f;
        c.left=g; 
        d.left=h;
        e.right=i;
        f.right=j;

        return root;

    }
    public static int diameter(Node root)
    {
        if(root==null) return 0;

        int left=height(root.left);
        int right=height(root.right);
        int diameter=left+right;
        maxDiameter=Math.max(maxDiameter, diameter);

        return 1+ Math.max(left,right);
    }
    public static int height(Node root)
    {
        if(root==null) return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public static void BFSTraversal(Node root)
    {
        System.out.println("BFS traversal");
        System.out.print("iterative Traversal: ");
        iterative(root);
        System.out.println();

        System.out.print("recursive Traversal: ");
        recursive(root);
        System.out.println();
    }
    public static void iterative(Node root)
    {
        Queue<Node>q=new LinkedList();
        q.add(root);

        while(!q.isEmpty())
        {
            Node temp=q.remove();
            System.out.print(temp.data+" ");
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
    
        }
    }
    public static void recursive(Node root)
    {
        int level=1;
        while(recur(root, level))
        {
            level++;
        }
    }
    public static boolean recur(Node root,int level)
    {
        if(root==null)
        {
            return false;
        }
        if(level==1)
        {
            System.out.print(root.data+" ");    
            return true;
        }
        boolean left=recur(root.left, level-1);
        boolean right=recur(root.right, level-1);

        return left|| right;
    }
    public static void DFSTraversal(Node root)
    {
        System.out.println("DFS traversal");
        System.out.print("pre order traverse: ");
        preorder(root);
        System.out.println();
        System.out.print("in order traverse: ");
        inorder(root);
        System.out.println();
        System.out.print("post order traverse: ");   
        postorder(root);
        System.out.println();
    }
    public static void preorder(Node root)
    {
        if (root==null)return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root)
    {
        if (root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
    }
    public static void postorder(Node root)
    {
        if (root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static int size(Node root)
    {
        if(root==null) return 0;

        return 1+size(root.left)+size(root.right);
    }
    public static int findLeaves(Node root)
    {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;

        return findLeaves(root.left)+findLeaves(root.right);
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