import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;

/**  
* Title: convertBST.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê4ÔÂ18ÈÕ  
* @version 1.0  
*/

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class convertBST {
	private int sum = 0;
	public TreeNode convertBST(TreeNode root) {
        helper(root);
        return root;
    }
	public void helper(TreeNode root) {
		if(root == null) {
			return;
		}
		helper(root.right);
		root.val += sum;
        System.out.println(sum);
		sum = root.val;
		helper(root.left);
	}
}
