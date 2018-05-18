package com.example.leetaccode;

public class problem {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void test(){
        TreeNode  n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);

        n2.left = n1;
        n2.right = n3;


        isValidBST(n2);


    }


    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);


    }

    private boolean valid(TreeNode root, int min, int max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) {
            return false;
        }

        return valid(root.left, min, root.val) && valid(root.right, root.val, max);


    }


}
