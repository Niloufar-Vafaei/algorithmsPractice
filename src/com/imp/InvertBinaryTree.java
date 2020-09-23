package com.imp;

public class InvertBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public TreeNode invertTree(TreeNode root) {

            if (root == null)
                return root;

            /* recursive calls */
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);

            /* swap the left and right pointers */
            root.left = right;
            root.right = left;

            return root;


        }
    }
}
