package sample;

import javax.persistence.Entity;

@Entity
public class Motorcycle extends Car {

    public Motorcycle() {
//        super.typeName = "Motocycle";
//        super.seatNo = 2;
    }

    @Override
    public String getTypeName() {
        return "Motocycle";
    }

    @Override
    public int getSeatNo() {
        return 2;
    }
}
