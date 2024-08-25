public class BFSTravers1 {
    
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> ans=new ArrayList();
        if(root==null) return ans;
        helper(root,ans);
        return ans;
    }
    public void helper(TreeNode root, List<List<Integer>> ans)
    {
        int h=height(root);
        Queue<TreeNode>q=new LinkedList();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer>al=new ArrayList();
            for(int i=q.size(); i>0; i--)
            {
                TreeNode temp=q.remove();
                al.add(temp.val);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
                

            }
            ans.add(al);
        }
        


    }
   
    public int height(TreeNode root)
    {
        if (root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    
}
