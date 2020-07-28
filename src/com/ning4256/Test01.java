package com.ning4256;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public int[] twoSum(int[] nums, int target) {
        //设置结果
        int[] res = new int[] {-1, -1};
        //判断如果nums为空或者长度不够返回
        if (nums == null || nums.length < 2) {
            return res;
        }
        // 用map来装位置
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //利用val是否存在map里面来找到这个值
            int val = target - nums[i];
            if(map.containsKey(val)) {
                res[0] = map.get(val);
                res[1] = i;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
