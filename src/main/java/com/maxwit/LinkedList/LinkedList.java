package com.maxwit.LinkedList;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList<T> implements Iterable<T>{
    Node<T> node = new Node<>();

    public LinkedList() {
    }

    public void insert(T data) {
        if (node.data == null) {
            node = new Node<T>(data);
            return;
        }

        Node<T> tmp = node;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = new Node<T>(data);
    }

    public int getSize() {
        int length = 0;
        Node<T> tmp = node;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }

    public void traversal(Consumer<T> visist) {
        Node<T> tmp = node;
        while (tmp != null) {
            visist.accept(tmp.data);
            tmp = tmp.next;
        }
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> tmp = node;

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
