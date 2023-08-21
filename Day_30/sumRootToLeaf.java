public class sumRootToLeaf {
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

    public int search(TreeNode node, int result) {
        if (node == null)
            return 0;
        result = 2 * result + node.val;// Directly converting in decimal form
        return node.left == node.right ? result : search(node.left, result) + search(node.right, result);
    }

    public int sumRootToLeaf(TreeNode root) {
        return search(root, 0);
    }

    public static void main(String[] args) {

    }
}
