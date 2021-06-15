package cn.ytime.ninetyfour;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树的根节点 root ，返回它的中序遍历
 * 二叉树的中序遍历：
 * 按照访问左子树——根节点——右子树的方式遍历这棵树，而在访问左子树或者右子树的时候我们按照同样的方式遍历，直到遍历完整棵树。
 * @author y-time
 * @version 1.0
 * @date 2021-06-10 00:12
 */
public class BinaryTreeInorderTraversal {

    /**
     * 递归方式
     * @param root
     * @return
     */
    public List<Integer> inorderTraversalForRecursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        // 递归遍历左树
        inorder(root.left, res);
        // 将root节点的值加入答案
        res.add(root.val);
        // 递归遍历右树
        inorder(root.right, res);
    }


}
