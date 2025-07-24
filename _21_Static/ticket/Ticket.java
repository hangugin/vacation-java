package com.study._21_Static.ticket;

public class Ticket {
    private static int nextNum = 1; // 모든 ticket들이 공유
    private int num;

    public Ticket() {
        this.num = nextNum;
        nextNum++;
        System.out.println("번호표 발급! 번호표: " + num);
    }

    public int getNum() {
        return num;
    }
}
