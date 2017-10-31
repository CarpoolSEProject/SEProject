package sample;

public class Event {

    public static String EventID;
    public static String DriverName;
    public static String DriverPhone;
    public static String From;
    public static String To;
    public static String TimetoArrive;
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

    public static String getTimetoArrive() {
        return TimetoArrive;
    }

    public static void setTimetoArrive(String timetoArrive) {
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
