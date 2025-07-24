package com.study._32_Singleton;

public class Main {
    public static void main(String[] args) {
        LogManager logger1 = LogManager.getInstance();
        logger1.log("첫번째 로그");

        LogManager logger2 = LogManager.getInstance();
        LogManager logger3 = LogManager.getInstance();

        System.out.println(logger1 == logger2);
        System.out.println(logger1 == logger3);
    }
}
