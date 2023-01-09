package spring3.example.spring3.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "license_plate")
    private String licensePlate;
}
