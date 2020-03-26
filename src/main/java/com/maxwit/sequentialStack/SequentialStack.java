package com.maxwit.sequentialStack;

import com.maxwit.sequentialList.SequentialList;

public class SequentialStack<T> extends SequentialList<T>{
    public SequentialStack() {
    }

    public void push(T data) {
        insert(size+1, data);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        return remove(size-1);
    }

    public T peek() {
        return get(size-1);
    }
}
