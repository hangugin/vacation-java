package com.study._13_Array;

public class Array2 {
    public static void main(String[] args) {
        // 배열 순회(반복문)

        String[] names = {"손흥민", "박지성","차두리", "차범근", "김민재", "김남일", "홍영보"};

        // for문으로 배열 순회
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            if (names[i].equals("박지성")) {
                System.out.println("맨유");
            }
        }

        // 향상된 for문(for-each)
        // 가독성 좋음, 직관적
        // 단점) 인덱스 접근이 안됨 (i 사용 불가)
        for (String name : names) {
            System.out.println(name);
        }

    }
}
