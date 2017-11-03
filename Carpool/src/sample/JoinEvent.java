package sample;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.util.Date;

@Entity
public class JoinEvent extends Event {

    @ManyToOne
    private Passenger Passenger;

    public JoinEvent(Driver Driver, String From, String To, Date TimetoArrive, Car CarType, Integer SeatLeft, String[] LocationWaiting, Passenger Passenger) {
       super(Driver, From, To, TimetoArrive, CarType, SeatLeft, LocationWaiting);
        this.Passenger = Passenger;
    }

    public Passenger getPassenger() { return Passenger; }

    public void setPassenger(Passenger Passenger) { this.Passenger = Passenger; }
}
