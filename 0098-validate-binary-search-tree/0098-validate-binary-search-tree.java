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
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    static boolean isValid(TreeNode root,long minv,long maxv){
        if(root==null)return true;
        if(root.val<=minv)return false;
        if( root.val>=maxv)return false;
        return isValid(root.left,minv,root.val) && isValid(root.right,root.val,maxv);

    }
}