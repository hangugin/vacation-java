package com.study._30_Wrapper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 자바 외부로 부터 들어온 데이터는 "문자열"
        String[] InputedScore = {"85", "90", "78", "96", "88"};

        // 이 문자열배열을 모두 Integer배열로 변환(for문 사용)
        // for문을 통해 최고점, 최저점을 Integer 메서드를 사용해서 구해보세요

        Integer[] scores = new Integer[InputedScore.length];
        for(int i = 0; i < InputedScore.length; i++) {
            scores[i] = Integer.valueOf(InputedScore[i]);
        }

        Integer maxScore = scores[0];
        Integer minScore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            maxScore = Integer.max(maxScore, scores[i]);
            minScore = Integer.min(minScore, scores[i]);
        }
        System.out.println(Arrays.toString(scores));
        System.out.println(maxScore);
        System.out.println(minScore);
    }
}
