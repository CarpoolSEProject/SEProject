package sample;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class JoinEvent extends Event {

    @ManyToOne
    private Passenger Passenger;

    public JoinEvent() {

    }

    public Passenger getPassenger() { return Passenger; }

    public void setPassenger(Passenger Passenger) { this.Passenger = Passenger; }
}
