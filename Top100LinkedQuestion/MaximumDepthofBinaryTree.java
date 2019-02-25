/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MaximumDepthofBinaryTree {
    public static int count;
    public void probe(TreeNode root,int level){
        if(root!=null){
            if(count<level){
                count=level;
            }
            probe(root.left,level+1);
            probe(root.right,level+1);
        }
        
    }
    public int maxDepth(TreeNode root) {
        count=0;
        probe(root,1);
        return count;
    }
    
}