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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        postorder(list,root);
        return list;
        
    }
    public void postorder(List<Integer>ans,TreeNode root){
        if(root==null)return;
           
            postorder(ans,root.left);
            postorder(ans,root.right);   
            ans.add(root.val);     
    }
}
//PREORDER