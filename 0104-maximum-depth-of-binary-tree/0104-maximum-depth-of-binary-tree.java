class Solution {
    public int maxDepth(TreeNode root) {
        // Base case: an empty tree/node has a depth of 0
        if (root == null) {
            return 0;
        }

        // Recursively find the depth of the left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // Add 1 for the current node and take the larger subtree depth
        return 1 + Math.max(leftDepth, rightDepth);
    }
}