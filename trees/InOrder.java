package trees;

import java.util.*;

class TreeNode {
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

public class InOrder {
    public static void main(String[] args) {
        // Sample Tree: 1 -> right: 2 -> left: 3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution sol = new Solution();
        List<Integer> result = sol.inorderTraversal(root);
        System.out.println(result); // Expected Output: [1, 3, 2]
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Step 1: Reach the leftmost node of the current subtree
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Step 2: Node at the top of stack has no left children left to process
            curr = stack.pop();
            result.add(curr.val); // Process Root

            // Step 3: Shift to right subtree
            curr = curr.right;
        }

        return result;
    }
}