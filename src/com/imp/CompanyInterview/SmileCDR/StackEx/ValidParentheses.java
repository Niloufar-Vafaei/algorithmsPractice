package com.imp.CompanyInterview.SmileCDR.StackEx;
/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * */

import java.util.Stack;


class ValidParentheses {
    public boolean isValid(String s) {
        if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')') return false;
        Stack<Character> store = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                store.push(c);
            } else if (!store.isEmpty()) {
                char openCh = store.pop();
                if (c == ')' && openCh != '(') {
                    return false;
                } else if (c == ']' && openCh != '[') {
                    return false;
                } else if (c == '}' && openCh != '{') {
                    return false;
                }
            } else return false;
        }
        return store.isEmpty();
    }


    public boolean isValidReverse(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}


