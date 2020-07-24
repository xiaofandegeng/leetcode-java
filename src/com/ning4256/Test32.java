package com.ning4256;

import java.util.Stack;

public class Test32 {
    public int longestValidParentheses(String s) {

        int res = 0;
        int leftIndex = -1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                stack.push(i);
            else {
                if (stack.isEmpty())
                    leftIndex = i;
                else {
                    stack.pop();
                    if(stack.isEmpty())
                        res = Math.max(res, i - leftIndex);
                    else
                        res = Math.max(res, i - stack.peek());
                }
            }
        }
        return res;
    }
}
