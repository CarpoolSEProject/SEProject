package sample;

import javax.persistence.*;

@Entity
public class Driver extends Person {

    private String carType;
    private String carLicense;
    private String rating;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="driver")
    private Event driverEvent;


    public Driver(String username, String password, String email, String name, String gender, Integer age, String phoneNo,
                  String carType, String carLicense, String rating, Event driverEvent) {
        super(username, password, email, name, gender, age, phoneNo);
        this.carType = carType;
        this.carLicense = carLicense;
        this.rating = rating;
        this.driverEvent = driverEvent;
    }

    public String getCarType() { return carType; }

    public String getCarLicense() { return carLicense; }

    public String getRating() { return rating; }

    public Event getDriverEvent() { return driverEvent; }


}
