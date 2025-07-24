package com.study._21_Static.ticket;

public class TicketMain {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        System.out.println("t1 번호: " + t1.getNum());
        System.out.println("t2 번호: " + t2.getNum());
        System.out.println("t3 번호: " + t3.getNum());
        // session관리, database연결관리
    }
}
