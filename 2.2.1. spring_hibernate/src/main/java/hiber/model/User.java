package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
//        @OneToOne (mappedBy = "id")
//    @MapsId
//    @JoinColumn(name = "car_id", referencedColumnName = "id")
//   private Car user_car;

    public User() {
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    //мои тесты


//    public User(String firstName, String lastName, String email, Car user_car) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.user_car = user_car;
//    }
//
//    public Car getUser_car() {
//        return user_car;
//    }
//
//    public void setUser_car(Car user_car) {
//        this.user_car = user_car;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
