package Day_32;

import javax.swing.tree.TreeNode;
//https://leetcode.com/problems/delete-node-in-a-bst/description/
public class deleteNode {
    // public TreeNode deleteNode(TreeNode root, int key) {
    //     TreeNode parent = null;
    //     TreeNode curr = root;

    //     // Find the node to be deleted
    //     while (curr != null && curr.val != key) {
    //         parent = curr;
    //         if (key < curr.val) {
    //             curr = curr.left;
    //         } else {
    //             curr = curr.right;
    //         }
    //     }

    //     // If the key was not found in the tree
    //     if (curr == null) {
    //         return root;
    //     }

    //     // Case 1: Node to be deleted has no children
    //     if (curr.left == null && curr.right == null) {
    //         if (parent == null) {
    //             return null; // Root is the only node in the tree
    //         } else if (parent.left == curr) {
    //             parent.left = null;
    //         } else {
    //             parent.right = null;
    //         }
    //     }
    //     // Case 2: Node to be deleted has one child
    //     else if (curr.left == null || curr.right == null) {
    //         TreeNode child = (curr.left != null) ? curr.left : curr.right;
    //         if (parent == null) {
    //             return child; // Deleted node was the root
    //         } else if (parent.left == curr) {
    //             parent.left = child;
    //         } else {
    //             parent.right = child;
    //         }
    //     }
    //     // Case 3: Node to be deleted has two children
    //     else {
    //         TreeNode minRightSubtree = getMin(curr.right);
    //         curr.val = minRightSubtree.val;
    //         curr.right = deleteNode(curr.right, minRightSubtree.val);
    //     }

    //     return root;
    // }

    // public TreeNode getMin(TreeNode root) {
    //     while (root.left != null) {
    //         root = root.left;
    //     }
    //     return root;
    // }
}
