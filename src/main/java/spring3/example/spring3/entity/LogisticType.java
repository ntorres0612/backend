package spring3.example.spring3.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class LogisticType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "type")
    private String type;
}
