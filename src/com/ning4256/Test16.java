package com.ning4256;

import java.util.Arrays;

public class Test16 {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int detal = nums[0] + nums[1] + nums[2] - target;
        int i = 0;
        Arrays.sort(nums);
        while (i < n - 2){
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int newDetal = nums[i] + nums[left] + nums[right] - target;
                if(newDetal == 0)
                    return target;
                if(newDetal < 0)
                    left++;
                if(newDetal > 0)
                    right--;
                if(Math.abs(detal) > Math.abs(newDetal)){
                    detal = newDetal;
                }
            }
            i++;
        }
        return detal + target;
    }
}
