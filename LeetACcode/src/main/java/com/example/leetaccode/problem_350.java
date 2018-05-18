package com.example.leetaccode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem_350 {

    public  static void  test(){
        int[] nums1 ={1,2};
        int[] nums2 ={1,1};

        int[] nums = intersect(nums1, nums2);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<Integer>();

        while( i < nums1.length && j < nums2.length ){
            if(nums1[i] >nums2[j]){
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }

        }

        int[] result = new int[list.size()];
        for(i = 0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return  result;
    }
}
