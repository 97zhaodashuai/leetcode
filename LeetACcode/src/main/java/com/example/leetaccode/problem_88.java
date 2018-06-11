package com.example.leetaccode;

public class problem_88 {

    public void main() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);


    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ret = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                ret[k] = nums1[i];
                i++;
                k++;
            } else {
                ret[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i < m) {
            ret[k] = nums1[i];
            k++;
            i++;
        }

        while (j < n) {
            ret[k] = nums2[j];
            k++;
            j++;
        }

        for( i  = 0; i < m + n; i++){
            nums1[i] = ret[i];
        }


    }


}
