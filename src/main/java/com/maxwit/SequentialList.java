package com.maxwit;

public class SequentialList {
    public static void main(String[] args) {
        List<String> list = new List<>();

        list.insert("开心");
        list.insert("你好");
        list.insert("kaixin");
        list.insert("nihao");

        list.traversal();
    }
}
