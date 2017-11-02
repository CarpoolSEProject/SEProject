package sample;

public class Driver extends Person {

    private String carType;
    private String carLicense;
    private String Rating;
    private Event DriverEvent;

    public Driver() {

    }

    public Driver(String carType, String carLicense, String Rating, Event DriverEvent) {
        this.carType = carType;
        this.carLicense = carLicense;
        this.Rating = Rating;
        this.DriverEvent = DriverEvent;
    }

    public String getCarType() { return carType; }

    public String getCarLicense() { return carLicense; }

    public String getRating() { return Rating; }

    public Event getDriverEvent() { return DriverEvent; }
}
