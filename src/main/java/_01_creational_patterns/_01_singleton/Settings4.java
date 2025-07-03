package _01_creational_patterns._01_singleton;

// static inner 클래스 홀더

public class Settings4 {

    private Settings4() { }

    private static class Settings4Holder {
        private static final Settings4 INSTANCE = new Settings4();  // 단 한 번만 생성
    }

    public static Settings4 getInstance() {
        return Settings4Holder.INSTANCE;    // 호출 시점에 클래스 로딩
    }

}
