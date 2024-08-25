import java.util.*;

public class BFSTraversalZigZag 
{
    public static void main(String[] args) 
    {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node (5);
        Node e=new Node(6);
        Node f=new Node(7);

        root.left=a; root.right=b;
        a.left=c; a.right=d;
        b.left=e; b.right=f;
      //  BFS(root);
      //  System.out.println();
        print(root);
        System.out.println();
    }
    
    public static void BFS(Node root)
    {
        Queue<Node>q=new LinkedList();

        q.add(root);

        while(!q.isEmpty())
        {
            Node temp=q.remove();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }

    }
    
    public static void print(Node root)
    {
        int h=height(root);
        for(int i=1; i<=h;i++)
        {
            if(i%2==0)
            {
                BFS2(root, i);
                System.out.println();
            }
            else
            {
                BFS1(root, i);
                System.out.println();
            }
           
        }

       
    }
    public static int height(Node root)
    {
        if(root==null) return 0;

        return 1+Math.max(height(root.left), height(root.right));
    }
    public static void BFS1(Node root,int level)
    {
        if(root==null) return;

        if(level==1)
        {
            System.out.print(root.data+" ");
            return;
        }

        BFS1(root.left, level-1);
        BFS1(root.right, level-1);

        
    }
    public static void BFS2(Node root,int level)
    {
        if(root==null) return;

        if(level==1)
        {
            System.out.print(root.data+" ");
            return;
        }

        BFS2(root.right, level-1);
        BFS2(root.left, level-1);
        
        

        
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
