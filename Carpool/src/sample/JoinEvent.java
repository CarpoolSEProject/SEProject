package sample;


import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class JoinEvent {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer joinEventID;

    @ManyToOne
    private Event event;

    private String passenger;


    public JoinEvent(String passenger, Event event) {
        this.passenger = passenger;
        this.event = event;
    }

    public String getPassenger() { return passenger; }

    public void setPassenger(String passenger) { this.passenger = passenger; }

    public Event getEvent() {
        return event;
    }

    public String getPassenger() {
        return passenger;
    }
}
