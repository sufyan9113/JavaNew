import java.util.*;
 

 class LevelOrder 
{

    public static void main(String[] args) 
    {
        TreeNode root=new TreeNode(3);
        TreeNode a=new TreeNode(9);
        TreeNode b=new TreeNode(20);
        TreeNode c=new TreeNode(15);
        TreeNode d=new TreeNode(7);

        root.left=a; root.right=b;
        b.left=c; b.right=d;
        List<List<Integer>>ans=levelOrder(root);
        System.out.println(ans);
    }
    public static List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>>  all = new ArrayList<>();
        int level = 0;
        levelOrder(root, level, all);
        return all;
    }
    public static void levelOrder(TreeNode root, int level, List<List<Integer>> all) {
        if(root == null) {
            return;
        }
        if(all.size() == level) all.add(new ArrayList<>());
        System.out.println(all);
        all.get(level).add(root.val);
        levelOrder(root.left, level + 1, all);
        levelOrder(root.right, level + 1, all);
    }
}

class TreeNode 
{
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) 
        { 
            this.val = val;
        }
        
}

