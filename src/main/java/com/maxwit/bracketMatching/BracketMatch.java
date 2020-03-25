package com.maxwit.bracketMatching;

import java.util.Stack;

public class BracketMatch {
    public static boolean match(char[] arr) {
        Stack<Character> stack = new Stack<>();

        for (char s : arr) {
            if (s == '(' || s == '{' || s == '[') {
                stack.push(s);
            } else if (s == ')' || s == '}' || s == ']') {
                char top = 0;
                if (!stack.isEmpty()) {
                    top = stack.peek();
                }

                if (top == '(' && s == ')') {
                    stack.pop();
                } else if (top == '{' && s == '}') {
                    stack.pop();
                } else if (top == '[' && s == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}
