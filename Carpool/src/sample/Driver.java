package sample;

import javax.persistence.*;

@Entity
public class Driver extends Person {

    private String carType;
    private String carLicense;
    private String Rating;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="Driver")
    private Event DriverEvent;


    public Driver(String Username, String Password, String Email, String Name, String Gender, Integer Age, String PhoneNo,String carType, String carLicense, String Rating, Event DriverEvent) {
        super(Username, Password, Email, Name, Gender, Age, PhoneNo);
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
