package com.study._31_NestedClass.nested_inner;

public class Question {
    // Question 시험문제 클래스
    // 문제 -> 객관식선택지(4개)

    /*
    inner class
    - static이 없음
        -> 바깥 클래스의 인스턴에 소속 됨
        -> 바깥 객체가 생성되어야 내부 객체를 생성 할 수 있다.

    언제 사용하는가?
    1. 특정 클래스가 오직 하나의 클래스 안에서만 사용 될 때
    - 선택지는 문제가 없으면 존재할 의미가 없음
    2. 두 클래스가 긴밀하게 연관되어 생명주기가 동일할 때
    - 문제와 선택지는 사실상 같이 생성되고 같이 소멸된다.

    두 객체의 생명주기가 동일한지 안한지 판단방법:
    외부 메서드, 클래스 필드로서 두 객체가 정말 같이 따라다니는지 확인
     */

    private String questionText; // 문제 내용
    private int questionNumber; // 문제 번호
    private int correctAnswer; // 정답번호
    private Choice[] choices;

    public Question( int questionNumber, String questionText) {
        this.questionText = questionText;
        this.questionNumber = questionNumber;
        this.choices = new Choice[4]; // 빈 배열
    }

    // 선택지 추가하는 메서드 정의
    // 몇번째 자리에 어떤 선택지를 넣을지 지정할 수 있게 만들 것
    public void addChoice(int index, String choiceText) {
        if (index >= 0 && index < 4) {
            choices[index] = new Choice(index + 1, choiceText);
            // 번호는 1부터 시작하게끔
            // 1) 선택지 내용
            // 2) 선택지 내용
        }
    }

    public void printQuestion() {
        System.out.println("문제 " + questionNumber + ": " + questionText);
        System.out.println("=".repeat(50));
        // 문제 1: ~올바른것을 고르시오
        // ==========================

        for (Choice choice : choices) {
            if(choice != null) {
                choice.printChoice();
                // 1) ~~
                // 2) ~~
            }
        }
        System.out.println();
    }

    class Choice {
        private String text; // 선택지 내용
        private int number; // 몇번 선택지 번호

        private Choice(int number, String text) {
            this.text = text;
            this.number = number;
        }

        public void printChoice() {
            System.out.println(number + ") " + text); // 1) ~이다

            // inner 클래스는 바깥 클래스의 인스턴스 필드도 접근이 가능하다.
            // private 필드도 같은 클래스 내부이므로 접근 가능하다.
//            System.out.println(questionNumber);
//            System.out.println(questionText);
        }


    }
}
