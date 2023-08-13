import javax.swing.tree.TreeNode;
//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/s
public class depthOfTree {
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }
    public int maxDepth(TreeNode root) {
        int height=0;
        height=heightOfTree(root);
        return height;
    }
    public int heightOfTree(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(heightOfTree(node.left),heightOfTree(node.right));
    }
   
}
