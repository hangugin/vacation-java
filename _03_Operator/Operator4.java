package com.study._03_Operator;

public class Operator4 {
    public static void main(String[] args) {
        // 논리연산자
        // &&(and) : 둘 다 true일 때 true
        int age = 25;
        boolean hasLicense = true;

        boolean canDrive = (age >= 18) && hasLicense;
        System.out.println("운전 가능? :" + canDrive);

        // ||(or) : 둘 중 하나라도 true 이면 true
        boolean isWeekend = true;
        boolean isHoliday = false;

        boolean isRestDay = isWeekend || isHoliday;
        System.out.println("쉬는날? :" + isRestDay);

        // !(not) : !ture -> false / !false -> true
        boolean isOnline = true;
        boolean isOffline = !isOnline;

    }
}
