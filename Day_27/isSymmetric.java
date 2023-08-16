import javax.swing.tree.TreeNode;
//https://leetcode.com/problems/symmetric-tree/description/
public class isSymmetric {
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
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         if(root==null){
//             return true;
//         }
//         return checkSym(root.left,root.right);
//     }
//     private boolean checkSym(TreeNode left,TreeNode right){
//         if(left==null && right==null){
//             return true;
//         }
//         if(left==null || right==null){
//             return false;
//         }
//         return left.val==right.val && checkSym(left.left,right.right) && checkSym(left.right,right.left);
//     }
// }
}
