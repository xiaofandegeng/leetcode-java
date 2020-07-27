package com.ning4256;

public class Test34 {
    public int[] searchRange(int[] nums, int target) {
        //判断nums不为空
        int[] res = new int[] {-1, -1};
        if(nums == null || nums.length == 0) {
            return res;
        }

        //设置初始位置和结束位置
        int st_point = -1, en_point = -1; // 结果记录的点
        int start = 0, end = nums.length - 1; //移动的俩个坐标
        //先找到起始坐标的值st_point
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target) {
                end = mid;
            }else {
                start = mid;
            }
        }
        //排除第一个是target
        if (nums[start] == target) {
            st_point = start;
        }else if (nums[end] == target) {
            st_point = end;
        }

        start = 0;
        end = nums.length - 1;
        //先找到结束坐标的值st_point
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > target) {
                end = mid;
            }else {
                start = mid;
            }
        }
        if (nums[end] == target) {
            en_point = end;
        } else if (nums[start] == target) {
            en_point = start;
        }

        //返回结果
        res[0] = st_point;
        res[1] = en_point;
        return res;
    }
}
