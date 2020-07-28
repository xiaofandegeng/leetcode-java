package com.ning4256;

public class Test05 {
    public String longestPalindrome(String s) {
        //获取字符串长度
        int n = s.length();
        //截取字符串的起始位置和长度
        int start = 0;
        int addLength = 0;
        boolean[][] isP = new boolean[n][n];

        // 当只有一个值是回文数的时候 abcd
        for (int i = 0; i < n; i++) {
            isP[i][i] = true;
            addLength = 1;
        }
        // 当两个数是回文数的时候 baac
        for (int i = 0; i < n - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)){
                isP[i][i + 1] = true;
                addLength = 2;
                start = i;
            }
        }
        // 当三个数及以上的时候  abcbc
        for (int m = 3; m <= n ; m++) {
            for (int i = 0; i < n - m + 1; i++) {
                int j = i + m - 1;
                if(s.charAt(i) == s.charAt(j) && isP[i+1][j-1]) {
                    isP[i][j] = true;
                    addLength = m;
                    start = i;
                }
            }
        }

        return s.substring(start, start + addLength);

    }
}
