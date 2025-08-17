package _03_behavioral_patterns._18_memento;

public class GameSave {
    
    // 메멘토 -> 상태 저장

    private final int blueTeamScore;
    private final int redTeamScore;

    public GameSave(int blueTeamScore, int redTeamScore) {
        this.blueTeamScore = blueTeamScore;
        this.redTeamScore = redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }
    public int getRedTeamScore() {
        return redTeamScore;
    }

}
