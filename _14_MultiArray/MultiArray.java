package com.study._14_MultiArray;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        /*
        다차원 배열
        - 1차원 배열에 차원이 더 추가된 배열
        - 한차원이 추가된 2차원 배열은 행(row)과 열(column)로 구성되었다고 일반화 가능
        - (x,y)좌표, 엑셀 표와 같은 구조다.
         */

        // 영화관 좌석
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 2차원 배열 선언/초기화
        String[][] seats = new String[][] {
                seatA,
                seatB,
                seatC
        };

        // 3x5
        // [ [],[],[] ]
        String[][] seats2 = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // 데이터 접근
        // seats2의 index1인 배열에 접근
        String[] bRow = seats2[1];
        System.out.println(Arrays.toString(bRow));
        // B3 접근
        System.out.println(bRow[2]);
        // 한번에
        System.out.println(seats2[1][2]);

        // c4한번에 접근
        System.out.println(seats2[2][3]);

        /*
        String[][] seats = new String[][] { {"A1"..},{..."C5"} }

        stack(main)
        seats: 0x1000

        heap
        0x1000: 배열에 대한정보
        0x1002: 0x2000 -> aRow의 배열 주소
        0x1004: 0x3000 -> bRow의 배열 주소
        0x1006: 0x4000 -> cRow의 배열 주소

        0x2000: aRow에 대한 정보
        0x2004: "A1"의 주소
        ..
        0x2020: "A5"의 주소
         */

        System.out.println(Arrays.toString(seats2));

        // Arrays.deepToString()
        System.out.println(Arrays.deepToString(seats2));
    }
}
