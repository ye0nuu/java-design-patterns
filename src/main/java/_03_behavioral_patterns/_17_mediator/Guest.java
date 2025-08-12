package _03_behavioral_patterns._17_mediator;

import java.time.LocalDateTime;

public class Guest {

    private Integer id;
    private FrontDesk frontDesk = new FrontDesk();

    public void getTower(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    private void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
