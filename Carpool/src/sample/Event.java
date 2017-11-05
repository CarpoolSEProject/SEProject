package sample;

import com.objectdb.o.TOL;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Event {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer EventID;
    @ManyToOne
    public String Driver;
//    @OneToMany(cascade=CascadeType.ALL, mappedBy="event")
//    private JoinEvent JoinEvent;
    public String From;
    public String To;
    @Temporal(TemporalType.DATE)
    public String TimetoArrive;
    public Car CarType;
    public Integer SeatLeft;
    public int[] LocationWaiting;
    //public String Notice;

    public Event(String Driver, String From, String To, String TimetoArrive, Car CarType, Integer SeatLeft, int[] LocationWaiting) {
        this.Driver = Driver;
//        this.JoinEvent = JoinEvent;
        this.From = From;
        this.To = To;
        this.TimetoArrive = TimetoArrive;
        this.CarType = CarType;
        this.SeatLeft = SeatLeft;
        this.LocationWaiting = LocationWaiting;
    }

    public Integer getEventID() {
        return EventID;
    }

    public void setEventID(Integer eventID) { EventID = eventID; }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) { Driver = driver; }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getTimetoArrive() {
        return TimetoArrive;
    }

    public void setTimetoArrive(String timetoArrive) {
        TimetoArrive = timetoArrive;
    }

    public Car getCarType() {
        return CarType;
    }

    public void setCarType(Car carType) {
        CarType = carType;
    }

    public int getSeatLeft() {
        return SeatLeft;
    }

    public void setSeatLeft(int seatLeft) {
        SeatLeft = seatLeft;
    }

    public int[] getLocationWaiting() {
        return LocationWaiting;
    }

    public void setLocationWaiting(int[] locationWaiting) {
        LocationWaiting = locationWaiting;
    }

//    public String getNotice() {
//        return Notice;
//    }
//
//    public void setNotice(String notice) {
//        Notice = notice;
//    }
}
