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

    public boolean isEmpty() {
        return this.size == 0;
    }

    public T get(int index) {
        try {
            return (T) this.listData[index].data;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
            return null;
        } catch (NullPointerException e) {
            System.out.println("Exception thrown :" + e);
            return null;
        }
    }

    public boolean set(int index, T value) {
        if (index >= this.size) {
            return false;
        }

        Data<T> data = new Data<>(value);

        try {
            this.listData[index] = data;
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
            return false;
        }
    }

    public void insert(int index, T value) {
        index--;
        Data<T> data = new Data<>(value);

        try {
            if (this.size == 0) {
                if (index == 0) {
                    this.listData[index] = data;
                    this.size++;
                    return;
                } else {
                    return;
                }
            }

            for (int i = this.size-1; i >= index; i--) {
                this.listData[i+1] = this.listData[i];
            }

            this.listData[index] = data;
            this.size++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        }

    }

    public T remove(int index) {
        T data = null;
        try {
            data = (T) this.listData[index].data;
        } catch (NullPointerException e) {
            System.out.println("Exception thrown :" + e);
            return data;
        }

        if (index == this.size-1) {
            this.listData[index] = null;
            this.size--;
            return data;
        }

        for (int i = index; i < this.size - 1; i++) {
            this.listData[i] = this.listData[i+1];
        }

        this.listData[this.size-1] = null;
        this.size--;

        return data;
    }

    public int removeAll(T data) {
        int num = 0;
        for (int i = this.size-1; i >= 0; i--) {
            if (this.listData[i].data == data ) {
                remove(i);
                num++;
            }
        }

        return num;
    }

    public int contains(T data) {
        int num = 0;
        for (int i = this.size-1; i >= 0; i--) {
            if (this.listData[i].data == data) {
                num++;
            }
        }

        return num;
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
