/**  
* Title: IncreaseOrderTree.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê7ÔÂ2ÈÕ  
* @version 1.0  
*/  


package easy;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}


public class IncreaseOrderTree {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode node = new TreeNode(0);
        tsp(root,node);
        return node.right;
    }
    public TreeNode tsp(TreeNode root, TreeNode cur){
        if(root == null)
            return cur;
        cur = tsp(root.left, cur);
        cur.right = new TreeNode(root.val);
        cur = cur.right;
        return tsp(root.right, cur);
    }
}