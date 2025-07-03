package _01_creational_patterns._01_singleton;

public class Settings2 {

    private static Settings2 instance;

    private Settings2() {}

    public static synchronized Settings2 getInstance() {    // 한 번에 하나의 스레드만 메서드 실행 가능하도록
        if (instance == null) {
            instance = new Settings2();
        }

        return instance;
    }

}
