package com.maxwit.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println(list.isEmpty());
        list.insert(1, "心");
        list.insert(2, "心心");
        list.add("心心心");
        list.add("心心心心");
        list.add("心心心心心");
        list.add("心心心心心心");
        System.out.println(list.isEmpty());

        list.traversal((d) -> {
            System.out.println(d);
        });

        System.out.println(list.get(3));
        System.out.println(list.set(5, "心心心"));
        System.out.println(list.getSize());

        list.insert(1, "心");
        list.insert(-1, "-----");
        list.insert(10, "=====");

        System.out.println(list.contains("心心心"));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("前后比较-----------");
        list.remove(0);
        list.remove(8);

        list.removeAll("心心");
        System.out.println(list.contains("心心"));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
