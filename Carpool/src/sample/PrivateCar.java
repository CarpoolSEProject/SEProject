package sample;

import javax.persistence.Entity;

@Entity
public class PrivateCar extends Car {

    public PrivateCar(String typeName, int seatNo) {
        super(typeName,seatNo);
    }

//    @Override
//    public String getTypeName() {
//        return "Private Car";
//    }
//
//    @Override
//    public int getSeatNo() {
//        return 4;
//    }
}
