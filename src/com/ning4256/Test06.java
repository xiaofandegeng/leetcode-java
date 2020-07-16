package com.ning4256;

public class Test06 {
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int len = s.length();
        int index = 0;
        while (index < len) {
            for (int i = 0; i < numRows && index < len; i++) {
                sb[i].append(s.charAt(index++));
            }
            for (int i = numRows - 2; i > 0 && index < len ; i--) {
                sb[i].append(s.charAt(index++));
            }
        }
        for (int i = 1; i < numRows; i++) {
            sb[0].append(sb[i]);
        }

        return sb[0].toString();
    }
}
