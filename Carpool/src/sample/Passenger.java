package sample;

import javax.persistence.*;

@Entity
public class Passenger extends Person {

    @OneToMany(cascade=CascadeType.ALL, mappedBy="Passenger")
    public JoinEvent PassengerEvent;

    public Passenger(String username, String password, String email, String name, String gender, Integer age, String phoneNo) {
        super(username, password, email, name, gender, age, phoneNo);
    }

    public JoinEvent getPassengerEvent() {
        return PassengerEvent;
    }

    public void setPassengerEvent(JoinEvent passengerEvent) {
        PassengerEvent = passengerEvent;
    }
}
