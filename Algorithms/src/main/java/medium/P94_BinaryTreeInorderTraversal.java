package medium;

import java.util.ArrayList;
import java.util.List;

public class P94_BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root,list);
        return list;
    }

    private void preOrder(TreeNode treeNode, List<Integer> list) {
        if(treeNode != null) {
            if (treeNode.left != null)
                preOrder(treeNode.left, list);
            list.add(treeNode.val);
            if (treeNode.right != null)
                preOrder(treeNode.right, list);
        }

    }
}
