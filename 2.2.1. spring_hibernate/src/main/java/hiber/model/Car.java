package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String model;

    @Column
    private int series;
//    @OneToOne //(mappedBy = "car")
//    @JoinColumn(name = "id")
//    @MapsId
//    @JoinColumn(name = "user_id")
//    private User user;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

//    public Car(String model, int series, User user) {
//        this.model = model;
//        this.series = series;
//        this.user = user;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

}


