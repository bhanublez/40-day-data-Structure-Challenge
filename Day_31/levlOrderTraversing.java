import java.util.ArrayList;
import java.util.List;

public class levlOrderTraversing {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        return levelOrdering(root, new ArrayList<List<Integer>>(), 0);
    }

    public List<List<Integer>> levelOrdering(TreeNode node, List<List<Integer>> list, int l) {
        if (node == null) {
            return list;
        } else {
            if (l >= list.size()) {// Treaversing Tree Level Node one by one
                list.add(new ArrayList<>());
            }
            list.get(l).add(node.val);
            levelOrdering(node.left, list, l + 1);
            levelOrdering(node.right, list, l + 1);
            return list;
        }
    }
    public static void main(String[] args) {
        levlOrderTraversing l = new levlOrderTraversing();
        TreeNode root = l.new TreeNode(3);
        root.left = l.new TreeNode(9);
        root.right = l.new TreeNode(20);
        root.right.left = l.new TreeNode(15);
        root.right.right = l.new TreeNode(7);
        System.out.println(l.levelOrder(root));
    }
}