package _03_behavioral_patterns._17_mediator;

import java.time.LocalDateTime;

public class Restaurant {

    private CleaningService cleaningService = new CleaningService();

    public void dinner(Integer id, LocalDateTime dateTime) {

    }

    public void clean() {
//        cleaningService.clean(this);
    }

}
