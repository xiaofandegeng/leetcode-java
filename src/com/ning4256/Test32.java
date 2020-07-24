package com.ning4256;

import java.util.Stack;

public class Test32 {
    public int longestValidParentheses(String s) {
        int res = 0;
        if(s.length() < 2 || s == null) {
            return 0;
        }
        int leftDummy = -1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push(i);
            }else {
                if(stack.isEmpty()) {
                    leftDummy = i;
                }else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        res = Math.max(res, i - leftDummy);
                    }else {
                        res = Math.max(res, i - stack.peek());
                    }
                }
            }
        }

        return res;
    }
}
