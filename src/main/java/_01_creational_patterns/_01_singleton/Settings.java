package _01_creational_patterns._01_singleton;

public class Settings {

    // private 생성자 & public static 메소드 사용하는 방법
    private static Settings instance;   // 클래스 내부 하나만 유지

    private Settings() {}   // new 사용 못하도록 생성자 private

    public static Settings getInstance() {  // 인스턴스 획득 위한 getInstance
        if (instance == null) {     // 처음에만 객체 생성
            instance = new Settings();
        }

        return instance;
    }
}
