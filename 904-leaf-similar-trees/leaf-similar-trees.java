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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      // if (root1 == null && root2 == null ) return false;
       ArrayList<Integer> output1 = new ArrayList<>();
       ArrayList<Integer> output2 = new ArrayList<>();
       preorder(root1,output1);
       preorder(root2,output2);
       return output1.equals(output2);
    }
    public void preorder(TreeNode root, ArrayList<Integer> output){
        if (root == null) return;
        if (root.left == null && root.right == null) output.add(root.val);
        preorder(root.left,output);
        preorder(root.right,output);

    }
}