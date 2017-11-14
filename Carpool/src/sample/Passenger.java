package sample;

import javax.persistence.*;

@Entity
public class Passenger extends Person {

    @OneToMany(cascade=CascadeType.ALL, mappedBy="Passenger")
    public JoinEvent PassengerEvent;

    public Passenger(String Username, String Password, String Email, String Name, String Gender, Integer Age, String PhoneNo) {
        super(Username, Password, Email, Name, Gender, Age, PhoneNo);
    }

    public JoinEvent getPassengerEvent() {
        return PassengerEvent;
    }

    public void setPassengerEvent(JoinEvent passengerEvent) {
        PassengerEvent = passengerEvent;
    }
}
