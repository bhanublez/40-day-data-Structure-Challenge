import javax.swing.tree.TreeNode;

public class rangeSumBST {
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

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        return addValue(root, low, high);
    }
    
    public static int addValue(TreeNode node, int low, int high) {
        if (node == null) {
            return 0;
        }
        int sum = 0;
        if (node.val >= low && node.val <= high) {
            sum += node.val;
        }
        sum += addValue(node.left, low, high) + addValue(node.right, low, high);
        return sum;
    }
}