package com.study._13_Array;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        // Arrays - 복사/ 값출력(String 으로)/ 정렬

        int[] orignal = {1,2,3,4,5};

        // Arrays.toString(배열) -> 배열의 내용물을 문자열로 바꿔준다
        System.out.println(Arrays.toString(orignal));

        // 얕은복사
        int[] shallowCopy = orignal; // stack에 있는 메모리주소를 복사
        // 깊은복사 // heap에 있는 실제 값들도 새 메모리에 할당해서 복사
        int[] deepCopy = Arrays.copyOf(orignal, orignal.length);

        System.out.println("원본: "+ Arrays.toString(orignal));
        System.out.println("얕복: "+ Arrays.toString(shallowCopy));
        System.out.println("깊복: "+ Arrays.toString(deepCopy));

        // 원본 배열 수정
        orignal[0] = 999;
        System.out.println("원본배열 수정 됨");
        System.out.println("원본: "+ Arrays.toString(orignal));
        System.out.println("얕복: "+ Arrays.toString(shallowCopy));
        System.out.println("깊복: "+ Arrays.toString(deepCopy));

        //정렬
        int[] nums = {8,4,5,1,7,10};
        Arrays.sort(nums); // heap에 있는 데이터를 건들임
        System.out.println("오름차순 정렬: " + Arrays.toString(nums));
    }
}
