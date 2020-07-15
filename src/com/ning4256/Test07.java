package com.ning4256;

public class Test07 {
    public int reverse(int x) {
        int res = 0;

        while (x != 0) {
            int newres = 0;
            newres = (x % 10) + res * 10;
            if(((newres - (x % 10)) / 10) != res) {
                return 0;
            }
            res = newres;
            x = x / 10;

        }

        return res;
    }

}
