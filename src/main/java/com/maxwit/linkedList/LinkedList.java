package com.maxwit.linkedList;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList<T> implements Iterable<T>{
    protected int size;
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public T get(int index) {
        if (index < 0) {
            return null;
        }

        Node<T> tmp = head;
        for (int i = 0; i < index; i++) {
            try {
                tmp = tmp.next;
            } catch (NullPointerException e) {
                System.out.println("Exception thrown :" + e);
                return null;
            }
        }

        T data = null;
        try {
            data = tmp.data;
        } catch (NullPointerException e) {
            System.out.println("Exception thrown :" + e);
        }

        return data;
    }

    public boolean set(int index, T data) {
        if (index < 0) {
            return false;
        }

        Node<T> tmp = head;
        for (int i = 0; i < index; i++) {
            try {
                tmp = tmp.next;
            } catch (NullPointerException e) {
                System.out.println("Exception thrown :" + e);
                return false;
            }
        }

        try {
            tmp.data = data;
        } catch (NullPointerException e) {
            System.out.println("Exception thrown :" + e);
            return false;
        }

        return true;
    }

    public void add(T data) {
        this.size++;
        if (head == null) {
            head = new Node<T>(data);
            tail = head;
            return;
        }

        tail.next = new Node<T>(data);
        tail = tail.next;
    }

    public void insert(int index, T data) {
        Node<T> node = new Node<>(data);

        if (index < 1) {
            return;
        }

        if (index == this.size+1) {
            add(data);
            return;
        }

        if (index == 1) {
            node.next = head;
            head = node;
            return;
        }

        int i = 2;
        Node<T> preNode = head;
        Node<T> curNode = preNode.next;
        while (preNode != null) {
            if (i == index) {
                node.next = curNode;
                preNode.next = node;
                this.size++;
                return;
            }

            try {
                preNode = preNode.next;
                curNode = curNode.next;
                i++;
            } catch (NullPointerException e) {
                System.out.println("Exception thrown :" + e);
                return;
            }
        }
    }

    public T remove(int index) {
        if (index < 0) {
            return null;
        }

        if (index == 0) {
            T data = head.data;
            head = head.next;
            this.size--;
            return data;
        }

        int i = 2;
        Node<T> preNode = head;
        Node<T> curNode = preNode.next;
        while (preNode != null) {
            if (index == this.size-1 && i-1 == index) {
                tail = preNode;
            }

            if (i-1 == index) {
                T data;
                try {
                    data = curNode.data;
                } catch (NullPointerException e) {
                    System.out.println("Exception thrown :" + e);
                    return null;
                }

                preNode.next = curNode.next;
                this.size--;
                return data;
            }

            try {
                preNode = preNode.next;
                curNode = curNode.next;
                i++;
            } catch (NullPointerException e) {
                System.out.println("Exception thrown :" + e);
                return null;
            }
        }

        return null;
    }

    public int removeAll(T data) {
        Node<T> tmp = head;
        int num = 0;
        int index = 0;

        while (tmp != null) {
            if (tmp.data == data) {
                remove(index);
                index--;
                num++;
            }

            index++;
            tmp = tmp.next;
        }

        return num;
    }

    public int contains(T data) {
        Node<T> tmp = head;
        int num = 0;
        while (tmp != null) {
            if (tmp.data == data) {
                num++;
            }
            tmp = tmp.next;
        }

        return num;
    }

    public int getSize() {
        int length = 0;
        Node<T> tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }

    public void traversal(Consumer<T> visist) {
        Node<T> tmp = head;
        while (tmp != null) {
            visist.accept(tmp.data);
            tmp = tmp.next;
        }
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> tmp = head;

            @Override
            public boolean hasNext() {
                return tmp != null;
            }

            @Override
            public T next() {
                T data = tmp.data;
                tmp = tmp.next;
                return data;
            }
        };
    }
}
