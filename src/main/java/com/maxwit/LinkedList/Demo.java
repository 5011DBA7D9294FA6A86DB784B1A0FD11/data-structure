package com.maxwit.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.insert("心");
        list.insert("心心");
        list.insert("心心xin");
        list.insert("心心xxxxxx");

        list.traversal((d) -> {
            System.out.println(d);
        });
        System.out.println(list.getSize());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
