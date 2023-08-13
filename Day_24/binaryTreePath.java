import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class binaryTreePath {
   
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
 
    //My Brute force
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<String>();
        binaryTreePath(root,"",list);
        return list;
    }
    public  void binaryTreePath(TreeNode node,String path,List<String> list){
        if(node.left==null && node.right==null) list.add(path+node.val);
        if(node.left!=null)binaryTreePath(node.left,path+node.val+"->",list);
        if(node.right!=null)binaryTreePath(node.right,path+node.val+"->",list);       
    }

    public static void main(String[] args) {
        
    }
}
