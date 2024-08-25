import java.util.*;


public class BFSTraversal 
{
    public static void main(String[] args) 
    {
        String[]s={"1","2","3","4","5","","6","","7","","","8","","","","9",""};
        Node root=createTree(s);
        disp(root);
    }
    public static Node createTree(String[]s)
    {
        int x=Integer.parseInt(s[0]);
        int n=s.length;
        Node root=new Node(x);
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<n-1)
        {
            Node temp=q.remove();
            Node left=new Node(0);
            Node right=new Node(0);

            if(s[i].equals(""))
            {
                left=null;
            }
            else
            {
                int l=Integer.parseInt(s[i]);
                left.data=l;
                temp.left=left;
                q.add(left);
            }
            if(s[i+1].equals(""))
            {
                right=null;
            }
            else
            {
                int r=Integer.parseInt(s[i+1]);
                right.data=r;
                temp.right=right;
                q.add(right);
            }
            i+=2;
        }
        return root;
    }
    public static int height(Node root)
    {
        if (root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void disp(Node root)
    {
        int h=height(root);
        for(int i=1; i<=h;i++)
        {
            BFS(root, i);
            System.out.println();
        }

    }
    public static void BFS(Node root,int level)
    {
        if(root==null)return;
        if(level==1)
        {
            System.out.print(root.data+" ");
        }
        BFS(root.left, level-1);
        BFS(root.right, level-1);
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
