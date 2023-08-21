public class lowestCommonAncenstor {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p|| root==q){
            return root;//If any of them exist then return it
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);//Check in left side
        TreeNode right=lowestCommonAncestor(root.right,p,q);//Check in right side
        if(left!=null && right!=null){
            return root;//We provide that both p and q mentioned are exit in Tree
        }
        if(left!=null){
            return left;//Right is null
        }else{
            return right;//Left is null
        }

    }
}
