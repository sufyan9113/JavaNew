import java.util.*;

public class BFSTraverseIter 
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

        root.left=a;
        root.right=b;

        a.left=c;

        b.left=d;

        d.left=e;
        d.right=f;

        ArrayList<Integer>ans=traverse(root);
        System.out.println(ans);
    }   

    public static ArrayList<Integer> traverse(Node root)
    {
        ArrayList<Integer>ans=new ArrayList();
        if(root==null) return ans;
        Queue<Node>q=new LinkedList();
        if(root!=null) q.add(root);

        while(!q.isEmpty())
        {
            Node temp=q.remove();
            ans.add(temp.data);
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right); 
            }
            
            
        }
        return ans;
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
