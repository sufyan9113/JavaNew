import java.util.*; 
public class DiameterOfTree 
{   
    static int max;
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
        Node i=new Node(10);
        Node j=new Node(11);

        root.left=a;
        root.right=b;

        a.left=c;
        a.right=d;

        b.left=e;
        b.right=f;

        d.left=g;

        e.left=h;

        f.right=i;
        i.right=j;

        ArrayList<Integer>ans=traverse(root);
        System.out.println(ans);

        int diameter=findDiameter(root);
        System.out.println("diameter: "+diameter);
        
        
    }
    public static int findDiameter(Node root)
    {
        height(root);

        return max;
    }
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=height(root.left);
        int right=height(root.right);
        int dia=left+right;
        max=Math.max(dia, max);

        return 1+ Math.max(left, right);
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
