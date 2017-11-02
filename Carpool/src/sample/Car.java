package sample;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Car {
    public static String typeName;
    public static int seatNo;

    public Car() {

    }

    public static String getTypeName() {
        return typeName;
    }

    public static int getSeatNo() {
        return seatNo;
    }
}
