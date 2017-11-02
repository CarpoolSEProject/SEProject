package sample;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Event {

    public static String EventID;
    public static String DriverName;
    public static String DriverPhone;
    public static String From;
    public static String To;
    @Temporal(TemporalType.DATE)
    public static Date TimetoArrive;
    public static Car CarType;
    public static int SeatLeft;
    public static String LocationWaiting;
    public static String Notice;

    public Event() {

    }

    public static String getEventID() {
        return EventID;
    }

    public static void setEventID(String eventID) {
        EventID = eventID;
    }

    public static String getDriverName() {
        return DriverName;
    }

    public static void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public static String getDriverPhone() {
        return DriverPhone;
    }

    public static void setDriverPhone(String driverPhone) {
        DriverPhone = driverPhone;
    }

    public static String getFrom() {
        return From;
    }

    public static void setFrom(String from) {
        From = from;
    }

    public static String getTo() {
        return To;
    }

    public static void setTo(String to) {
        To = to;
    }

    public static Date getTimetoArrive() {
        return TimetoArrive;
    }

    public static void setTimetoArrive(Date timetoArrive) {
        TimetoArrive = timetoArrive;
    }

    public static Car getCarType() {
        return CarType;
    }

    public static void setCarType(Car carType) {
        CarType = carType;
    }

    public static int getSeatLeft() {
        return SeatLeft;
    }

    public static void setSeatLeft(int seatLeft) {
        SeatLeft = seatLeft;
    }

    public static String getLocationWaiting() {
        return LocationWaiting;
    }

    public static void setLocationWaiting(String locationWaiting) {
        LocationWaiting = locationWaiting;
    }

    public static String getNotice() {
        return Notice;
    }

    public static void setNotice(String notice) {
        Notice = notice;
    }
}
