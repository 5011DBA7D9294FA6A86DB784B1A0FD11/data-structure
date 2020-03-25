package com.maxwit.linkedList;

public class Node<T> {
    Node<T> next = null;
    T data;

    public Node() {
        this.data = null;
    }

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
}
