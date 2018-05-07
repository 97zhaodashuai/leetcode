package com.example.leetaccode;

public class problem_122 {


    public static void  test(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }
    public static  int removeDuplicates(int[] nums) {

        int res = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[res]){
                nums[++res] = nums[i];
            }
        }
        return res + 1;

    }
}
