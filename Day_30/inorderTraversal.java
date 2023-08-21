import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class inorderTraversal {

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

    class Solution {
        List<Integer> L = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null)
                return L;
            inorderTraversal(root.left);
            L.add(root.val);
            inorderTraversal(root.right);
            return L;
        }
    }
}
