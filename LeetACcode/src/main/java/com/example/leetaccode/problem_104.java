package com.example.leetaccode;

public class problem_104 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static void test() {

    }

    public int  maxDepth(TreeNode root) {
        int cnt = 0;
        TreeNode cur = root;

        if(cur.left == null && cur.right == null){
            return 0;
        }

        if(cur.left != null){
            maxDepth(cur.left);
        }

        if(cur.right != null){
            maxDepth(cur.right);
        }


        return 0;
    }

}
