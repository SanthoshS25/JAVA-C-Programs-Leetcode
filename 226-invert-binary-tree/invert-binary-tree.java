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
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp ; // just created the third variable 
        if (root == null) return root;// if the root is [] , if we inverse the null its always the same
        temp = invertTree(root.right); // when we go with more than 3 node tree, we should recurise and assign it to the temp
        root.right = invertTree(root.left);
        root.left = temp;
        return root;
        
    }
}