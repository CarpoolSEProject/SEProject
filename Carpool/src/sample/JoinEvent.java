package sample;

import javax.persistence.Entity;

@Entity
public class JoinEvent {

    public static Event event;

    public JoinEvent() {

    }

    public static Event getEvent() {
        return event;
    }

    public static void setEvent(Event event) {
        JoinEvent.event = event;
    }
}
