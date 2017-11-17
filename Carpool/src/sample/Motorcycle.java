package sample;

import javax.persistence.Entity;


@Entity
public class Motorcycle extends Car {



    public Motorcycle(String typeName, int seatNo) {
        super(typeName,seatNo);
    }

//    @Override
//    public String getTypeName() {
//        return super.getTypeName();
//    }
//
//    @Override
//    public int getSeatNo() {
//        return super.getSeatNo();
//    }
}
