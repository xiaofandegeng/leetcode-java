package com.ning4256;

public class Test34 {
    public int[] searchRange(int[] nums, int target) {
        //判断nums不为空
        int[] res = new int[] {-1, -1};
        //设置初始和结束坐标
        int st_point = -1, en_point = -1;
        //设置两个坐标记录位置
        int start = 0, end = nums.length - 1;

        //排除初始为空
        if (nums == null || nums.length < 1) {
            return res;
        }

        //利用二分法获得初始位置的坐标
        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target) {
                end = mid;
            }else {
                start = mid;
            }
        }
        //排除初始位置是target值
        if(nums[start] == target) {
            st_point = start;
        }else if (nums[end] == target) {
            st_point = end;
        }

        //重置起始位置和结束位置
        start = 0;
        end = nums.length - 1;
        //利用二分法获得结束位置的坐标
        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > target) {
                end = mid;
            }else {
                start = mid;
            }
        }
        //排除结束位置是target值
        if (nums[end] == target) {
            en_point = end;
        }else if(nums[start] == target) {
            en_point = start;
        }
        res[0] = st_point;
        res[1] = en_point;
        return res;
    }
}
