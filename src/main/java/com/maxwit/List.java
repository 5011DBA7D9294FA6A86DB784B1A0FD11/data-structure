package com.maxwit;

class List<T> {
    static final int capacity = 100;
    int size = 0;

    Data<?>[] listData = new Data[capacity];

    public int length() {
        return this.size;
    }

    public boolean insert(T value) {
        if (this.size >= capacity) {
            return false;
        }

        Data<T> data = new Data<>(value);
        this.listData[this.size] = data;
        this.size++;
        return true;
    }

    public void traversal() {
        int i;
        for (i = 0; i < this.size; i++) {
            System.out.println(this.listData[i].data);
        }
    }
}
