package com.example.leetaccode;

public class problem_283 {

    public  static void  test(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        moveZeroes2(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }


    public static void moveZeroes(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length-1; j++){
                int tmp = 0;
                if(nums[j] == 0){
                    tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
    }


    public static void moveZeroes2(int[] nums) {

       int t = 0 ;
       for(int i = 0 ;i < nums.length; i++){
           if(nums[i] != 0){
               nums[t] = nums[i];
               t++;
           }
       }

       for(; t < nums.length; t++){
           nums[t] = 0;
        }
    }



}
