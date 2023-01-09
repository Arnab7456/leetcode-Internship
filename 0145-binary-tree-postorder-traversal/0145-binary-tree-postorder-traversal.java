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
    public List<Integer> postorderTraversal(TreeNode curr) {
         ArrayList<Integer> postOrder = new ArrayList<>();
            if (curr == null) return postOrder;

            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            s1.push(curr);
            while (!s1.isEmpty()) {
                curr = s1.peek();
                s1.pop();
                s2.push(curr);
                if (curr.left != null)
                    s1.push(curr.left);
                if (curr.right != null)
                    s1.push(curr.right);
            }
            while (!s2.isEmpty()) {
                postOrder.add(s2.peek().val);
                s2.pop();
            }
            return postOrder;
    }
}