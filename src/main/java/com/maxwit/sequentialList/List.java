package com.maxwit;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.function.Consumer;

class List<T> implements Iterable<T>{
    static final int capacity = 100;
    int size = 0;

    Data<?>[] listData = new Data[capacity];

    public int length() {
        return this.size;
    }

    public boolean insert(T value) {
        Data<T> data = new Data<>(value);

        try {
            this.listData[this.size] = data;
            this.size++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        }

        return true;
    }

    public void traversal(Consumer<T> visist) {
        int i;
        for (i = 0; i < this.size; i++) {
            visist.accept((T) this.listData[i].data);
        }
    }


    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int length = 0;

            @Override
            public boolean hasNext() {
                return length < size;
            }

            @Override
            public T next() {
                T current = (T) listData[length].data;
                length++;
                return current;
            }
        };
    }
}
