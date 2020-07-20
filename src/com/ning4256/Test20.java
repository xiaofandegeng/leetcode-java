package com.ning4256;

import java.util.Stack;

public class Test20 {
    public boolean isValid(String s) {
        Stack<Character> mask = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                mask.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if(mask.isEmpty()) {
                    return false;
                }else {
                    Character pop = mask.pop();
                    if(pop == '(' && s.charAt(i) != ')') return false;
                    if(pop == '{' && s.charAt(i) != '}') return false;
                    if(pop == '[' && s.charAt(i) != ']') return false;
                }
            }
        }
        if(mask.isEmpty()) {
            return true;
        }
        return false;
    }
}
