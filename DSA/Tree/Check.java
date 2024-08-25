import java.util.*;
class Solution {

    public static void main(String[]args)
    {
        TreeNode root=new TreeNode(3);
        TreeNode a=new TreeNode(9);
        TreeNode b=new TreeNode(20);
        TreeNode c=new TreeNode(15);
        TreeNode d=new TreeNode(7);

        root.left=a; root.right=b;
        b.left=c; b.right=d;
        List<List<Integer>>ans=zigzagLevelOrder(root);
        System.out.println(ans);
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>>ans=new ArrayList();
        print(root,ans);
        return ans;
    }
    public static  void print(TreeNode root,List<List<Integer>>ans)
    {
        int h=height(root);

        for(int i=1; i<=h;i++)
        {
            List<Integer>al=new ArrayList();
            if(i%2==0)
            {
                bfs2(root,i,al);
                System.out.println("bfs2");
                
            }
            else
            {
                bfs1(root,i,al);
                System.out.println("bfs1");
            }
                
            
            ans.add(al);
            
        }
    }
    public static void bfs1(TreeNode root,int level,List<Integer>al)
    {
        if(root==null) return;
        if(level==1)
        {
            al.add(root.val);
            return;
        }   
        bfs1(root.left,level-1,al);
        bfs1(root.right,level-1,al);
       
    }
    public static void bfs2(TreeNode root,int level,List<Integer>al)
    {
        if(root==null) return;
        if(level==1)
        {
            al.add(root.val);
            return;
        }  
        bfs2(root.right,level-1,al); 
        bfs2(root.left,level-1,al);
        
    }

    public static int height(TreeNode root)
    {
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
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
