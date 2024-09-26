package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float t = scanner.nextFloat();

        double tail = t % 3;
        System.out.println(tail);

    }
}