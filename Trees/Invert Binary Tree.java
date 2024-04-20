class Solution {
    //TC -> O(n)
    //SC -> O(h)
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // swaping
        root.left = right;
        root.right = left;

        return root;
    }
}