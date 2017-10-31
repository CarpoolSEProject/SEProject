package sample;

public class Passenger extends Person {

    public static JoinEvent PassengerEvent;

    public Passenger() {

    }

    public static JoinEvent getPassengerEvent() {
        return PassengerEvent;
    }

    public static void setPassengerEvent(JoinEvent passengerEvent) {
        PassengerEvent = passengerEvent;
    }
}
