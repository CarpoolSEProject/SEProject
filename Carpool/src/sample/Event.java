package sample;


import javax.persistence.*;


import java.util.List;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.EAGER;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer eventID;
    @ManyToOne
    public String driver;

    @OneToMany (cascade=CascadeType.ALL, mappedBy="event")
    private List<JoinEvent> joinEvent;

    public String from;
    public String to;
    @Temporal(TemporalType.DATE)
    public String date;
    public String time;
//    @OneToOne (fetch=EAGER, cascade=PERSIST)
    public String carType;
    public Integer seatLeft;
    public int[] locationWaiting;


    public Event(String driver, String from, String to,String date, String time, String carType,
                 Integer seatLeft, int[] locationWaiting) {
        this.driver = driver;
        this.from = from;
        this.to = to;
        this.date = date;
        this.time = time;
        this.carType = carType;
        this.seatLeft = seatLeft;
        this.locationWaiting = locationWaiting;
    }

    public Integer getEventID() {
        return eventID;
    }

    public String getDriver() {
        return driver;
    }

    public List<sample.JoinEvent> getJoinEvent() {
        return joinEvent;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDate() {
        return date;
    }


    public String getTime() {
        return time;
    }


    public String getCarType() {
        return carType;
    }

    public Integer getSeatLeft() {
        return seatLeft;
    }

    public void setSeatLeft(Integer seatLeft) {
        this.seatLeft = seatLeft;
    }

    public int[] getLocationWaiting() {
        return locationWaiting;
    }

    public void addJoinEvent(sample.JoinEvent joinEvent) {
        this.joinEvent.add(joinEvent);
    }
}
