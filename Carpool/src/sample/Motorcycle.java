package sample;

import javax.persistence.Entity;


@Entity
public class Motorcycle extends Car {


    @Override
    public String getTypeName() {
        return "Motorcycle";
    }

    @Override
    public int getSeatNo() {
        return 2;
    }
}
