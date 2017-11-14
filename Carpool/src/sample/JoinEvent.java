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

    private String Passenger;


    public JoinEvent(String Passenger, Event event) {
        this.Passenger = Passenger;
        this.event = event;
    }

    public String getPassenger() { return Passenger; }

    public void setPassenger(String Passenger) { this.Passenger = Passenger; }

    public Event getEvent() {
        return event;
    }


}

//j.getEvent.get ...