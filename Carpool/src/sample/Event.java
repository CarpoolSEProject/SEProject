package sample;


import javax.persistence.*;


import java.util.List;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.EAGER;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer EventID;
    @ManyToOne
    public String Driver;

    @OneToMany (cascade=CascadeType.ALL, mappedBy="event")
    private List<JoinEvent> JoinEvent;

    public String From;
    public String To;
    @Temporal(TemporalType.DATE)
    public String Date;
    public String Time;
    @OneToOne (fetch=EAGER, cascade=PERSIST)
    public String CarType;
    public Integer SeatLeft;
    public int[] LocationWaiting;


    public Event(String Driver, String From, String To,String Date, String Time, String CarType, Integer SeatLeft, int[] LocationWaiting) {
        this.Driver = Driver;
        this.From = From;
        this.To = To;
        this.Date = Date;
        this.Time = Time;
        this.CarType = CarType;
        this.SeatLeft = SeatLeft;
        this.LocationWaiting = LocationWaiting;
    }

    public Integer getEventID() {
        return EventID;
    }

    public String getDriver() {
        return Driver;
    }

    public List<sample.JoinEvent> getJoinEvent() {
        return JoinEvent;
    }

    public String getFrom() {
        return From;
    }

    public String getTo() {
        return To;
    }

    public String getDate() {
        return Date;
    }


    public String getTime() {
        return Time;
    }


    public String getCarType() {
        return CarType;
    }

    public Integer getSeatLeft() {
        return SeatLeft;
    }

    public void setSeatLeft(Integer seatLeft) {
        SeatLeft = seatLeft;
    }

    public int[] getLocationWaiting() {
        return LocationWaiting;
    }

    public void addJoinEvent(sample.JoinEvent joinEvent) {
        JoinEvent.add(joinEvent);
    }
}
