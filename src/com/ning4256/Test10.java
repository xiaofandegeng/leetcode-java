package com.ning4256;

public class Test10 {
    public boolean isMatch(String s, String p) {
        if(s == null || p == null) return false;
        boolean[][] t = new boolean[s.length() + 1][p.length() + 1];
        t[0][0] = true;

        for (int j = 1; j < p.length() + 1; j++) {
            if(p.charAt(j - 1) == '*') {
                t[0][j] = t[0][j - 2];
            }
        }

        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 1; j < p.length() + 1; j++) {
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    t[i][j] = t[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        t[i][j] = t[i][j - 2] || t[i - 1][j];
                    } else {
                        t[i][j] = t[i][j - 2];
                    }
                }
            }
        }
        return t[s.length()][p.length()];
    }
}
