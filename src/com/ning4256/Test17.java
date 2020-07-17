package com.ning4256;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test17 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>();
        int cur = 0;
        if(digits == null || digits.length() < 1)
            return res;
        Map<Character, char[]> map = new HashMap<>();
        map.put('2', new char[]{'a', 'b','c'});
        map.put('3', new char[]{'d', 'e','f'});
        map.put('4', new char[]{'g', 'h','i'});
        map.put('5', new char[]{'j', 'k','l'});
        map.put('6', new char[]{'m', 'n','o'});
        map.put('7', new char[]{'p', 'q','r', 's'});
        map.put('8', new char[]{'t', 'u','v'});
        map.put('9', new char[]{'w', 'x','y', 'z'});

        change("", cur, digits, map, res);
        return res;

    }

    private void change(String s, int cur, String digits, Map<Character, char[]> map, List<String> res) {
        if(cur == digits.length()){
            res.add(s);
        }
        else {
            char c = digits.charAt(cur);
            if (map.containsKey(c)) {
                for (char ch: map.get(c)) {
                    change(s + ch, cur + 1, digits, map, res);
                }
            }
        }
    }
}