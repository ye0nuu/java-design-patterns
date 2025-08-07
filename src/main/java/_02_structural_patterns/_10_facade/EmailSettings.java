package _02_structural_patterns._10_facade;

public class EmailSettings {

    // 이메일 전송에 필요한 설정 정보

    private String host;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
}
