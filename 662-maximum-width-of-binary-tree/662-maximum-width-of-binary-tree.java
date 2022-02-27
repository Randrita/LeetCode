class Solution {
    int maxWidth = 1;
    
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        traverse(root, 1, 0);
        return maxWidth;
    }
    
    ArrayList<Integer> firstId = new ArrayList<>(); // First ID of each depth level as the start.
    
    void traverse(TreeNode root, int id, int depth) {
        if (root == null) return;
        
        if (firstId.size() == depth) {
            firstId.add(id);
        } else {
            maxWidth = Math.max(maxWidth, id - firstId.get(depth) + 1); // check the below diagram
        }
        
        traverse(root.left, id * 2, depth + 1);
        traverse(root.right, id * 2 + 1, depth + 1);
    }
}