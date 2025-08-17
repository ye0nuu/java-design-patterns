package _03_behavioral_patterns._18_memento;

public class Game {

    // 오리지네이터

    private int redTeamScore;
    private int blueTeamScore;

    public int getRedTeamScore() {
        return redTeamScore;
    }
    public void setRedTeamScore(int redTeamScore) {
        this.redTeamScore = redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }
    public void setBlueTeamScore(int blueTeamScore) {
        this.blueTeamScore = blueTeamScore;
    }

    // 상태 저장
    public GameSave save() {
        return new GameSave(this.blueTeamScore, this.redTeamScore);
    }

    // 저장된 상태로 복원
    public void restore(GameSave gameSave) {
        this.blueTeamScore = gameSave.getBlueTeamScore();
        this.redTeamScore = gameSave.getRedTeamScore();
    }

}
