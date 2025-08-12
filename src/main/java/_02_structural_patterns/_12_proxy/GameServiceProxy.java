package _02_structural_patterns._12_proxy;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    @Override
    public void startGame() {
        // 수행시간 측정
        long before = System.currentTimeMillis();

        // 지연초기화
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }

}
