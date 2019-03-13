package medium;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class P144_BinaryTreePreorderTraversalTest {

    @Test
    public void baseTestCase1() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        P144_BinaryTreePreorderTraversal puzzle = new P144_BinaryTreePreorderTraversal();
        List<Integer> list = puzzle.preorderTraversal(treeNode);
        Assertions.assertThat(list).containsExactlyInAnyOrder(1,2,3);
    }

}