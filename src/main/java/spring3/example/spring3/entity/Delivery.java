package spring3.example.spring3.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Column(name = "date_of_delivery")
    private LocalDate dateOfDelivery;
    @Column(name = "price")
    private double price;
    @Column(name = "number")
    private String number;
    @Column(name = "discount")
    private double discount;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "product_type_id", nullable = true)
    private ProductType productType;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "store_id", nullable = true)
    private Store store;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "truck_id", nullable = true)
    private Truck truck;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id", nullable = true)
    private Customer customer;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "logistics_type_id", nullable = true)
    private LogisticType logisticType;
}
