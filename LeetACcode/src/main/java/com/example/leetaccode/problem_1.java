package com.example.leetaccode;

public class problem_1 {

    public static void  test(){
        int[] nums = {-3,4,3,90};
        int target = 0;
        int[] res =  twoSum(nums, target);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int max = nums[0] ;
        int min = nums[0];
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }

            if(nums[i] < min){
                min = nums[i];
            }
        }

        int[] indexes = new int[max - min +1];
        int[] rets = new int[2];
        for(int j = 0; j < nums.length; j++){
            int other = target - nums[j];
            if(other < min ||  other >max){
                continue;
            }
            if(indexes[other - min] != 0){
                rets[0] = indexes[other - min] - 1;
                rets[1] = j;
                return rets;
            }
            indexes[nums[j] - min] = j + 1 ;
        }
        return null;
    }

}
