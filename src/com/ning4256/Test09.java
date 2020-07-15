package com.ning4256;

public class Test09 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int div = 1;
        int tmp = x;
        while (tmp / 10 != 0) {
            div = div * 10;
            tmp = tmp / 10;
        }
        while (x != 0) {
            int right = x % 10;
            int left = x / div;
            if(left != right){
                return false;
            }
            x = ((x - left * div) - right) / 10;
            div = div / 100;
        }
        return true;

    }
}
