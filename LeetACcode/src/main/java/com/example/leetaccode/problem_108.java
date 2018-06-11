package com.example.leetaccode;

public class problem_108 extends ProblemBinaryTreeBase {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST2(nums, 0, nums.length -1);
    }

    private TreeNode sortedArrayToBST2(int[] nums, int begin, int end){
        if(begin >end){
            return null;
        }
        int index = (end - begin)/2;
        TreeNode root = new TreeNode(nums[index]);
        root.left = sortedArrayToBST2(nums, begin, index-1);
        root.right = sortedArrayToBST2(nums, index+1, end);
        return root;
    }
}
