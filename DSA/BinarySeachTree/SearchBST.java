package DSA.BinarySeachTree;
class SearchBST
{
    public static void main(String[] args) 
    {
  
        Node root=createBST();
        int x=70;
        System.out.println(x+" element present: "+search(root, x));
        
    }
    
    public static boolean search(Node root,int data)
    {
       if(root==null) return false;
       if(root.data==data) return true;

       if(data<root.data) return search(root.left, data);

       else return search(root.right, data);
    }
   
   
    public static Node createBST()
    {
        Node root=new Node(40);
        Node a=new Node(20);
        Node b=new Node(60);
        Node c=new Node(10);
        Node d=new Node(30);
        Node e=new Node(50);
        Node f=new Node(70);

        root.left=a; root.right=b;

        a.left=c; a.right=d;
        b.left=e; b.right=f;
        
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
 
