package _02_structural_patterns._12_proxy;

public class Client {
    public static void main(String[] args) {

        GameService gameService = new GameServiceProxy();
        gameService.startGame();

    }
}
