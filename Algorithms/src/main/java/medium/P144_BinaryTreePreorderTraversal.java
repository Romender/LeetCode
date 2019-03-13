package medium;

import java.util.ArrayList;
import java.util.List;

public class P144_BinaryTreePreorderTraversal {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
    preOrder(root,list);
        return list;
}

    private void preOrder(TreeNode treeNode, List<Integer> list) {
        if(treeNode != null) {
            list.add(treeNode.val);
            if (treeNode.left != null)
                preOrder(treeNode.left, list);
            if (treeNode.right != null)
                preOrder(treeNode.right, list);
        }
    }



}
