package sample;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class JoinEvent extends Event {

    @ManyToOne
    private Passenger Passenger;

    public JoinEvent(String Driver, String From, String To,String Date, String Time, String CarType, Integer SeatLeft, int[] LocationWaiting, Passenger Passenger) {
       super(Driver, From, To, Date, Time, CarType, SeatLeft, LocationWaiting);
        this.Passenger = Passenger;
    }

    public Passenger getPassenger() { return Passenger; }

    public void setPassenger(Passenger Passenger) { this.Passenger = Passenger; }
}
