package _01_creational_patterns._01_singleton;

// double checked locking

public class Settings3 {

    private static volatile Settings3 instance;

    private Settings3() { }

    public static Settings3 getInstance() {
        if (instance == null) {     // 첫 번째 체크
            synchronized (Settings3.class) {    // 락
                if (instance == null) {     // 두 번째 체크
                    instance = new Settings3();
                }
            }
        }

        return instance;
    }

}
