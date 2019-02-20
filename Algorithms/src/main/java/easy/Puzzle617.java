package easy;

/**
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
 *
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 *
 * Example 1:
 *
 * Input:
 * 	Tree 1                     Tree 2
 *           1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * Output:
 * Merged tree:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 *
 *
 * Note: The merging process must start from the root nodes of both trees.
 */
public class Puzzle617 {

    /**
     *
     * Using recursive methodology and traversing left and right side of the tree till it reaches the end.
     * @param t1 treeNode
     * @param t2 treeNode
     * @return Summation of both tree node.
     *
     * Runtime: 6 ms, faster than 98.24% of Java online submissions for Merge Two Binary Trees.
     * Memory Usage: 41.3 MB, less than 100.00% of Java online submissions for Merge Two Binary Trees.
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode result = new TreeNode(0);
        result = mergeTrees(result,t1,t2);
        return result;
    }

    private TreeNode mergeTrees(TreeNode result, TreeNode t1, TreeNode t2) {
        if(t1 == null  && t2 == null)
            return null;
        result = new TreeNode((t1 !=null ? t1.val : 0)+(t2 != null ? t2.val : 0));
        result.left = mergeTrees(result.left,(t1 != null ? t1.left : null),(t2 != null ? t2.left : null));
        result.right = mergeTrees(result.right,(t1 != null ? t1.right : null),(t2 != null ? t2.right : null));
        return result;
    }

}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}