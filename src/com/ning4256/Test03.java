package com.ning4256;

import java.util.HashMap;
import java.util.Map;

public class Test03 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        //如果s为空或直接返回
        if(s == null || s.length() < 1) {
            return res;
        }
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        //用两个指针判断是否重复
        for (int start = 0, end = 0; end < n; end++) {
            // 如果map里面有了字符
            if(map.containsKey(s.charAt(end))) {
                // 则移动起始位置
                start = Math.max(start, map.get(s.charAt(end)));
            }
            //比较获取最长长度
            res = Math.max(res, end - start + 1);
            //将值添加到map里面
            map.put(s.charAt(end), end + 1);
        }

        return res;
    }
}
