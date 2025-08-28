package maximumDepthOfBinaryTree;

import maximumDepthOfBinaryTree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root)
    {
        if(root == null) return 0;

        int quantityRight = maxDepth(root.right);
        int quantityLeft = maxDepth(root.left);

        return Math.max(quantityLeft, quantityRight) + 1;

    }
}