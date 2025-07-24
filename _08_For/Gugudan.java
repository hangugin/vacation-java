package com.study._08_For;

public class Gugudan {
    public static void main(String[] args) {
        System.out.println("== 구구단 ==");
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("[" + dan + "단]");
            for (int num = 1; num <= 9; num++) {
                System.out.println(dan + " x " + num + " = " + (dan * num));
            }
            System.out.println();
        }
    }
}
