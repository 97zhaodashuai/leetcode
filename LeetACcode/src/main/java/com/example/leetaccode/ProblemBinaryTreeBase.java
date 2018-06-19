package com.example.leetaccode;

public class ProblemBinaryTreeBase {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    protected TreeNode create_tree(int[] arr, int len, int index ){

        if(index >= len) return null;
        if(arr[index] == -65535){
            return null;
        }
        TreeNode node = new TreeNode(arr[index]);
        node.left = create_tree(arr, len, index * 2 + 1);
        node.right = create_tree(arr, len, index * 2 + 2);
        return node;
    }



}
