import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
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

    List<Integer> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root);
        // System.out.println(list);
        return list.get(k - 1);
    }

    public void inorderTraversal(TreeNode node) {
        if (node == null)
            return;
        inorderTraversal(node.left);
        list.add(node.val);
        inorderTraversal(node.right);
    }

}
