package DSA.BinarySeachTree;

import java.util.*;

public class Insert 
{
    public static void main(String[] args) 
    {
        Node root=createBST();
        disp(root);
        inorder(root);
        System.out.println();
        insert(root,25);
        insert(root, 35);
        insert(root, 15);
        insert(root, 66);
        disp(root);
        inorder(root);
        System.out.println();
    }
    
    public static Node insert(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }

        if(data<root.data)
        {
            root.left=insert(root.left, data);
        }
        else
        {
            root.right=insert(root.right, data);
        }
        return root;
    }
    public static void inorder(Node root)
    {
        if(root==null)return ;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void disp(Node root)
    {
        Queue<Node>q=new LinkedList<>(); 
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
        System.out.println();
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
