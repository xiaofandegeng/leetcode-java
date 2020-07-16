package com.ning4256;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test15 {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if(nums == null || n < 3) return res;
        int i = 0;
        Arrays.sort(nums);

        while (i < n - 2){
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    LinkedList<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    left = moveRight(nums, left + 1);
                    right = moveLeft(nums, right - 1);
                }else if (sum > 0) {
                    right = moveLeft(nums, right - 1);
                } else {
                    left = moveRight(nums, left + 1);
                }
            }
            i = moveRight(nums, i+1);
        }
        return res;
    }

    private int moveLeft(int[] nums, int right) {
        while (right ==nums.length - 1 || right >= 0 && nums[right] == nums[right + 1]){
            right--;
        }
        return right;
    }

    private int moveRight(int[] nums, int left) {
        while(left ==0 || left < nums.length && nums[left] == nums[left - 1]){
            left++;
        }
        return left;
    }

}
