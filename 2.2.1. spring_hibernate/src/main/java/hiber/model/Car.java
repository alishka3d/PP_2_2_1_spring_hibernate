package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    private String model;

    @Column
    private int series;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
    public Car() {}
}
