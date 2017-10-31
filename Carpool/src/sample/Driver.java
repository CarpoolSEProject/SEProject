package sample;

public class Driver extends Person {

    public static String carType;
    public static String carLicense;
    public static String Rating;
    public static Event DriverEvent;

    public Driver() {

    }

    public static String getCarType() {
        return carType;
    }

    public static void setCarType(String carType) {
        Driver.carType = carType;
    }

    public static String getCarLicense() {
        return carLicense;
    }

    public static void setCarLicense(String carLicense) {
        Driver.carLicense = carLicense;
    }

    public static String getRating() {
        return Rating;
    }

    public static void setRating(String rating) {
        Rating = rating;
    }
}
