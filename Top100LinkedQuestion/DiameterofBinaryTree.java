/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        Tree(root);
        //System.out.println(left);
        return max;
    }
    public int Tree(TreeNode root){
        if(root==null)return 0;
        int left=Tree(root.left);
        int right=Tree(root.right);
        max=Math.max(max,left+right);
        return Math.max(left,right)+1;
    }
}