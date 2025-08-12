package _02_structural_patterns._12_proxy;

public class DefaultGameService implements GameService {

    // 실제 게임 서비스 로직 담당

    @Override
    public void startGame() {
        System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
    }

}
