package com.study._15_Method;

import java.util.Arrays;

public class Parameter2 {

    public static void changeNum(int number) {
        number += 2;
    }

    public static void changeArr(int[] arr) {
        arr[0] = 50;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("changeNum 호출 전: " + num);
        changeNum(num); // number = num
        System.out.println("changeNum 호출 후: " + num);

        // 자바에서 변수에 변수를 대입하는 경우
        // 변수의 값(stack 메모리 값)을 복사해서 대입
        /*
        stack(main)
        num: 10
        ----------
        stack(changeNum)
        number: 10 -> 12
         */

        int[] nums = {20, 30, 40};
        System.out.println("changeArr 호출 전: " + Arrays.toString(nums));
        changeArr(nums);
        System.out.println("changeArr 호출 후: " + Arrays.toString(nums));
        /*
        stack(main)
        nums : 0x0010
        --------------------
        stack(changeArr)
        arr : 0x0010
        
        heap
        0x0010: array에 대한 정보
        0x0014: 20 -> 50
        0x0018: 30
        0x0022: 40
         */
        
        // 원시자료형 -> 원본 조작 안되는구나
        // 참조자료형 -> 원본 조작이 가능하구나

    }
}
