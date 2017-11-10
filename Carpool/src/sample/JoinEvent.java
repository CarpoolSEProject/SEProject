package sample;

import com.objectdb.o.INT;

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

    public JoinEvent(Integer joinEventID, String Passenger) {
        this.joinEventID = joinEventID;
        this.Passenger = Passenger;
    }

    public String getPassenger() { return Passenger; }

    public void setPassenger(String Passenger) { this.Passenger = Passenger; }

    public Event getEvent() {
        return event;
    }

}

//j.getEvent.get ...