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
    private int count = 0;
    public int countNodes(TreeNode root) {
     //int count =0;
        if (root == null ) return 0;
        //if (countNodes(root.right) || countNodes(root.left)){
        count++;
        countNodes(root.left);
        countNodes(root.right);
        //countNodes(root.left);
        //count++;
        
        return count;
        
    }
}