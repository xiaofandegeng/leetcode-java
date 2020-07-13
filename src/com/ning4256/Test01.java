package com.ning4256;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        int val = 0;

        for (int i = 0; i < nums.length; i++) {
            val = target - nums[i];
            if (map.containsKey(val)) {

                res[1] = i;
                res[0] = map.get(val);
            }
            map.put(nums[i], i);

        }
        return res;
    }
}
