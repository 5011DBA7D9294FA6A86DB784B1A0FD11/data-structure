package com.maxwit.bracketMatching;

public class Demo {
    public static void main(String[] args) {
        BracketMatch bracketMatch = new BracketMatch();

        String str = "(12[]{2})";
        char[] arr = str.toCharArray();
        System.out.println(bracketMatch.match(arr));
    }
}
