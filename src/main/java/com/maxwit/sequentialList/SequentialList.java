package com.maxwit;

public class SequentialList {
    public static void main(String[] args) {
        List<String> list = new List<>();

        System.out.println(list.isEmpty());
        list.insert(0, "开心");
        list.insert(1, "你好");
        list.insert(2, "kaixin");
        list.insert(3,"nihao");
        list.insert(1, "你好");
        System.out.println(list.isEmpty());

        list.traversal((d) -> {
            System.out.println(d);
        });

        System.out.println("remove :" + list.remove(3));

        System.out.println(list.contains("你好"));
        list.set(2, "reset");
        list.removeAll("你好");


        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list.get(0));
    }
}
