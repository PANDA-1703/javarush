package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int first, second, third;
        if (a >= b && a >= c){
            first = a;
            if (b >= c){
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }

        } else if (b >= a && b >= c) {
            first = b;
            if (a >= c){
                second = a;
                third = c;
            } else {
                second = c;
                third = a;
            }
        } else {
            first = c;
            if (a >= b){
                second = a;
                third = b;
            } else {
                second = b;
                third = a;
            }
        }



        System.out.println(first + " " + second + " " + third);


    }
}
