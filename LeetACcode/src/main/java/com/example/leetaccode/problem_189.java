package com.example.leetaccode;

public class problem_189 {

    public  void  test(){
        int[] nums = {1};
        int k = 0;
        rotate(nums, k);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public void rotate(int[] nums, int k) {


        for(int i = 0; i < k; i++){
            int end = nums[nums.length-1];
            for(int j = nums.length-2; j >=0; j--){
                nums[j+1] = nums[j];
            }
            nums[0] = end;
        }

        //solve 2
//        k = k % nums.length;
//
//        if(k == 0) return;
//
//        int[] tmp = new int[k];
//
//        for(int i = 0; i < k; i++){
//            tmp[i] = nums[nums.length - k + i];
//        }
//
//        for(int j = nums.length-k-1; j >= 0; j--){
//            nums[j + k] = nums[j];
//        }
//
//        for(int i = 0; i < k; i++){
//            nums[i] = tmp[i];
//        }





    }

}
