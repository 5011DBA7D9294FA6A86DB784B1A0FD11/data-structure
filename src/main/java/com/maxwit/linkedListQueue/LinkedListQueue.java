package com.maxwit.linkedListQueue;

import com.maxwit.linkedList.LinkedList;

public class LinkedListQueue<T> extends LinkedList<T> {
    public LinkedListQueue() {
    }

    public void insert(T data) {
        insert(size+1, data);
    }

    public T remove() {
        if (isEmpty()) {
            return null;
        }

        return remove(0);
    }

    public T peek() {
        return get(0);
    }
}
