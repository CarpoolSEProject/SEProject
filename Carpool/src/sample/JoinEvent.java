package sample;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class JoinEvent extends Event {

//    @ManyToOne
//    private Passenger Passenger;
    private String Passenger;

    public JoinEvent(String Driver, String From, String To,String Date, String Time, String CarType, Integer SeatLeft, int[] LocationWaiting, String Passenger) {
       super(Driver, From, To, Date, Time, CarType, SeatLeft, LocationWaiting);
        this.Passenger = Passenger;
    }

    public String getPassenger() { return Passenger; }

    public void setPassenger(String Passenger) { this.Passenger = Passenger; }
}
