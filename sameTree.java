// Given the roots of two binary trees p and q, write a function to check if they are the same or not.

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkSymmetry(p,q);
    }
    
    public boolean checkSymmetry(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) {
            return true;
        }
        if(root1 == null || root2==null){
            return false;
        }
        if(root1.val != root2.val) return false;
        boolean left = checkSymmetry(root1.left,root2.left);
        boolean right = checkSymmetry(root1.right,root2.right);
        return left && right;
    }
}
