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
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
         if (root == null){
            return false;
        }
        if (root.val == subRoot.val){
            if (isIdentical(root , subRoot)){
                return true;
            }
        }
        boolean Leftans = isSubtree(root.left , subRoot);
        boolean rightans = isSubtree(root.right , subRoot);

        return Leftans || rightans ;
    }
        public static boolean isIdentical(TreeNode node , TreeNode subnode){
        if (node == null && subnode == null){
            return true;
        } else if (node == null || subnode == null) {
            return false;
        }
        else if (node.val != subnode.val){
                return false;
        } else if (!isIdentical(node.left , subnode.left)) {
            return false;
        }
        else if (!isIdentical(node.right , subnode.right)){
            return false;
        }
        return true;
    }
}