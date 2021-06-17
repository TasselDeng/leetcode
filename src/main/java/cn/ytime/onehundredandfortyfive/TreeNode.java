package cn.ytime.onehundredandfortyfive;

/**
 * 二叉树
 *
 * @author y-time
 * @version 1.0
 * @date 2021-06-10 00:28
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

