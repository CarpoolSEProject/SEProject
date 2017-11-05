package sample;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String Username;
    private String Password;
    private String Email;
    private String Name;
    private String Gender;
    private Integer Age;
    private String PhoneNo;

    public Person(String Username, String Password, String Email, String Name, String Gender, Integer Age, String PhoneNo) {
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
        this.PhoneNo = PhoneNo;
    }

    public Integer getId() { return id; }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public Integer getAge() {
        return Age;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }
}
