package cn.ytime.onehundredandfortyfive;


import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的后序遍历。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 *
 * @author y-time
 * @version 1.0
 * @date 2021-06-16 23:09
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> inorderTraversalForRecursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        inorder(root.right, res);
        res.add(root.val);
    }

}
