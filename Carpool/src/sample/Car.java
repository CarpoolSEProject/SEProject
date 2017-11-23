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


    public String getTypeName() {
        return typeName;
    }

    public int getSeatNo() {
        return seatNo;
    }
}
