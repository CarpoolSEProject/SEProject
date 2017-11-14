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

    @OneToOne (mappedBy="JoinEvent")
    private Event event;

    private String Passenger;

    private String eventJoined;

    public JoinEvent(String Passenger, String eventJoined) {
        this.Passenger = Passenger;
        this.eventJoined = eventJoined;
    }

    public String getPassenger() { return Passenger; }

    public void setPassenger(String Passenger) { this.Passenger = Passenger; }

    public Event getEvent() {
        return event;
    }

    public String getEventJoined() {
        return eventJoined;
    }
}

//j.getEvent.get ...