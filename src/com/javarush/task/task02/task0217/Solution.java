package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        a = min(a,b);
        b = min(c,d);
        c = min (a,b);

        return c;
    }

    public static int min(int a, int b) {
        int min;
        if (a <= b)
            min = a;
        else
            min = b;

        return min;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
