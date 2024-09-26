package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();

        if (n1.equals(n2)) {
            System.out.println("Имена идентичны");
        } else if (n1.length() == n2.length()) {
            System.out.println("Длины имен равны");
        }

    }
}
