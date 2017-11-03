package sample;

import javax.persistence.Entity;

@Entity
public class PrivateCar extends Car {

    public PrivateCar() {
//        super.typeName = "Private Car";
//        super.seatNo = 4;
    }

    @Override
    public String getTypeName() {
        return "Private Car";
    }

    @Override
    public int getSeatNo() {
        return 4;
    }
}
