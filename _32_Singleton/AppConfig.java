package com.study._32_Singleton;

public class AppConfig {
    // 클래스를 싱글톤을 적용하여 구현해 주세요
    // 객체 하나만 돌려쓰게 끔!

    private static AppConfig instance;

    private String apiKey;
    private String appMode;

    // 필드가 있다면, 생성자 호출에서 주입되는게 아니라,
    // 상수처럼 고정시켜줌
    private AppConfig() {
        this.apiKey = "DEFAULT-KEY";
        this.appMode = "DARK_MODE";
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public void printConfigInfo() {
        System.out.println("api-key: " + apiKey);
        System.out.println("app-mode: " + appMode);
    }

}
