package sample;

import javax.persistence.Entity;


@Entity
public class PrivateCar extends Car {

    @Override
    public String getTypeName() {
        return "Private Car";
    }

    @Override
    public int getSeatNo() {
        return 4;
    }
}
