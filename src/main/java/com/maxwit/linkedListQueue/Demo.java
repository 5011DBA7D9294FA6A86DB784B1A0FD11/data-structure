package com.maxwit.linkedListQueue;

public class Demo {
    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();

        queue.insert(11);
        queue.insert(22);
        queue.insert(33);
        queue.insert(44);
        queue.insert(55);

        queue.traversal((d) -> {
            System.out.println(d);
        });

        queue.remove();
        queue.remove();

        System.out.println(queue.peek());

        queue.traversal((d) -> {
            System.out.println(d);
        });
    }
}
