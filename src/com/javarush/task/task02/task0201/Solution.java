package com.javarush.task.task02.task0201;

/* 
Реализуем метод print
*/

public class Solution {

    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String text) {
        int i = 0;
        while (i < 4) {
            i++;
            System.out.println(text);
        }
    }
}
