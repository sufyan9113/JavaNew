package DSA.BinarySeachTree;
import java.util.*;
class Solution {

    public static void main(String[] args) 
    {
        TreeNode root=creteTree();
        disp(root);
        TreeNode newRoot=deleteNode(root, 3);
        disp(newRoot);

    }
  
    public static TreeNode deleteNode(TreeNode root, int key) 
    {
       TreeNode curr=root;
       TreeNode parent=null;
     
        while( curr!=null  && curr.val!=key)
       {
            parent=curr;
            if(key<curr.val)
            {
                curr=curr.left;
            }
            else
            {
                curr=curr.right;
            }
       }

        if(curr==null) return root;

        if(curr.left==null && curr.right==null)
        {
            if(curr==root)
            {
                root=null;
            }
            

        else
        {
        if(parent.left==curr)
        parent.left=null;

        else
        {
        parent.right=null;
        }
        
       }
    }
    else if(curr.left==null || curr.right==null)
    {
        TreeNode child;
        if(curr.left!=null)
        {
            child=curr.left;
        }
        else
        {
            child=curr.right;
        }

        if(parent.left==curr)
        {
            parent.left=child;
        }
        else 
        {
            parent.right=child;
        }
    }
    
    else
    {
        System.out.println("in else block");
        TreeNode min=findMin(curr.right);
        int minVal=min.val;
        deleteNode(root,minVal);
        curr.val=minVal;
    }

    
        return root;
       
    }

    public static TreeNode findMin(TreeNode curr)
    {
        while(curr.left!=null)
        {
            curr=curr.left;
        }
        return curr;
    }
        
    
    public static TreeNode creteTree()
    {
        TreeNode root=new TreeNode(5);
        TreeNode a=new TreeNode(3);
        TreeNode b=new TreeNode(6);
        TreeNode c =new TreeNode(2);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(7);

        root.left=a; root.right=b;

        a.left=c; a.right=d;

        b.right=e; 

        return root;
    }

    public static void disp(TreeNode root)
    {
        Queue<TreeNode>q=new LinkedList<>(); 
        q.add(root);

        while(!q.isEmpty())
        {
            TreeNode temp=q.remove();
            System.out.print(temp.val+" ");

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
    
}
    class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val)
        {
            this.val=val;
        }
    }
 

