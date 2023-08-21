public class diameterOfBinarytree {
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

    int max = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        max = Math.max(max, left + right);
        return 1 + Math.max(left, right);
    }
    public static void main(String[] args) {
        diameterOfBinarytree d = new diameterOfBinarytree();
        TreeNode root = d.new TreeNode(1);
        root.left = d.new TreeNode(2);
        root.right = d.new TreeNode(3);
        root.left.left = d.new TreeNode(4);
        root.left.right = d.new TreeNode(5);
        System.out.println(d.diameterOfBinaryTree(root));
    }
}
