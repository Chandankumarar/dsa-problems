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
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
        // if(root.val==k)return true;
        HashSet<Integer> set=new HashSet<>();
        return check(root,set,k);
    }
    static boolean check(TreeNode root,HashSet<Integer> set,int k){
        if(root==null)return false;
        if(set.size()>=1 && set.contains(k-root.val))return true;
        set.add(root.val);
        return check(root.left,set,k)|| check(root.right,set,k);
    }
}