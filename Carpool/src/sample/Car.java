package sample;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Car {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String typeName;
    private int seatNo;

    public Car(String typeName, int seatNo) {
        this.typeName = typeName;
        this.seatNo = seatNo;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getSeatNo() {
        return seatNo;
    }
}
