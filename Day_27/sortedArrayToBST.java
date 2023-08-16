import javax.swing.tree.TreeNode;
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
public class sortedArrayToBST {
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

//     public TreeNode formBst(int arr[],int start,int end){
//         int mid=(start+end)/2;
//         if(start>end) return null;
//         TreeNode node=new TreeNode(arr[mid]);
//         node.left=formBst(arr,start,mid-1);
//         node.right=formBst(arr,mid+1,end);
//         return node;
//     }

//     public TreeNode sortedArrayToBST(int[] nums) {
//         int n=nums.length;
//         TreeNode result=formBst(nums,0,n-1);
//         return result;
//     }
// }
}
