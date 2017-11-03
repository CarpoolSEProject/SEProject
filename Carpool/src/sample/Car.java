package sample;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Car {
    private String typeName;
    private int seatNo;

    public Car() {

    }

    public String getTypeName() {
        return typeName;
    }

    public int getSeatNo() {
        return seatNo;
    }
}
