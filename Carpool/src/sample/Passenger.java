package sample;

public class Passenger extends Person {

    public static JoinEvent PassengerEvent;

    public Passenger(String Username, String Password, String Email, String Name, String Gender, Integer Age, String PhoneNo) {
        super(Username, Password, Email, Name, Gender, Age, PhoneNo);
    }

    public static JoinEvent getPassengerEvent() {
        return PassengerEvent;
    }

    public static void setPassengerEvent(JoinEvent passengerEvent) {
        PassengerEvent = passengerEvent;
    }
}
