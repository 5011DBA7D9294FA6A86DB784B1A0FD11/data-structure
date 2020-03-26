package com.maxwit.sequentialStack;

import com.maxwit.sequentialList.Data;

public class Demo {
    public static void main(String[] args) {
        SequentialStack<Integer> stack = new SequentialStack<>();
        System.out.println(stack.peek());

        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);

        stack.traversal((d) -> {
            System.out.println(d);
        });

        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
        stack.traversal((d) -> {
            System.out.println(d);
        });
    }
}
